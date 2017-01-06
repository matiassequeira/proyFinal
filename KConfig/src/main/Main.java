package main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import modelo.Config;
import modelo.Menu;
import modelo.MenuConfig;
import antlr.parserKConfigLexer;
import antlr.parserKConfigParser;
import parser.KConfigToClasses;
import traductorASplot.ClassesToSplot;

import java.io.*;
import java.net.*;

import javax.net.ssl.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import java.security.*;
import java.security.cert.*;

public class Main {
	
	public static Map<String, Config> mapConfigs = new HashMap<String, Config>();
	public static Menu menu;
	public static Map<String, MenuConfig> mapMenuConfig = new HashMap<String, MenuConfig>();
	

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Main.analizar("C:\\Users\\Matias\\git\\proyectoFinal\\KConfig\\"+ "src\\entradasPrueba\\entrada 17-03.txt");
	}*/
	public  ArrayList<String> analizar (String path){
		try {
			//menu=null;



			ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(path));

			// create a lexer that feeds off of input CharStream
			parserKConfigLexer lexer = new parserKConfigLexer(input);

			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);

			// create a parser that feeds off the tokens buffer
			parserKConfigParser parser = new parserKConfigParser(tokens);

			ParseTree tree = parser.inicial(); // begin parsing at inicial rule

			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(new KConfigToClasses(), tree);//le paso el mapconfigs por param?

			//parserSource(fileCleaned);
			
			
			ClassesToSplot splot = new ClassesToSplot();
			ArrayList<String> treeYConstraints= splot.classesToSplot(menu);
			return treeYConstraints;
		  } catch(Exception e){
			System.out.println(e);
		  }
		return null;
		
		}
	


	}
	


