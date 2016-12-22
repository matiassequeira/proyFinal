package application;

import javafx.beans.property.SimpleStringProperty;

public class DatoAnalisis {
	    private final SimpleStringProperty definicion;
	    private final SimpleStringProperty informacion;
	    
	    public DatoAnalisis(String def, String info) {
	        this.definicion = new SimpleStringProperty(def);
	        this.informacion = new SimpleStringProperty(info);
	    }

		public String getDefinicion() {
			return definicion.get();
		}

		public String getInformacion() {
			return informacion.get();
		}
		public void setInformacion(String s) {
			informacion.set(s);
		}
		public void setDefinicion(String s) {
			definicion.set(s);
		}
}
