package parser;
import java.util.Stack;





import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import main.Main;
import modelo.Choice;
import modelo.Config;
import modelo.Default;
import modelo.If;
import modelo.Menu;
import modelo.MenuConfig;
import modelo.Prompt;
import modelo.Select;
import modelo.Type;


public class KConfigToClasses extends KConfig5BaseListener {
	
	private Config config;
	
	private Stack<Object> pila=new Stack<Object>();
	private Choice choice;
	private MenuConfig menuConfig;
	//private boolean bandera_if_menuConfig;
	private If if_menu;
	
	public KConfigToClasses() {
		// TODO Auto-generated constructor stub
		Menu aux= new Menu();
		aux.setWordQuote("Menu Padre");
		pila.push(aux);
		//bandera_if_menuConfig=false;
		Main.menu= aux;
	}
	
	
	@Override public void exitInicial(KConfig5Parser.InicialContext ctx) {
		if(pila.size()==1)
			Main.menu=(Menu)pila.pop();
	}
	
	/*Menu*/
	@Override public void enterMenu_menu_entry(KConfig5Parser.Menu_menu_entryContext ctx) { 
		Menu aux = new Menu();
		aux.setWordQuote(ctx.WORD_QUOTE().getText());
		pila.push(aux);
	}

	@Override public void exitMenu_menu_entry(KConfig5Parser.Menu_menu_entryContext ctx) { 
		Menu hijo = (Menu) pila.pop();
		Object padre = pila.peek();
		if( padre instanceof Menu){
			((Menu) padre).setMenus(hijo);
		
		}
		else if( padre instanceof If){
			((If)padre).setMenus(hijo); 
		}
		
		
	}
	@Override public void exitMenu_option(KConfig5Parser.Menu_optionContext ctx) {
		Menu menu = (Menu)pila.peek();
		if(menu.getDepends()==null)
			menu.setDepends(ctx.expr().getText());
		else{
			menu.setDepends(menu.getDepends()+"&&"+" ("+ctx.expr().getText()+") ");
		}
	}
	
	
	/*Config*/
	@Override public void enterConfig_menu_entry(KConfig5Parser.Config_menu_entryContext ctx) {
		
		config = new Config();
		config.setSymbol(ctx.SYMBOL().getText());
		//System.out.println(config.getSymbol()+"entra a config");
	}
	
	@Override public void exitConfig_menu_entry(KConfig5Parser.Config_menu_entryContext ctx) {
		Object objeto =pila.peek();
		
		if( objeto instanceof Menu){
			((Menu) objeto).setConfigs(config.getSymbol());
		}
		else if( objeto instanceof If){
			((If) objeto).setConfigs(config.getSymbol());
		}
		else if (objeto instanceof Choice){
			((Choice) objeto).setConfig(config.getSymbol());
		}
		Main.mapConfigs.put(config.getSymbol(), config);
		//Main.config=config;
		
	}
	
	@Override public void exitConfig_op_type(KConfig5Parser.Config_op_typeContext ctx) {
		Type type = new Type();
		type.setType(ctx.type().getText());
		
		if(ctx.WORD_QUOTE()!=null){
			Prompt prompt = new Prompt();
			prompt.setPrompt(ctx.WORD_QUOTE().getText());
			if(ctx.if_expr()!=null)
				prompt.setCondicionIf(ctx.if_expr().getChild(1).getText());
			config.setPrompt(prompt);
		}
		config.setType(type);
	}
	
	@Override public void exitConfig_op_depends(KConfig5Parser.Config_op_dependsContext ctx) { 
		if(config.getDepends()==null)
			config.setDepends(ctx.expr().getText());
		else{
			config.setDepends("("+config.getDepends().getExpr()+")&&("+ctx.expr().getText()+") ");
		}
	}
	
	@Override public void exitConfig_op_prompt(KConfig5Parser.Config_op_promptContext ctx) {
		Prompt prompt = new Prompt();
		prompt.setPrompt(ctx.WORD_QUOTE().getText());
		if (ctx.if_expr()!=null)
			prompt.setCondicionIf(ctx.if_expr().getChild(1).getText());
		config.setPrompt(prompt);	
	}
	
	@Override public void exitConfig_op_select(KConfig5Parser.Config_op_selectContext ctx) { 
		Select select =new Select();
		if(ctx.if_expr()!=null)
			select.setCondicionIf(ctx.if_expr().getChild(1).getText());
		select.setSymbol(ctx.SYMBOL().getText());
		config.setSelect(select);
	}
	
