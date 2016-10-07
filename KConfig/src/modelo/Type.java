package modelo;
public class Type {

	private Object type;
	private Object value;
	
	
	public Object getType() {
		return type;
	}
	public void setType(Object type) {
		this.type = type;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		if(value.equals((String) "y")){
			this.value=true;
		}
		else if(value.equals((String) "n")){
			this.value=false;
		}
		else{
			this.value = value;
		}
		
	}	
}
