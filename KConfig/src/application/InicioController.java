package application;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class InicioController implements Initializable {

	private Main main;
	@FXML
	Button validar;
	@FXML
	Button agregar;
	@FXML
	private TextArea contenidoArchivo;
	@FXML
	private ScrollPane scrollPane;
	@FXML
	private TreeView<String> treeView;
	private TreeItem<String> rootItem;
	private TreeItem<String> selectedItem;
	
	public void inicializar() {

		rootItem = new TreeItem<>("Archivos");
		
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
						String stringArchivo = GestionarArchivo
								.toString(new File("src/archivos/"
										+ selectedItem.getValue()));

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

		
		GestionarArchivo.guardar(textoArchivo, file.getName(),"");

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
	private void analizarArchivo() throws IOException {
		Main.showAnalizar(selectedItem.getValue());
	}
	@FXML
	private void eliminarArchivo(){
		
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}