	@Override public void exitConfig_op_default(KConfig5Parser.Config_op_defaultContext ctx) {
		
		if(ctx.DEFAULT().getText().equals("default")){
			
			if(ctx.if_expr()!=null){
				Default def = new Default();
				def.setValue(ctx.expr().getText());
				def.setCondicionIf(ctx.if_expr().getChild(1).getText());
				config.setDefault(def);
			}	
			else{
				if(config.getType()==null){
					Type tipo = new Type();
					config.setType(tipo);
				}	
				config.getType().setValue(ctx.expr().getText());
			}
				
				
		}
		else if (ctx.DEFAULT().getText().equals("def_bool")){
			Type type = new Type();
			type.setType("bool");
			
			if(ctx.if_expr()!=null){
				Default def = new Default();
				def.setValue(ctx.expr().getText());
				def.setCondicionIf(ctx.if_expr().getChild(1).getText());
				config.setDefault(def);
			}
			else{
				type.setValue(ctx.expr().getText());
			}
			config.setType(type);
		}
		else if (ctx.DEFAULT().getText().equals("def_tristate")){
			Type type = new Type();
			type.setType("tristate");
			
			if(ctx.if_expr()!=null){
				Default def = new Default();
				def.setValue(ctx.expr().getText());
				def.setCondicionIf(ctx.if_expr().getChild(1).getText());
				config.setDefault(def);
			}	
			else{
				type.setValue(ctx.expr().getText());
			}
			config.setType(type);
		}
	}
	
	
	
	/*Choice */
	@Override public void enterChoice_menu_entry(KConfig5Parser.Choice_menu_entryContext ctx) {
		//System.out.println("entra choice");
		choice= new Choice();
		pila.push(choice);
		
		
		if(ctx.SYMBOL()!=null){
			choice.setSymbol(ctx.SYMBOL().getText());
		}
		choice.setType(new Type());
	}
	
	@Override public void exitChoice_menu_entry(KConfig5Parser.Choice_menu_entryContext ctx) {
		Choice auxChoice;
//System.out.println("sale choice");
		auxChoice= (Choice) pila.pop();
		
		if(auxChoice.getType().getType()==null){
			if(!auxChoice.getConfig().isEmpty()){
				Type t = auxChoice.getType();
				for(String config: auxChoice.getConfig()){
					Config c =Main.mapConfigs.get(config);
					if(c.getType().getType()!=null){
						t.setType(c.getType().getType());
						break;
					}
				}
			auxChoice.setType(t);
			}
		}
		Object objeto =pila.peek();
		if( objeto instanceof Menu){
			((Menu) objeto).setChoices(auxChoice); 
			//System.out.println(auxChoice.getPrompt().getPrompt());
		}
		else if( objeto instanceof If){
			((If) objeto).setChoices(auxChoice);
		}
		
		
		
	}
	
	@Override public void exitChoice_op_type(KConfig5Parser.Choice_op_typeContext ctx) {
		Type type = choice.getType();
		type.setType(ctx.type_choice().getText());
		
		if(ctx.WORD_QUOTE()!=null){
			Prompt prompt = new Prompt();
			prompt.setPrompt(ctx.WORD_QUOTE().getText());
			//System.out.println(prompt.getPrompt());
			choice.setPrompt(prompt);
		}
		choice.setType(type);
		
	}
	
	@Override public void exitChoice_op_depends(KConfig5Parser.Choice_op_dependsContext ctx) {
		if(choice.getDepends()==null)
			choice.setDepends(ctx.expr().getText());
		else{
			choice.setDepends(choice.getDepends()+"&&"+" ("+ctx.expr().getText()+") ");
		}
		//System.out.println("depends");
	}

	
	@Override public void exitChoice_op_prompt(KConfig5Parser.Choice_op_promptContext ctx) {
		Prompt prompt = new Prompt();
		prompt.setPrompt(ctx.WORD_QUOTE().getText());
		if (ctx.if_expr()!=null)
			prompt.setCondicionIf(ctx.if_expr().getChild(1).getText());
		choice.setPrompt(prompt);
		//System.out.println(prompt.getPrompt());
	}
	
	@Override public void exitChoice_op_default(KConfig5Parser.Choice_op_defaultContext ctx) { 
		//System.out.println("defaulttt");
		if(ctx.DEFAULT().getText().equals("default")){
			
			if(ctx.if_expr()!=null){
				Default def = new Default();
				def.setValue(ctx.expr().getText());
				def.setCondicionIf(ctx.if_expr().getChild(1).getText());
				choice.setDefault(def);
			}	
			else{
				choice.getType().setValue(ctx.expr().getText());
				//System.out.println(choice.getType().getValue());
			}
				
				
		}
		else if (ctx.DEFAULT().getText().equals("def_bool")){
			Type type = choice.getType();
			type.setType("bool");
			
			if(ctx.if_expr()!=null){
				Default def = new Default();
				def.setValue(ctx.expr().getText());
				def.setCondicionIf(ctx.if_expr().getChild(1).getText());
				choice.setDefault(def);
			}
			else{
				type.setValue(ctx.expr().getText());
			}
			choice.setType(type);
		}
		else if (ctx.DEFAULT().getText().equals("def_tristate")){
			Type type = choice.getType();
			type.setType("tristate");
			
			if(ctx.if_expr()!=null){
				Default def = new Default();
				def.setValue(ctx.expr().getText());
				def.setCondicionIf(ctx.if_expr().getChild(1).getText());
				choice.setDefault(def);
			}	
			else{
				type.setValue(ctx.expr().getText());
			}
			choice.setType(type);
		}
	}
	
	
	@Override public void exitChoice_op_optional(KConfig5Parser.Choice_op_optionalContext ctx) { 
		choice.setOptional(true);
	}
	
	
	
