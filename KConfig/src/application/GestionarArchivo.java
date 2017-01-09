package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javafx.stage.FileChooser;

public class GestionarArchivo {

	public static File fileChooser() {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Seleccionar archivo");
		//fileChooser.setInitialDirectory(new File("C:/Users/USUARIO/Google Drive/Proyecto Gonzalez-Sequeira/Proyecto/Ejemplos KConfig"));
		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);
		File file=fileChooser.showOpenDialog(MainInterfaz.primaryStage);
		return file;
		
	}
	public static String toString(File file) throws IOException{
		BufferedReader r = new BufferedReader( new FileReader( file ) );  
		String s = "", line = null;
		while ((line = r.readLine()) != null) {
		    s += line +'\n';
		}
		r.close();
		return s;
	}
	public static ArrayList<String> toList(File file) throws IOException{
		BufferedReader r = new BufferedReader( new FileReader( file ) );  
		ArrayList<String> s = new ArrayList<String>();
		String line = null;
		while ((line = r.readLine()) != null) {
		    s.add(line);
		}
		return s;
	}
	public File guardar(String texto, String nombre, String extension) throws IOException{
		BufferedWriter bw;
		File destino = new File(getClass().getResource(nombre+ extension).getPath());
		bw = new BufferedWriter(new FileWriter(destino));
		bw.write(texto);
		bw.close();
		
		return destino;
	}
}
