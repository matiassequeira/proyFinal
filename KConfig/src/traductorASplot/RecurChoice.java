package traductorASplot;
import java.util.List;

import modelo.Choice;
import modelo.Excepcion;

public class RecurChoice {
	
	public static String recurChoice(List<Choice> choices, String nivel) throws Excepcion {
		String cadena="";
		
		int cantidadEspacios= ClassesToSplot.obtenerCantidadGuiones(nivel);
		
		if(!choices.isEmpty()){
		
			for (Choice choice : choices) {
				for(int i=0; i<cantidadEspacios; i++){
					cadena= cadena+'\t';
				}
				String nivelChoice= nivel+"_"+ ++ClassesToSplot.contadorGlobal;	
				
				if (choice.getPrompt()!=null){
					cadena+=":m "+choice.getPrompt().getPrompt()+"("+nivelChoice+") "+ '\n';
				}
				else{
					cadena+=":m choice"+"("+nivelChoice+") "+ '\n';
				}
				
				for(int i=0; i<cantidadEspacios+1; i++){
					cadena= cadena +'\t';
				}
				//String nivgrupo= nivelChoice+"_"+ ++ClassesToSplot.contadorGlobal;
				
				if(choice.isOptional() &&choice.getType()!= null && choice.getType().getValue()!=null && !(Boolean)choice.getType().getValue()){
					if(choice.getType().getType().equals("bool")){
						cadena= cadena+":g [0,1] "+'\n';//es xor de 0..1
						//cadena= cadena+":g ("+ nivgrupo + ") [0,1] "+'\n';//es xor de 0..1
					}
					else if(choice.getType().getType().equals("tristate")){
						cadena= cadena+ ":g [0,*] "+'\n';//es or 0..*
						//cadena= cadena+ ":g ("+ nivgrupo + ") [0,*] "+'\n';//es or 0..*
					}
				}
				else if (choice.getType()!= null){
					if(choice.getType().getType().equals("bool")){
						cadena= cadena+":g [1,1] "+'\n';//es xor de 1..1
						//cadena= cadena+":g ("+ nivgrupo + ") [1,1] "+'\n';//es xor de 1..1
					}
					else if(choice.getType().getType().equals("tristate")){
						cadena= cadena+ ":g [1,*] "+'\n';//es or 1..*
						//cadena= cadena+ ":g ("+ nivgrupo + ") [1,*] "+'\n';//es or 1..*
					}
				}
				else {
					throw new Excepcion("La choice no tiene tipo asignado");
				}
				
				if(choice.getDepends()!=null){
					ArmadorConstraints.armarConstraintDepends(nivelChoice,choice.getDepends());
				}
				
				cadena += RecurConfig.recurConfigs(choice,nivelChoice);
				//cadena += RecurConfig.recurConfigs(choice,nivgrupo);
				
				if(!choice.getChoice().isEmpty()){
					cadena += recurChoice(choice.getChoice(), nivelChoice);
					//cadena += recurChoice(choice.getChoice(), nivgrupo);
				}
			}
		}
		
		return cadena;
	}

}
