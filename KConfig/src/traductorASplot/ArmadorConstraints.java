package traductorASplot;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import modelo.DependsOn;
import modelo.Excepcion;
import modelo.Select;

public class ArmadorConstraints {

	public static void armarConstraintDepends (String nivel, DependsOn dependsOn) throws Excepcion{
		String constraint="";
		String[] symbolsExpr;
		String exprSinParentesis;
		String agregarAlFinal="";
		
		
		Boolean estaEnElMapa =true;
		/*
		 * Si la constraint necesita una config que no se encuecuentra en el mapa, se agrega a la "lista_constraint_faltantes"
		*/
		
		if (dependsOn.getType()==1){
			if( ClassesToSplot.mapConfigs_MenuConfigs.get(dependsOn.getExpr())!=null){
				constraint = "~"+nivel+" or "+ ClassesToSplot.mapConfigs_MenuConfigs.get(dependsOn.getExpr())+'\n' ;
			}
			else
				estaEnElMapa=false;
		}
		else if(dependsOn.getType()==2){
			
				
			exprSinParentesis= dependsOn.getExpr().replace("(", "");
			exprSinParentesis=exprSinParentesis.replace(")", "");
			exprSinParentesis=exprSinParentesis.replace(" ", "");
			symbolsExpr= exprSinParentesis.split("\\|\\|");
			
			for(int i=0; i<symbolsExpr.length ; i++ ){
				if(ClassesToSplot.mapConfigs_MenuConfigs.get(symbolsExpr[i])==null)
					estaEnElMapa=false;
			}
			
			if(estaEnElMapa){
				constraint = "~"+nivel;
				for(int i=0; i<symbolsExpr.length ; i++ ){
					if(!symbolsExpr[i].startsWith("!")){
						constraint+= " or "+ ClassesToSplot.mapConfigs_MenuConfigs.get(symbolsExpr[i]);
					}
					else{
						constraint+= " or ~"+ClassesToSplot.mapConfigs_MenuConfigs.get(symbolsExpr[i].replace("!", "")) ;
					}
				}
				constraint+='\n';
				
				for(int i=0; i<symbolsExpr.length ; i++ ){
					if(!symbolsExpr[i].startsWith("!")){
						constraint+= nivel + " or ~" + ClassesToSplot.mapConfigs_MenuConfigs.get(symbolsExpr[i])+'\n';
					}
					else{
						constraint+= nivel + " or " + ClassesToSplot.mapConfigs_MenuConfigs.get(symbolsExpr[i].replace("!", ""))+'\n';
					}
					
				}
			}	
		}
		
		else if(dependsOn.getType()==3){
			exprSinParentesis= dependsOn.getExpr().replace("(", "");
			exprSinParentesis=exprSinParentesis.replace(")", "");
			exprSinParentesis=exprSinParentesis.replace(" ", "");
			symbolsExpr= exprSinParentesis.split("\\&\\&");
			
			for(int i=0; i<symbolsExpr.length ; i++ ){
				if(ClassesToSplot.mapConfigs_MenuConfigs.get(symbolsExpr[i])==null)
					estaEnElMapa=false;
			}
			
			if(estaEnElMapa){
				constraint = nivel;
				for(int i=0; i<symbolsExpr.length ; i++ ){
					if(!symbolsExpr[i].startsWith("!")){
						constraint+= " or ~"+ ClassesToSplot.mapConfigs_MenuConfigs.get(symbolsExpr[i]);
					}
					else{
						constraint+= " or "+ClassesToSplot.mapConfigs_MenuConfigs.get(symbolsExpr[i].replace("!", "")) ;
					}
				}
				constraint+='\n';
				
				for(int i=0; i<symbolsExpr.length ; i++ ){
					
					if(!symbolsExpr[i].startsWith("!")){
						constraint+= "~"+nivel + " or " + ClassesToSplot.mapConfigs_MenuConfigs.get(symbolsExpr[i])+'\n';
					}
					else{
						constraint+= "~"+nivel + " or ~" + ClassesToSplot.mapConfigs_MenuConfigs.get(symbolsExpr[i].replace("!", ""))+'\n';
					}
				}
			
			}
		}
		else if(dependsOn.getType()==4){
			List<String> exprFinales = new ArrayList<>();
			exprFinales.add("");
			
			String expresion = distributiva(dependsOn.getExpr());

			symbolsExpr= expresion.split("\\|\\|");
			
			for(int i=0; i<symbolsExpr.length ; i++ ){
				if(ClassesToSplot.mapConfigs_MenuConfigs.get(symbolsExpr[i])==null)
					estaEnElMapa=false;
			}
			
			if(estaEnElMapa){
				for(int i=0; i<symbolsExpr.length ; i++ ){
					
					if(symbolsExpr[i].contains("&&")){
						exprFinales=agregarExpr(exprFinales, symbolsExpr[i].split("\\&\\&"));
						agregarAlFinal+= nivel + " or " +pasarDeAndAOr(symbolsExpr[i])+'\n';
					}
					else{
						exprFinales=agregarExpr(exprFinales, symbolsExpr[i]);
						
						if(!symbolsExpr[i].startsWith("!")){
							agregarAlFinal+= nivel + " or ~"+ ClassesToSplot.mapConfigs_MenuConfigs.get(symbolsExpr[i])+'\n';
						}
						else{
							agregarAlFinal+= nivel+ " or "+ClassesToSplot.mapConfigs_MenuConfigs.get(symbolsExpr[i].replace("!", "")) +'\n';
						}
					}
				}
				
				
				List<String> symbolsEntreAnd = distribuirOrRespectoAnd(dependsOn.getExpr());
	
				for (String string : symbolsEntreAnd) {
					String []  aux= string.split("\\|\\|");
					constraint+= "~"+nivel;
					for (String string2 : aux) {
						if(!string2.startsWith("!")){
							constraint+= " or "+ ClassesToSplot.mapConfigs_MenuConfigs.get(string2);
						}
						else{
							constraint+= " or ~"+ClassesToSplot.mapConfigs_MenuConfigs.get(string2.replace("!", "")) ;
						}
					}
					constraint+='\n';
				}
			}	
		}
		
		else if(dependsOn.getType()==5){
			String auxDepends=dependsOn.getExpr().replace("!", "");
			if(ClassesToSplot.mapConfigs_MenuConfigs.get(auxDepends)!=null){
				constraint= "~"+nivel+" or ~"+ ClassesToSplot.mapConfigs_MenuConfigs.get(auxDepends)+'\n';
			}
			else
				estaEnElMapa=false;
		}
		else{
			throw new Excepcion("Error en metodo constraint");
		}
		String retorn =constraint+agregarAlFinal;
		ClassesToSplot.constraintGlobal+= retorn.replaceAll("~~", "");
		if(!estaEnElMapa){
			List<Object> sublista = new ArrayList<Object>();
			sublista.add(nivel);
			sublista.add(dependsOn);
			ClassesToSplot.constraintDependsFaltantes.add(sublista);
		}
	}
	private static  String distributiva(String expr) {
		String r="";
		for (String s: distribuir(expr, "||")){
			r+=s;
		}
		return r;
	}
	private static  String pasarDeAndAOr(String string) {
		String retorno="";
		String [] expresiones = string.split("\\&\\&");
		if(!expresiones[0].startsWith("!")){
			retorno+= "~"+ ClassesToSplot.mapConfigs_MenuConfigs.get(expresiones[0]);
		}
		else{
			//String aux=expresiones[0].replace("!", "");
			retorno+= ClassesToSplot.mapConfigs_MenuConfigs.get(expresiones[0].replace("!", ""));
		}
		for(int i=1; i<expresiones.length; i++){
			if(!expresiones[i].startsWith("!")){
				retorno+= " or ~"+ ClassesToSplot.mapConfigs_MenuConfigs.get(expresiones[i]);
			}
			else{
				//String aux=expresiones[i].replace("!", "");
				retorno+= " or "+ClassesToSplot.mapConfigs_MenuConfigs.get(expresiones[i].replace("!", ""));
			}
		}
		return retorno;
	}
	private static List<String> distribuir(String s, String operador){
		List<String> retornar=new ArrayList<String>();
		List<String> listaTerminos= getListaTerminos(s, operador);
		for(int i =0; i< listaTerminos.size(); i++){
			String t = listaTerminos.get(i);
			if(t.contains("(")){
				if(t.substring(1, t.length()).contains("(")){
					retornar.addAll(distribuir(t.substring(1, t.length()-1),operador));
				}
				else{
					List<String> subLista = getListaTerminos(t.substring(1, t.length()-1),operador);
					if(subLista.size()<2){
						retornar.addAll(subLista);
					}
					else if(i>0){
							retornar.add(subLista.get(0));
							for(int j=2; j<subLista.size(); j++){
								if(!(subLista.get(j).equals("||")||subLista.get(j).equals("&&"))){
								retornar.add(subLista.get(1));
								retornar.add(listaTerminos.get(i-1));
								retornar.add(subLista.get(j));
								}
							}
					}
					else if(i+1<listaTerminos.size()){
							retornar.add(subLista.get(0));
							retornar.add(listaTerminos.get(i+1));
							
							//retornar.add(listaTerminos.get(i+2));
							for(int j=2; j<subLista.size(); j++){

								if(!(subLista.get(j).equals("||")||subLista.get(j).equals("&&"))){
									
									retornar.add(subLista.get(1));
									retornar.add(subLista.get(j));
									retornar.add(listaTerminos.get(i+1));
									i++;
								}
							}
					}
					else retornar.addAll(subLista);
				}
				
			}
			else  /*if (bandera)*/retornar.add(t);
		}
		return retornar;
	}
	private static List<String> distribuirOrRespectoAnd(String expr){
		List<String> lista = new ArrayList<String>();
		for (String s: getListaTerminos(expr,"&&")){
			if(!s.equals("&&")){
				lista.add(s);
			}
		}
		
		return lista;

	}
	private static List<String> getListaTerminos(String s, String operador){
		List<String> arregloTerminos= new ArrayList<String>();
		Stack<Integer> pila=new Stack<Integer>();
		String termino="";
		String termino_parentesis="";
		s=s.replace(" ", "");
	
		
		for(int i=0; i<s.length();i++){
			if(s.substring(i, i+1).equals("(")){
				if(pila.isEmpty() && !termino_parentesis.equals("")){
						//arregloTerminos.add(termino);
						termino_parentesis="";
					}
				
				pila.push(i);
				termino_parentesis+=s.substring(i, i+1);
			}
			else if (s.substring(i, i+1).equals(")")){
				pila.pop();
				termino_parentesis+=s.substring(i, i+1);
				if(pila.isEmpty()){
					if(termino_parentesis.contains(operador)){
						if(!termino.equals("")){
						arregloTerminos.add(termino);
						termino="";}
						arregloTerminos.add(termino_parentesis);
						termino_parentesis="";
					}
					else{
						termino+=termino_parentesis.substring(1,termino_parentesis.length()-1);
					}
				}
			}
			else if(!pila.isEmpty()){
				termino_parentesis+=s.substring(i, i+1);
			}
			
			else if (s.substring(i, i+1).equals(operador.substring(0, 1))) {
			
				if(!termino.equals("")){
					arregloTerminos.add(termino);
					termino="";
				}
				arregloTerminos.add(s.substring(i, i+2));
				i++;
			}
			else{
				termino+=s.substring(i, i+1);
			}
		}
		if(!termino.equals("")) arregloTerminos.add(termino);
		return arregloTerminos;
	}
	private static  List<String> agregarExpr(List<String> exprFinales, String string) {
		List<String> retorno= new ArrayList<String>();
		for (String expF : exprFinales) {
			if(!expF.isEmpty())
				retorno.add(expF+"||"+ string );
			else
				retorno.add(string);
		}
		return retorno;
	}
	private static  List<String> agregarExpr(List<String> exprFinales, String [] exprAnd) {
		List<String> retorno= new ArrayList<String>();
		
		for (String expF : exprFinales) {
			for(int i=0; i<exprAnd.length; i++){
				retorno.add(expF+"||"+exprAnd[i] );
			}	
		}
		return retorno;
	}
	public static void armarConstraintCondIfSelect(String objetoConfig,	Select select) throws Excepcion {
		String exprSinParentesis;
		String [] symbolsExpr;
		String constraint="";
		
		if(select.getCondicionIf()==null){
			
			if (ClassesToSplot.mapConfigs_MenuConfigs.get(objetoConfig)==null || ClassesToSplot.mapConfigs_MenuConfigs.get(select.getSymbol())==null){
				dejarCondicionSelectParaDespues(objetoConfig,select);
			}
			else{
				constraint+= "~"+ClassesToSplot.mapConfigs_MenuConfigs.get(objetoConfig)+ " or " + ClassesToSplot.mapConfigs_MenuConfigs.get(select.getSymbol())+'\n';
			}
					
		}
		else if(select.getTipoCondIf()==1){
			if(ClassesToSplot.mapConfigs_MenuConfigs.get(select.getCondicionIf())==null || ClassesToSplot.mapConfigs_MenuConfigs.get(objetoConfig)==null || ClassesToSplot.mapConfigs_MenuConfigs.get(select.getSymbol())==null){
				dejarCondicionSelectParaDespues(objetoConfig, select);
			}
			else{
				constraint="~"+ClassesToSplot.mapConfigs_MenuConfigs.get(select.getCondicionIf()) +" or ~"+ClassesToSplot.mapConfigs_MenuConfigs.get(objetoConfig)+" or "+ ClassesToSplot.mapConfigs_MenuConfigs.get(select.getSymbol())+'\n';
			}
			
		}
		else if(select.getTipoCondIf()==2){
			exprSinParentesis= select.getCondicionIf().replace("(", "");
			exprSinParentesis=exprSinParentesis.replace(")", "");
			exprSinParentesis=exprSinParentesis.replace(" ", "");
			symbolsExpr= exprSinParentesis.split("\\|\\|");			
			for(int i=0; i<symbolsExpr.length ; i++ ){
				
				if(ClassesToSplot.mapConfigs_MenuConfigs.get(symbolsExpr[i])==null || ClassesToSplot.mapConfigs_MenuConfigs.get(objetoConfig)==null || ClassesToSplot.mapConfigs_MenuConfigs.get(select.getSymbol())==null){
					select.setCondicionIf(symbolsExpr[i]);
					dejarCondicionSelectParaDespues(objetoConfig,select);
				}
				
				else{				
					if(!symbolsExpr[i].startsWith("!"))
							constraint+= "~"+ClassesToSplot.mapConfigs_MenuConfigs.get(symbolsExpr[i]) +" or ~"+ClassesToSplot.mapConfigs_MenuConfigs.get(objetoConfig)+" or "+ ClassesToSplot.mapConfigs_MenuConfigs.get(select.getSymbol())+'\n';
						
					else
						constraint+= ClassesToSplot.mapConfigs_MenuConfigs.get(symbolsExpr[i]).replace("!", "")+" or ~"+ClassesToSplot.mapConfigs_MenuConfigs.get(objetoConfig)+" or "+ ClassesToSplot.mapConfigs_MenuConfigs.get(select.getSymbol())+'\n';
				}
			}			
		}
		else if(select.getTipoCondIf()==3){
			exprSinParentesis= select.getCondicionIf().replace("(", "");
			exprSinParentesis=exprSinParentesis.replace(")", "");
			exprSinParentesis=exprSinParentesis.replace(" ", "");
			symbolsExpr= exprSinParentesis.split("\\&\\&");
			boolean bandera=true;
			
			if(ClassesToSplot.mapConfigs_MenuConfigs.get(objetoConfig)==null||ClassesToSplot.mapConfigs_MenuConfigs.get(select.getSymbol())==null){
				dejarCondicionSelectParaDespues(objetoConfig,select);
				bandera=false;
			}
			else{
				for(int i=0; i<symbolsExpr.length ; i++ ){
					if(ClassesToSplot.mapConfigs_MenuConfigs.get(symbolsExpr[i])==null){
						dejarCondicionSelectParaDespues(objetoConfig,select);
						bandera=false;
					}	
				}
			}
			if(bandera){
				if(!symbolsExpr[0].startsWith("!")){
					constraint ="~"+ ClassesToSplot.mapConfigs_MenuConfigs.get(symbolsExpr[0]);
				}
				else{
					constraint = ClassesToSplot.mapConfigs_MenuConfigs.get(symbolsExpr[0].replace("!", ""));
				}
				
				for(int i=1; i<symbolsExpr.length ; i++ ){
					if(!symbolsExpr[i].startsWith("!")){
						constraint+= " or ~"+ ClassesToSplot.mapConfigs_MenuConfigs.get(symbolsExpr[i]);
					}
					else{
						constraint+= " or "+ClassesToSplot.mapConfigs_MenuConfigs.get(symbolsExpr[i].replace("!", ""));
					}
				}
				constraint+=" or ~" +ClassesToSplot.mapConfigs_MenuConfigs.get(objetoConfig)+" or " +ClassesToSplot.mapConfigs_MenuConfigs.get(select.getSymbol())+'\n';
			 }		
		}
		
		else if(select.getTipoCondIf()==4){			
			
			String expresion = distributiva(select.getCondicionIf());
			symbolsExpr= expresion.split("\\|\\|");
			
			for(int i=0; i<symbolsExpr.length ; i++ ){
				Select auxSelect= new Select();
				auxSelect.setSymbol(select.getSymbol());
				auxSelect.setCondicionIf(symbolsExpr[i]);
				armarConstraintCondIfSelect(objetoConfig, auxSelect);
			}
		}
		
		else if(select.getTipoCondIf()==5){
			if(ClassesToSplot.mapConfigs_MenuConfigs.get(select.getCondicionIf())==null || ClassesToSplot.mapConfigs_MenuConfigs.get(objetoConfig)==null || ClassesToSplot.mapConfigs_MenuConfigs.get(select.getSymbol())==null){
				dejarCondicionSelectParaDespues(objetoConfig, select);
			}
			else{
				String auxCondIf=select.getCondicionIf().replace("!", "");
				constraint= ClassesToSplot.mapConfigs_MenuConfigs.get(auxCondIf)+" or ~"+ClassesToSplot.mapConfigs_MenuConfigs.get(objetoConfig)+" or "+ ClassesToSplot.mapConfigs_MenuConfigs.get(select.getSymbol())+'\n';
			}
		}		
		else{
			throw new Excepcion("Error en metodo constraint para select");
		}
		
		if(!constraint.equals(""))
			ClassesToSplot.constraintGlobal+= constraint;
	}
	
	private static void dejarCondicionSelectParaDespues(String objetoConfig,Select select) {
		// TODO Auto-generated method stub
		List<Object> aux= new ArrayList<Object>();
		aux.add((String) objetoConfig);
		aux.add((Select) select);
		ClassesToSplot.constraintsSelectFaltantes.add(aux);
		
	}
}
