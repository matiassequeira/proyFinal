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
import javafx.scene.control.Label;
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
	
	@FXML
	private Label modelo;
	
	@FXML
	private Label caracteristicasComunes;
	
	@FXML
	private Label caracteristicasMuertas;
	
	@FXML
	private Label configuracionesPosibles;
	
	
	
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
		
		
		// Completar arbol
		String[] textoArchivo = treeYConstraints.get(0).split("\n");
		rootItem = new CheckBoxTreeItem<String>(textoArchivo[0]);
		armarArbolRecursivo(textoArchivo, rootItem, 1);
		
		featureTree.setEditable(true);
		featureTree.setCellFactory(CheckBoxTreeCell.<String>forTreeView());
		
		featureTree.setRoot(rootItem);
		
		//Completar textArea constraints
		constraints.setText(treeYConstraints.get(1));
		
		//Completar tabla
		int[] analisis=SATReasoningExample.run("src/archivos/salida"+archivoSeleccionado+".xml");
		/*
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
		data.add(new DatoAnalisis("Cantidad de configuraciones posibles:",""+analisis[3]));
		
		tabla.setItems(data);
		*/
		if(analisis[0]==1){
			modelo.setText("Consistente");
		}else{
			modelo.setText("Inconsistente");
		}
	
		caracteristicasComunes.setText(""+analisis[1]);
		caracteristicasMuertas.setText(""+analisis[2]);
		configuracionesPosibles.setText(""+analisis[3]);
		
	}
	
	public int armarArbolRecursivo(String[] textoArchivo, CheckBoxTreeItem<String> padre, int i){
		
		for (; i<textoArchivo.length; i++){
			CheckBoxTreeItem<String> item = new CheckBoxTreeItem<String>(textoArchivo[i]);
			if(i+1<textoArchivo.length){
				if(textoArchivo[i].lastIndexOf('\t')<textoArchivo[i+1].lastIndexOf('\t')){
					i= armarArbolRecursivo(textoArchivo, item, i+1);
					item.setValue(item.getValue().replaceAll("\t", ""));
					
					padre.getChildren().add(item);
					if(i+1<textoArchivo.length){
					int t= textoArchivo[i+1].lastIndexOf('\t');
					int z= padre.getValue().lastIndexOf('\t');
					if(t<=z){
						break;
					}}
				}
				else if(textoArchivo[i].lastIndexOf('\t')>textoArchivo[i+1].lastIndexOf('\t')){
					item.setValue(item.getValue().replaceAll("\t", ""));
					padre.getChildren().add(item);
					break;
				}
				else{
					item.setValue(item.getValue().replaceAll("\t", ""));
					padre.getChildren().add(item);
				}
			}
			else{
				item.setValue(item.getValue().replaceAll("\t", ""));
				padre.getChildren().add(item);
			}
        	//CheckBoxTreeItem<String> item = new CheckBoxTreeItem<String>(linea);
			//rootItem.getChildren().add(item);
	    }
		return i;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// TODO Auto-generated method stub
		
	}
}
