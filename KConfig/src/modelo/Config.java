package modelo;
import java.util.ArrayList;
import java.util.List;

public class Config {
	private Type type;
	private String symbol;
	private DependsOn depends;
	private Prompt prompt; 
	private List<Select> selects=new ArrayList<Select>();
	private List<Default> defaults = new ArrayList<Default>();
	
	//private List<Select> selects;
	//private Object defa;

	
	public List<Select> getSelect() {
		return selects;
	}
	public void setSelect(Select select) {
		this.selects.add(select);
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
			

}
