package traductorASplot;
import java.util.ArrayList;
import java.util.List;

import modelo.Excepcion;
import modelo.If;

public class RecurIf {
	public static void recurIf(List<If> listaIf) throws Excepcion{

		String niveles,cadena="";
		if(!listaIf.isEmpty()){

			for(If objetoIf:listaIf ){
				if(ClassesToSplot.mapConfigs_MenuConfigs.get(objetoIf.getSymbol())!=null){
					
					niveles= ClassesToSplot.mapConfigs_MenuConfigs.get(objetoIf.getSymbol());
					String s =ClassesToSplot.mapConfigs_MenuConfigs.get(objetoIf.getSymbol());
					//codigo 21-03
					if(ClassesToSplot.cadenaGlobal.contains(s)){
						String[] cadena_div = ClassesToSplot.cadenaGlobal.split(s);
					
						cadena=cadena_div[0]+ClassesToSplot.mapConfigs_MenuConfigs.get(objetoIf.getSymbol())+ ") "+'\n';
					
						
						cadena+=RecurConfig.recurConfigs(objetoIf.getConfigs(), niveles);
						cadena+=RecurChoice.recurChoice(objetoIf.getChoices(), niveles);
						cadena+= RecurMenuConf.recurMenuConf(objetoIf.getMenuconfigs(), niveles);
						ClassesToSplot.cadenaGlobal=cadena;
						
						RecurMenu.recurMenu(objetoIf.getMenus(), niveles);
						
						ClassesToSplot.cadenaGlobal= ClassesToSplot.cadenaGlobal.substring(0, ClassesToSplot.cadenaGlobal.length()-1);
						recurIf(objetoIf.getList_if());
						
						for(int i=1; i< cadena_div.length;i++)
							ClassesToSplot.cadenaGlobal+= cadena_div[i].substring(1, cadena_div[i].length());
						
					}	
					else{
						dejarProcesamientoIfParaDespues(objetoIf);
					}
					
				}
				else{
					throw new Excepcion("No debería haber entrado. RecurIf");
				}
			}
		}
	}

	private static void dejarProcesamientoIfParaDespues(If objetoIf) {
		// TODO Auto-generated method stub		
		ClassesToSplot.objetosIfFaltantes.add(objetoIf);
		
	}
}
