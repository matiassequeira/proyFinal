package application;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.control.cell.PropertyValueFactory;
import main.Main;
import splar.samples.SATReasoningExample;

public class AnalisisController implements Initializable {
	@FXML
	private TreeView<String> featureTree;
	private CheckBoxTreeItem<String> rootItem;
	
	@FXML
	private TextArea constraints;
	
	@FXML
	private TableView<DatoAnalisis> tabla;
	
	@FXML
	private TableColumn<DatoAnalisis, String> columnaDefinicion;
	
	@FXML
	private TableColumn<DatoAnalisis, String> columnaInformacion;
	
	final ObservableList<DatoAnalisis> data = FXCollections.observableArrayList();
	
	
	
	
	public void cargarAnalisis(String archivoSeleccionado) throws IOException  {
		ArrayList<String> treeYConstraints= Main.analizar("src/archivos/"+archivoSeleccionado);
		//String textoTreeConstraints = treeYConstraints.get(0)+treeYConstraints.get(1);
		String contenidoArchivoXML= "<feature_model name='Analisis variabilidad'>"+'\n'+"<feature_tree>";
		contenidoArchivoXML+='\n'+treeYConstraints.get(0);
		contenidoArchivoXML+="</feature_tree>"+'\n'+"<constraints>";
		int i= 0;
		for(String s: treeYConstraints.get(1).split("\n")){
			contenidoArchivoXML+='\n'+"constraint_"+i+":"+s;
			i++;
		}
		contenidoArchivoXML+="</constraints>"+'\n'+"</feature_model>";
		
		GestionarArchivo.guardar(contenidoArchivoXML, "salida"+archivoSeleccionado,".xml");
		
		String[] textoArchivo = treeYConstraints.get(0).split("\n");
		 
		// En este momento tenemos un array en el que cada elemento es un color.
		
		featureTree.setEditable(true);
		featureTree.setCellFactory(CheckBoxTreeCell.<String>forTreeView());
		rootItem = new CheckBoxTreeItem<String>(textoArchivo[0]);
		for (int iteracion =1; i<textoArchivo.length; iteracion++){
		
        	//CheckBoxTreeItem<String> item = new CheckBoxTreeItem<String>(linea);
			//rootItem.getChildren().add(item);
	    }
		featureTree.setRoot(rootItem);
		
		int[] analisis=SATReasoningExample.run("src/archivos/salida"+archivoSeleccionado+".xml");
		
		columnaDefinicion.setCellValueFactory(
	            new PropertyValueFactory<>("definicion"));
		
		columnaInformacion.setCellValueFactory(
	            new PropertyValueFactory<>("informacion"));
		
		if(analisis[0]==1){
			data.add(new DatoAnalisis("Modelo:","Consistente"));
		}else{
			data.add(new DatoAnalisis("Modelo:","Inconsistente"));
		}
	
		data.add(new DatoAnalisis("Características comunes:",""+analisis[1]));
		data.add(new DatoAnalisis("Características muertas:",""+analisis[2]));
		
		tabla.setItems(data);
		
	}
	
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// TODO Auto-generated method stub
		
	}
}
