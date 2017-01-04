package traductorASplot;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelo.DependsOn;
import modelo.Excepcion;
import modelo.If;
import modelo.Menu;
import modelo.Select;

public class ClassesToSplot {

	public static int contadorGlobal;
	public static Map<String, String> mapConfigs_MenuConfigs;
	public static String constraintGlobal;
	public static List<List<Object>> constraintDependsFaltantes;
	public static List<List<Object>> constraintsSelectFaltantes;
	public  static String cadenaGlobal;	
	public static List<If> objetosIfFaltantes;

	public ArrayList<String> classesToSplot(Menu principal) throws Excepcion{
		contadorGlobal=5;
		constraintGlobal="";
		mapConfigs_MenuConfigs = new HashMap<String, String>();
		constraintDependsFaltantes= new ArrayList<List<Object>>();
		constraintsSelectFaltantes= new ArrayList<List<Object>>();
		objetosIfFaltantes = new ArrayList<>();
		cadenaGlobal= ":r "+ principal.getWordQuote()+ "(_r) " + '\n';
		cadenaGlobal+=RecurConfig.recurConfigs(principal.getConfigs(), "_r");
		cadenaGlobal+=RecurChoice.recurChoice(principal.getChoices(), "_r");
		RecurMenu.recurMenu(principal.getMenus(), "_r");
		cadenaGlobal+=RecurMenuConf.recurMenuConf(principal.getMenuconfigs(), "_r");
		RecurIf.recurIf(principal.getList_if());
					
		List<List<Object>> aux = new ArrayList<>();
		aux.addAll(constraintDependsFaltantes);
		for (List<Object> subLista : aux) {
			ArmadorConstraints.armarConstraintDepends((String) subLista.get(0), (DependsOn) subLista.get(1));
		}
		aux.clear();
		aux.addAll(constraintsSelectFaltantes);
		for (List<Object> subLista : aux) {
			ArmadorConstraints.armarConstraintCondIfSelect((String)subLista.get(0), (Select) subLista.get(1));
		}
		
		
		List<If> auxiliar= new ArrayList<>();
		auxiliar.addAll(objetosIfFaltantes);
		while (!auxiliar.isEmpty()){
			RecurIf.recurIf(auxiliar);
			objetosIfFaltantes.removeAll(auxiliar);
			auxiliar.clear();
			auxiliar.addAll(objetosIfFaltantes);
		}
		ArrayList<String> retornar = new ArrayList<String>();
		retornar.add(cadenaGlobal);
		retornar.add(constraintGlobal);
		return retornar;
	}

	public static int obtenerCantidadGuiones(String nivel) throws Excepcion {
		// TODO Auto-generated method stub
		int retorno=0;
		for (int i = 0; i < nivel.length(); i++) {
			if(nivel.charAt(i)=='_')
				retorno ++;
		}
		if(retorno == -1)
			throw new Excepcion("El retorno es -1");
		return retorno;
	}
}