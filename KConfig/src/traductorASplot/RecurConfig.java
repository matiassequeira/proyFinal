package traductorASplot;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import main.Main;
import modelo.Choice;
import modelo.Config;
import modelo.Excepcion;
import modelo.Select;

public class RecurConfig {
	
	public static String recurConfigs(List<String> configs, String nivel) throws Excepcion {
		String nivelParaConfig;
		String cadena = "";
		int cantidadEspacios = ClassesToSplot.obtenerCantidadGuiones(nivel);
		
		if(!configs.isEmpty()){
			
			for (String config : configs) {
				for(int i=0; i<cantidadEspacios; i++){
					cadena= cadena+'\t';
				}

				nivelParaConfig= nivel+"_"+ ++ClassesToSplot.contadorGlobal;
				Config objetoConfig = Main.mapConfigs.get(config);
				
				if( (objetoConfig.getType().getType().equals("bool") || objetoConfig.getType().getType().equals("tristate"))){
					cadena= cadena + ":o " + config+"("+nivelParaConfig+") "+'\n';
				}
			
				else{
					cadena= cadena + ":m " + config+"("+nivelParaConfig+") "+'\n';
				}
				
				ClassesToSplot.mapConfigs_MenuConfigs.put(objetoConfig.getSymbol(), nivelParaConfig);
				
				if(objetoConfig.getDepends()!=null){
					ArmadorConstraints.armarConstraintDepends(nivelParaConfig,objetoConfig.getDepends());
				}
				
				
				if(!objetoConfig.getSelect().isEmpty()){
					for (Select select : objetoConfig.getSelect()) {
						ArmadorConstraints.armarConstraintCondIfSelect(objetoConfig.getSymbol(), select);							
					}
				}
			}
		}
		return cadena;
	}

	public static String recurConfigs(Choice choice, String nivel) throws Excepcion {
		// TODO Auto-generated method stub
		int cantidadEspacios = ClassesToSplot.obtenerCantidadGuiones(nivel);
		String cadena="";
		
		if (!choice.getConfig().isEmpty()){
			for (String config : choice.getConfig()) {
				String nivelParaConfig=nivel+"_"+ ++ClassesToSplot.contadorGlobal;
				for(int i=0; i<cantidadEspacios+1; i++){
					cadena= cadena+'\t';
				}
				Config objetoConfig = Main.mapConfigs.get(config);
				cadena+= ": " + config+"("+nivelParaConfig+") "+'\n';
				
				ClassesToSplot.mapConfigs_MenuConfigs.put(objetoConfig.getSymbol(), nivelParaConfig);
				
				if(objetoConfig.getDepends()!=null){
					ArmadorConstraints.armarConstraintDepends(nivelParaConfig,objetoConfig.getDepends());
				}
				
				
				if(!objetoConfig.getSelect().isEmpty()){
					for (Select select : objetoConfig.getSelect()) {
						ArmadorConstraints.armarConstraintCondIfSelect(objetoConfig.getSymbol(), select);							
					}
				}
			}
		}
		return cadena;
	}
	
	

}
