package main;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import modelo.Config;
import modelo.Menu;
import modelo.MenuConfig;
import parser.KConfig5Lexer;
import parser.KConfig5Parser;
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try {
			
			InputStream is= new FileInputStream("entrada 17-03.txt");

			ANTLRInputStream input = new ANTLRInputStream(is);

			// create a lexer that feeds off of input CharStream
			KConfig5Lexer lexer = new KConfig5Lexer(input);

			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);

			// create a parser that feeds off the tokens buffer
			KConfig5Parser parser = new KConfig5Parser(tokens);

			ParseTree tree = parser.inicial(); // begin parsing at inicial rule

			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(new KConfigToClasses(), tree);//le paso el mapconfigs por param?

			//parserSource(fileCleaned);
			
			
			ClassesToSplot splot = new ClassesToSplot();
			String s= splot.classesToSplot(menu);
			System.out.println(s);
		  } catch(Exception e){
			System.out.println(e);
		  }
		
		}
	}
	


