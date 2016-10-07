package main;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Prueba {
	public static void main(String[] args) {
		System.out.println(distribuir("(A || c && d) &&  z"));
	
	}
	private static String distributivaaaaa(String s){
		Stack<Integer> pila=new Stack<Integer>();
		String s1="";
		String s2= "";
		String ss;
		String distribuir="";
		String retornar="";
		Boolean banderaS1=true;
		Boolean banderaCierre= true;
		for(int i =0; i< s.length(); i++){
			if(s.substring(i, i+1).equals("(") && banderaCierre){
				if(!pila.isEmpty()){
					distribuir+=s.substring(i, i+1);
				}
				pila.push(i);
				banderaS1=false;
	
			}
			else if(s.substring(i, i+1).equals(")")&& banderaCierre){
				pila.pop();
				if(!pila.isEmpty()){
					distribuir+=s.substring(i, i+1);
				}
				else banderaCierre=false;
				
			}
			else if(banderaS1){
				s1+=s.substring(i, i+1);
			}
			else if(pila.isEmpty()){
				s2+=s.substring(i, i+1);
			}
			else{
				distribuir+=s.substring(i, i+1);
			}
		}
		if(distribuir.contains("(")){
			//distribuir= distributiva(distribuir);
		}
		if(distribuir.contains(" ||")&& (s1.contains("&&") || s2.contains("&&"))){
			distribuir= distribuir.replace(" ", "");
			String[] orDistribuir = distribuir.split("\\|\\|");
			
			for(int i=0 ; i < orDistribuir.length;i++){
				if(s1.equals("")) ss=orDistribuir[i]+s2;
				else ss= s1+orDistribuir[i];
				if(retornar.equals("")){
					retornar= ss;
				}
				else retornar+= "||"+ss;
			}
			
		}
		else{
			retornar=s1+distribuir;
		}
		retornar += s2;
		//if(s2.contains("(")) retornar= distributiva(retornar);
		return retornar;
	}


	private static List<String> getListaTerminos(String s){
		List<String> arregloTerminos= new ArrayList<String>();
		Stack<Integer> pila=new Stack<Integer>();
		String termino="";
		s=s.replace(" ", "");
	
		
		for(int i=0; i<s.length();i++){
			if(s.substring(i, i+1).equals("(")){
				if(pila.isEmpty() && !termino.equals("")){
						arregloTerminos.add(termino);
						termino="";
					}
				
				pila.push(i);
				termino+=s.substring(i, i+1);
			}
			else if (s.substring(i, i+1).equals(")")){
				pila.pop();
				termino+=s.substring(i, i+1);
				if(pila.isEmpty()){
					arregloTerminos.add(termino);
					termino="";
				}
			}
			else if(!pila.isEmpty()){
				termino+=s.substring(i, i+1);
			}
			else if (s.substring(i, i+1).equals("|")) {
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
	
	private static List<String> distribuir(String s){
		List<String> retornar=new ArrayList<String>();
		List<String> listaTerminos= getListaTerminos(s);
		boolean bandera = true;
		for(int i =0; i< listaTerminos.size(); i++){
			String t = listaTerminos.get(i);
			if(t.contains("(")){
				if(t.substring(1, t.length()).contains("(")){
					retornar.addAll(distribuir(t.substring(1, t.length()-1)));
				}
				else{
					List<String> subLista = getListaTerminos(t.substring(1, t.length()-1));
					if(subLista.size()<2){
						retornar.addAll(subLista);
					}
					else if(i>0){
							retornar.add(subLista.get(0));
							
							for(int j=2; j<subLista.size(); j++){
								if(!(subLista.get(j).equals("||")||subLista.get(j).equals("&&"))){
								retornar.add(subLista.get(1));
								//retornar.add(listaTerminos.get(i-2));
								retornar.add(listaTerminos.get(i-1));
								retornar.add(subLista.get(j));
							}}
						}
					
					else if(i+1<listaTerminos.size()){
							bandera= false;
							retornar.add(subLista.get(0));
							retornar.add(listaTerminos.get(i+1));
							//retornar.add(listaTerminos.get(i+2));
							for(int j=2; j<subLista.size(); j++){
								if(!(subLista.get(j).equals("||")||subLista.get(j).equals("&&"))){
									retornar.add(subLista.get(1));
									retornar.add(subLista.get(j));
									retornar.add(listaTerminos.get(i+1));
									//retornar.add(listaTerminos.get(i+2));
								
								}
							}
							
						
					}
					else retornar.addAll(subLista);
				}
				
			}
			else  if (bandera)retornar.add(t);
		}
		
		return retornar;
	}
	
	private static void imprimir(List<String> lista){
		for(String s: lista){
			System.out.println(s);
		}
	}

}



