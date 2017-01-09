package application;
	

import java.io.File;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class MainInterfaz extends Application {
	
	static Stage primaryStage;
	private static Scene scene;
	@Override
	public void start(Stage priStage) {
		try {
			
			primaryStage = priStage;
			//BorderPane root = new BorderPane();
			
			FXMLLoader loader= new FXMLLoader(getClass().getResource("Inicio-v2.fxml"));
			Parent root = loader.load();
			
			InicioController inicioController= (InicioController)loader.getController();
			inicioController.inicializar();
			
			scene = new Scene(root,800,600);
			
			scene.getStylesheets().add(getClass().getResource("estilo.css").toExternalForm());
			Image image = new Image(new File("src/imagen/iconoRec.png").toURI().toString());
			
			primaryStage.setTitle("Variabilidad de Líneas de Productos de Software");
			primaryStage.setMinHeight(450);
			primaryStage.setMinWidth(500);
			primaryStage.setScene(scene);
			primaryStage.getIcons().add(image);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void pantallaInicio() {
		try{
			FXMLLoader loader= new FXMLLoader(MainInterfaz.class.getResource("Inicio-v2.fxml"));
			Parent root = loader.load();
			InicioController inicioController= (InicioController)loader.getController();
			inicioController.inicializar();
			scene.setRoot(root);
			primaryStage.setScene(scene);
			
			primaryStage.show();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void showAnalizar(String archivoSeleccionado) {
		try{
		FXMLLoader loader= new FXMLLoader(MainInterfaz.class.getResource("Analisis-v2.fxml"));
		Parent root = (Parent)loader.load();
		
		
		AnalisisController analisisController = (AnalisisController)loader.getController();
		
		scene.setRoot(root);
		
		//Scene scene = new Scene(root,800,600);
		//scene.getStylesheets().add(Main.class.getResource("estilo.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		analisisController.cargarAnalisis(archivoSeleccionado);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void eliminarEstaFuncion(){
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
