package application;
	

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	static Stage primaryStage;
	@Override
	public void start(Stage priStage) {
		try {
			
			primaryStage = priStage;
			//BorderPane root = new BorderPane();
			
			FXMLLoader loader= new FXMLLoader(getClass().getResource("Inicio-v2.fxml"));
			Parent root = loader.load();
			
			InicioController inicioController= (InicioController)loader.getController();
			inicioController.inicializar();
			
			Scene scene = new Scene(root,800,600);
			scene.getStylesheets().add(getClass().getResource("estilo.css").toExternalForm());
			primaryStage.setScene(scene);
			
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void showAnalizar(String archivoSeleccionado) throws IOException{
		FXMLLoader loader= new FXMLLoader(Main.class.getResource("Analisis-v1.fxml"));
		Parent root = (Parent)loader.load();
		
		
		AnalisisController analisisController = (AnalisisController)loader.getController();
		analisisController.cargarAnalisis(archivoSeleccionado);
		
		Scene scene = new Scene(root,800,600);
		scene.getStylesheets().add(Main.class.getResource("estilo.css").toExternalForm());
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	public void eliminarEstaFuncion(){
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
