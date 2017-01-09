package traductorASplot;
import java.util.List;

import modelo.Excepcion;
import modelo.Menu;

public class RecurMenu {
	
	public static void recurMenu(List<Menu> menus, String nivel) throws Excepcion {
		String nivelMenu,cadena="";
			
		int cantidadEspacios= ClassesToSplot.obtenerCantidadGuiones(nivel);
		
		if(!menus.isEmpty()){
			for (Menu menu : menus) {
								nivelMenu= nivel+"_"+ ++ClassesToSplot.contadorGlobal;
				for(int i=0; i<cantidadEspacios; i++){
					cadena= cadena+'\t';
				}
				
				cadena= cadena + ":m " + menu.getWordQuote() + "(" + nivelMenu +") (común)" +'\n';
				
				cadena+= RecurConfig.recurConfigs(menu.getConfigs(), nivelMenu);
				cadena+= RecurChoice.recurChoice(menu.getChoices(), nivelMenu);
				cadena+=RecurMenuConf.recurMenuConf(menu.getMenuconfigs(), nivelMenu);
				
				ClassesToSplot.cadenaGlobal+=cadena;
				recurMenu(menu.getMenus(), nivelMenu);
				
				RecurIf.recurIf(menu.getList_if());
				
				
				if(menu.getDepends()!=null){	
					ArmadorConstraints.armarConstraintDepends(nivelMenu, menu.getDepends());
				}
			}
		}
		
	}	
}
