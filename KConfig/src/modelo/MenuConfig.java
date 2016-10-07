package modelo;
import java.util.ArrayList;
import java.util.List;


public class MenuConfig {
	private If if_config;
	private List<Default> defaults = new ArrayList<Default>();
	private DependsOn depends;
	private Type type;
	private List<Select> select=new ArrayList<Select>();
	private String symbol;
	private Prompt prompt;
	
	public If getIf() {
		return if_config;
	}
	public void setIf(If i) {
		this.if_config=i ;
	}
	public List<Select> getSelect() {
		return select;
	}
	public void setSelect(Select select) {
		this.select.add(select);
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
	public List<Default> getDefaults() {
		return defaults;
	}
	public void setDefault(Default defaul) {
		this.defaults.add(defaul);
	}
	public Prompt getPrompt() {
		return prompt;
	}
	public void setPrompt(Prompt prompt) {
		this.prompt = prompt;
	}
	
}
