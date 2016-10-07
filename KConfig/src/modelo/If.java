package modelo;
import java.util.ArrayList;
import java.util.List;


public class If {
	private List<String> configs = new ArrayList<>();
	private List<Menu> menus = new ArrayList<Menu>();
	private List<String> menuconfigs = new ArrayList<String>();
	private List<Choice> choices = new ArrayList<Choice>();
	private List<If> list_if = new ArrayList<If>();
	private String symbol;
	private boolean negado=false;
	
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
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public boolean isNegado() {
		return negado;
	}
	public void setNegado(boolean negado) {
		this.negado = negado;
	}
	
}