	/* Menu Config */
	
	@Override public void enterMenuconfig_menu_entry(KConfig5Parser.Menuconfig_menu_entryContext ctx) {
		menuConfig = new MenuConfig();
		
		pila.push(menuConfig);
		
		menuConfig.setSymbol(ctx.SYMBOL().getText());
		
		//bandera_if_menuConfig=true;
		
	}
	
	@Override public void exitMenuconfig_menu_entry(KConfig5Parser.Menuconfig_menu_entryContext ctx) {
		MenuConfig menuConfigAux;
		//bandera_if_menuConfig=false;
		menuConfigAux= (MenuConfig) pila.pop();
		
		Object objeto =pila.peek();
		if( objeto instanceof Menu){
			((Menu) objeto).setMenuconfigs(menuConfigAux.getSymbol());
		}
		else if( objeto instanceof If){
			((If) objeto).setMenuconfigs(menuConfigAux.getSymbol());
		}
	
		Main.mapMenuConfig.put(menuConfigAux.getSymbol(), menuConfigAux);
		
	}

	@Override public void exitMenuconfig_op_type(KConfig5Parser.Menuconfig_op_typeContext ctx) { 
		Type type = new Type();
		type.setType(ctx.type().getText());
		
		if(ctx.WORD_QUOTE()!=null){
			Prompt prompt = new Prompt();
			prompt.setPrompt(ctx.WORD_QUOTE().getText());
			
			menuConfig.setPrompt(prompt);
		}
		menuConfig.setType(type);
	}
	
	@Override public void exitMenuconfig_op_depends(KConfig5Parser.Menuconfig_op_dependsContext ctx) {
		if(menuConfig.getDepends()==null)
			menuConfig.setDepends(ctx.expr().getText());
		else{
			menuConfig.setDepends(menuConfig.getDepends()+"&&"+" ("+ctx.expr().getText()+") ");
		}
	}
	
	@Override public void exitMenuconfig_op_select(KConfig5Parser.Menuconfig_op_selectContext ctx) {
		Select select =new Select();
		if(ctx.if_expr()!=null)
			select.setCondicionIf(ctx.if_expr().getChild(1).getText());
		select.setSymbol(ctx.SYMBOL().getText());
		menuConfig.setSelect(select);
	}
	
	@Override public void exitMenuconfig_op_default(KConfig5Parser.Menuconfig_op_defaultContext ctx) { 
		if(ctx.DEFAULT().getText().equals("default")){
			
			if(ctx.if_expr()!=null){
				Default def = new Default();
				def.setValue(ctx.expr().getText());
				def.setCondicionIf(ctx.if_expr().getChild(1).getText());
				menuConfig.setDefault(def);
			}	
			else{
				menuConfig.getType().setValue(ctx.expr().getText());
			}
		}
	}
	
	@Override public void exitMenuconfig_op_prompt(KConfig5Parser.Menuconfig_op_promptContext ctx) { 
		Prompt prompt = new Prompt();
		prompt.setPrompt(ctx.WORD_QUOTE().getText());
		if (ctx.if_expr()!=null)
			prompt.setCondicionIf(ctx.if_expr().getChild(1).getText());
		menuConfig.setPrompt(prompt);	
	
	}
	


	/* If */
	@Override public void enterIf_menu_entry(KConfig5Parser.If_menu_entryContext ctx) {
		
		/*if_menu = new If();
		if_menu.setSymbol(ctx.SYMBOL().getText());
		pila.push(if_menu);*/
	}

	@Override public void exitIf_menu_entry(KConfig5Parser.If_menu_entryContext ctx) { 
		If ifAux= (If)pila.pop();
		Object objeto =pila.peek();
			if(objeto instanceof MenuConfig){
				((MenuConfig) objeto).setIf(ifAux);
			}
			else if( objeto instanceof Menu){
				((Menu) objeto).setList_if(ifAux);
			}
			else if( objeto instanceof If){
				
				((If) objeto).setList_if(ifAux);
			}
			else{
				System.out.println("Error : Se perdió un IF");
			}
		
	}
	@Override public void enterIf_symbol(KConfig5Parser.If_symbolContext ctx) {
		
		if_menu = new If();
		if_menu.setSymbol(ctx.SYMBOL().getText());
		pila.push(if_menu);
	}

	@Override public void enterIf_symbol_negado(KConfig5Parser.If_symbol_negadoContext ctx) {
		if_menu = new If();
		if_menu.setSymbol(ctx.SYMBOL().getText());
		if_menu.setNegado(true);
		pila.push(if_menu);
		
					
	}

		
}

