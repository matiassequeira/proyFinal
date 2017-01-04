package application;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class InicioController implements Initializable {

	private MainInterfaz main;
	@FXML
	Button validar;
	@FXML
	Button agregar;
	@FXML
	Button eliminar;
	@FXML
	private TextArea contenidoArchivo;
	@FXML
	private ScrollPane scrollPane;
	@FXML
	private TreeView<String> treeView;
	private TreeItem<String> rootItem;
	private TreeItem<String> selectedItem;
	
	@FXML
	private ImageView icono;
	
	public void inicializar() {
		 Image image = new Image(new File("src/imagen/iconoRec.png").toURI().toString());
		 icono.setImage(image);
		rootItem = new TreeItem<>("Archivos");
		rootItem.setExpanded(true);
        File folder = new File("src/archivos/");
        File[] listOfFiles = folder.listFiles(); 

        for (File file: listOfFiles){
        	TreeItem<String> item = new TreeItem<>(file.getName());
			rootItem.getChildren().add(item);
			treeView.setRoot(rootItem);
	    }
        treeView.getSelectionModel().selectedItemProperty()
		.addListener(new ChangeListener<TreeItem<String>>() {

			@Override
			public void changed(
					ObservableValue<? extends TreeItem<String>> observable,
					TreeItem<String> old_val, TreeItem<String> new_val) {
				// TODO Auto-generated method stub
				if (old_val == null
						|| old_val.getValue() != new_val.getValue()) {
					selectedItem = (TreeItem<String>) new_val;

					System.out.println("Selected Text : "
							+ selectedItem.getValue());
					try {
						File archivoMostrar = new File("src/archivos/"
								+ selectedItem.getValue());
						String stringArchivo = GestionarArchivo
								.toString(archivoMostrar);
					
						contenidoArchivo.setText(stringArchivo);

					} catch (Exception e) {

					}
				}
			}

		});

	}

	@FXML
	private void agregarArchivo() throws IOException {

		File file = GestionarArchivo.fileChooser();

		String textoArchivo = GestionarArchivo.toString(file);
		contenidoArchivo.setText(textoArchivo);

		
		GestionarArchivo.guardar(textoArchivo, "src/archivos/"+file.getName(),"");

		TreeItem<String> item = new TreeItem<>(file.getName());
		rootItem.getChildren().add(item);
		treeView.setRoot(rootItem);
		
		// scrollPane.setHmax(100.0);
		// scrollPane.setVmax(100.0);
		// scrollPane.setPrefSize(10.0, 100.0);
		// contenidoArchivo.setText(file.);
		// textArea.setText(archivo.toString());
	}

	@FXML
	private void analizarArchivo(){
		MainInterfaz.showAnalizar(selectedItem.getValue());
	}
	@FXML
	private void eliminarArchivo(){
		
		Alert confirmacion = new Alert(AlertType.CONFIRMATION);
		
		confirmacion.setTitle("Confirmación");
		confirmacion.setHeaderText("Eliminar");
		confirmacion.setContentText("¿Desea eliminar "+ selectedItem.getValue()+"?");
		
		setEstiloAlert(confirmacion);

		Optional<ButtonType> result = confirmacion.showAndWait();
		if (result.get() == ButtonType.OK){
			File fichero = new File("src/archivos/"+selectedItem.getValue());
		
			if (fichero.delete()){
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Éxito");
				alert.setHeaderText(null);
				alert.setContentText(selectedItem.getValue() + " se eliminó");
				setEstiloAlert(alert);
				alert.showAndWait();
				inicializar();
			}else{
				Alert alertError = new Alert(AlertType.ERROR);
				alertError.setTitle("Error");
				alertError.setHeaderText(null);
				alertError.setContentText(selectedItem.getValue() +" no puede ser eliminado");
				setEstiloAlert(alertError);
				alertError.showAndWait();
			}
			
			
		} else {
		    // ... user chose CANCEL or closed the dialog
		}
	}
	private void setEstiloAlert(Alert alert) {
		Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
		Image image = new Image(new File("src/imagen/iconoRec.png").toURI().toString());
		stage.getIcons().add(image);
		DialogPane dialogPane = alert.getDialogPane();
		dialogPane.getStylesheets().add(
		   getClass().getResource("estilo.css").toExternalForm());
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}
