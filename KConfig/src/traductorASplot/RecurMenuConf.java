package traductorASplot;
import java.util.ArrayList;
import java.util.List;

import main.Main;
import modelo.Excepcion;
import modelo.If;
import modelo.MenuConfig;
import modelo.Select;

public class RecurMenuConf {
	
	public static String recurMenuConf(List<String> menuconfigs, String nivel) throws Excepcion {
		String cadena="";
		
		int cantidadEspacios= ClassesToSplot.obtenerCantidadGuiones(nivel);
		if(!menuconfigs.isEmpty()){
			
			for (String string : menuconfigs) {
					MenuConfig menu = Main.mapMenuConfig.get(string);
					String nivelMenuConfig= nivel+"_"+ ++ClassesToSplot.contadorGlobal;
						
					for(int i=0; i<cantidadEspacios; i++){
							cadena= cadena+'\t';
					}
					
					if(menu.getPrompt()!=null)
						cadena= cadena + ":o " + string+"("+nivelMenuConfig+") (opcional)"+'\n';//+'\n';
					else
						cadena= cadena + ":m " + string+"("+nivelMenuConfig+") (común)"+'\n';
					ClassesToSplot.mapConfigs_MenuConfigs.put(string, nivelMenuConfig);
					
					if(menu.getIf()!=null){
						List<If> list = new ArrayList<If>();
						list.add(menu.getIf());
						RecurIf.recurIf(list);
					}
					
					if(menu.getDepends()!=null){
						ArmadorConstraints.armarConstraintDepends(nivelMenuConfig, menu.getDepends());
					}
					
					if(!menu.getSelect().isEmpty()){
						for (Select select : menu.getSelect()) {
							ArmadorConstraints.armarConstraintCondIfSelect(menu.getSymbol(), select);							
						}
					}
			}
		}
		return cadena;
	}
}
