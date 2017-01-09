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
		validar.setDisable(true);
		eliminar.setDisable(true);
		 Image image = new Image(new File(getClass().getResource("/imagen/iconoRec.png").getPath()).toURI().toString());
		 icono.setImage(image);
		 ImageView mv = new ImageView();
		 Image img = new Image(new File(getClass().getResource("/imagen/carpeta7.png").getPath()).toURI().toString());
		 mv.setFitHeight(25.0);
		 mv.setFitWidth(25.0);
				
		 
         mv.setImage(img);
         
		rootItem = new TreeItem<>("Archivos");
		rootItem.setExpanded(true);
		rootItem.setGraphic(mv);
        File folder = new File(getClass().getResource("/archivos/").getPath());
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
						if(selectedItem.getValue()!="Archivos"){
							File archivoMostrar = new File(getClass().getResource("/archivos/"+selectedItem.getValue()).getPath());
							String stringArchivo = GestionarArchivo
									.toString(archivoMostrar);
						
							contenidoArchivo.setText(stringArchivo);
							validar.setDisable(false);
							eliminar.setDisable(false);
						
						}
						else{
							validar.setDisable(true);
							eliminar.setDisable(true);
						}

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

		
		new GestionarArchivo().guardar(textoArchivo, "/archivos/"+file.getName(),"");

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

		Image icon = new Image(new File(getClass().getResource("/imagen/preg-rosa.png").getPath()).toURI().toString());
		setEstiloAlert(confirmacion,icon);

		Optional<ButtonType> result = confirmacion.showAndWait();
		if (result.get() == ButtonType.OK){
			File fichero = new File(getClass().getResource("/archivos/"+selectedItem.getValue()).getPath());
		
			if (fichero.delete()){
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Éxito");
				alert.setHeaderText(null);
				alert.setContentText(selectedItem.getValue() + " se eliminó");
				Image iconAlert = new Image(new File(getClass().getResource("/imagen/alert-rosa.png").getPath()).toURI().toString());
						
				setEstiloAlert(alert,iconAlert);
				alert.showAndWait();
				inicializar();
			}else{
				Alert alertError = new Alert(AlertType.ERROR);
				alertError.setTitle("Error");
				alertError.setHeaderText(null);
				alertError.setContentText(selectedItem.getValue() +" no puede ser eliminado");
				Image iconError = new Image(new File(getClass().getResource("/imagen/cruz-rosa.png").getPath()).toURI().toString());
				setEstiloAlert(alertError, iconError);
				
				alertError.showAndWait();
			}
			
			
		} else {
		    // ... user chose CANCEL or closed the dialog
		}
	}
	private void setEstiloAlert(Alert alert, Image imagenIcon) {
		Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
		Image image = new Image(new File(getClass().getResource("/imagen/iconoRec.png").getPath()).toURI().toString());
				
		stage.getIcons().add(image);
		DialogPane dialogPane = alert.getDialogPane();
		dialogPane.getStylesheets().add(
		   getClass().getResource("estiloAlert.css").toExternalForm());
		
		ImageView icon = new ImageView(imagenIcon);
		dialogPane.setGraphic(icon);
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}
