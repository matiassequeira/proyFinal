package traductorASplot;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Dis {
	public static void main(String[] args) {
		String s= "(A || B )&& C";
		String g= distributiva(s);
		System.out.println(g);
	}
	private static  String distributiva(String expr) {
		//Une la lista de distribuir en una String
		String r="";
		for (String s: distribuir(expr)){
			r+=s;
		}
		//System.out.println(r);
		return r;
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
	
	private static List<String> distribuir(String s){
		List<String> retornar=new ArrayList<String>();
		List<String> listaTerminos= getListaTerminos(s, "&&");
		for(String imp : listaTerminos){
			System.out.println(imp);
		}
		boolean bandera = true;
		for(int i =0; i< listaTerminos.size(); i++){
			String t = listaTerminos.get(i);
			if(t.contains("(")){
				if(t.substring(1, t.length()).contains("(")){
					retornar.addAll(distribuir(t.substring(1, t.length()-1)));
				}
				else{
					List<String> subLista = getListaTerminos(t.substring(1, t.length()-1),"&&");
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
							System.out.println(retornar);
							//retornar.add(listaTerminos.get(i+2));
							for(int j=2; j<subLista.size(); j++){
								System.out.println("for"+retornar);
								if(!(subLista.get(j).equals("||")||subLista.get(j).equals("&&"))){
									System.out.println("ifffff"+retornar);
									retornar.add(subLista.get(1));
									retornar.add(subLista.get(j));
									retornar.add(listaTerminos.get(i+1));
									System.out.println("ifffff"+retornar);
									//retornar.add(listaTerminos.get(i+2));
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
	
	/*	private static List<String> getListaTerminos(String s){
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
		for(String imp : listaTerminos){
			System.out.println(imp);
		}
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
							System.out.println(retornar);
							//retornar.add(listaTerminos.get(i+2));
							for(int j=2; j<subLista.size(); j++){
								System.out.println("for"+retornar);
								if(!(subLista.get(j).equals("||")||subLista.get(j).equals("&&"))){
									System.out.println("ifffff"+retornar);
									retornar.add(subLista.get(1));
									retornar.add(subLista.get(j));
									retornar.add(listaTerminos.get(i+1));
									System.out.println("ifffff"+retornar);
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
	}*/
	
}


