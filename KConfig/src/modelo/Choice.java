package modelo;
import java.util.ArrayList;
import java.util.List;


public class Choice {
	private Type type;
	private String symbol;
	private DependsOn depends;
	private Prompt prompt; 
	private Select select;
	private List<Default> defaults = new ArrayList<Default>();
	private List<Choice> list_choice= new ArrayList<Choice>();
	private List<String> list_config= new ArrayList<String>();
	private boolean optional= false;
	

	
	public Select getSelect() {
		return select;
	}
	public void setSelect(Select select) {
		this.select = select;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public DependsOn getDepends() {
		return depends;
	}
	public void setDepends(String depends) {
		this.depends= new DependsOn();
		this.depends.setExpr(depends);
	}
	public Prompt getPrompt() {
		return prompt;
	}
	public void setPrompt(Prompt prompt) {
		this.prompt = prompt;
	}
	public List<Default> getDefaults() {
		return defaults;
	}
	public void setDefault(Default defaul) {
		this.defaults.add(defaul);
	}
	public List<Choice> getChoice() {
		return list_choice;
	}
	public void setChoice(Choice c) {
		this.list_choice.add(c);
	}
	public List<String> getConfig() {
		return list_config;
	}
	public void setConfig(String c) {
		this.list_config.add(c);
	}
	public boolean isOptional() {
		
		return optional;
	}
	public void setOptional(boolean optional) {
		this.optional = optional;
	}

}
