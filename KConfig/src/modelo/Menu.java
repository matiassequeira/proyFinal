package modelo;
import java.util.ArrayList;
import java.util.List;

import main.Main;


public class Menu {

	private List<String> configs = new ArrayList<>();
	private List<Menu> menus = new ArrayList<Menu>();
	private List<String> menuconfigs = new ArrayList<String>();
	private String wordQuote;
	private List<Choice> choices = new ArrayList<Choice>();
	private List<If> list_if = new ArrayList<If>();
	private DependsOn depends;
	//private Menu menuPadre;
	
	public List<String> getConfigs() {
		return configs;
	}
	public void setConfigs(String config) {
		this.configs.add(config);
	}
	public List<Menu> getMenus() {
		return menus;
	}
	public void setMenus(Menu menu) {
		this.menus.add(menu);
	}
	public List<String> getMenuconfigs() {
		return menuconfigs;
	}
	public void setMenuconfigs(String menuconfig) {
		this.menuconfigs.add(menuconfig);
	}
	/*public Menu getMenuPadre() {
		return menuPadre;
	}
	public void setMenuPadre(Menu menuPadre) {
		this.menuPadre = menuPadre;
	}*/
	public String getWordQuote() {
		return wordQuote;
	}
	public void setWordQuote(String wordQuote) {
		this.wordQuote = wordQuote;
	}
	public List<Choice> getChoices() {
		return choices;
	}
	public void setChoices(Choice choice) {
		this.choices.add(choice);
	}
	public List<If> getList_if() {
		return list_if;
	}
	public void setList_if(If i) {
		this.list_if.add(i); ;
	}
	public DependsOn getDepends() {
		return depends;
	}
	public void setDepends(String depends) {
		this.depends= new DependsOn();
		this.depends.setExpr(depends);
	}
	public void setearAtributosIfNegado(If ifAux) {
		// TODO Auto-generated method stub
		for (Choice choice : ifAux.getChoices()) {
			if(choice.getDepends()==null)
				choice.setDepends(choice.getSymbol());
			else{
				choice.setDepends(choice.getDepends()+"&&"+" ("+choice.getSymbol()+") ");
			}
		}
		
		for (String config : ifAux.getConfigs()) {
			Config objetoConfig= Main.mapConfigs.get(config);
			if(objetoConfig.getDepends()==null)
				objetoConfig.setDepends(objetoConfig.getSymbol());
			else{
				objetoConfig.setDepends(objetoConfig.getDepends()+"&&"+" ("+objetoConfig.getSymbol()+") ");
			}
		}
	}
	
	
}
