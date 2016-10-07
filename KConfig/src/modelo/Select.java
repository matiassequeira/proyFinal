package modelo;

public class Select {

	String symbol;
	String condicionIf;
	int tipoCondIf;
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getCondicionIf() {
		return condicionIf;
	}
	
	public void setCondicionIf(String expr) {
		if( expr.contains("||")){
			if(expr.contains("&&")){
				tipoCondIf=4;
			}
			else{
				tipoCondIf= 2;
			}
		}
		else if(expr.contains("&&")){
			tipoCondIf=3;
		}
		else if(expr.contains("!")){
			tipoCondIf=5;
		}
		else{
			tipoCondIf=1;
		}
		this.condicionIf = expr;
		
	}
	public int getTipoCondIf() {
		return tipoCondIf;
	}
	public void setTipoCondIf(int tipoCondIf) {
		this.tipoCondIf = tipoCondIf;
	}

	
}
