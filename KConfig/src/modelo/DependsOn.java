package modelo;

public class DependsOn {
	private String expr;
	private int type; // 1=unary	2=or	3=and	4=and y or 5= !
	
	
	 
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getExpr() {
		return expr;
	}
	public void setExpr(String expr) {
		if( expr.contains("||")){
			if(expr.contains("&&")){
				type=4;
			}
			else{
				type= 2;
			}
		}
		else if(expr.contains("&&")){
			type=3;
		}
		else if(expr.contains("!")){
			type=5;
		}
		else{
			type=1;
		}
		this.expr = expr;
		
	}

}
