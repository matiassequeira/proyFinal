package application;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.swing.event.ChangeListener;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.CheckBoxTreeItem.TreeModificationEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TouchEvent;
import javafx.util.Callback;
import main.Main;
import splar.samples.ItemFeature;
import splar.samples.SATConfigurationExample;
import splar.samples.SATReasoningExample;

public class AnalisisController implements Initializable {
	@FXML
	private CheckBox checkAutocompletar;
	@FXML
	private TreeView<ItemFeature> featureTree;
	private CheckBoxTreeItem<ItemFeature> rootItem;	
	@FXML
	private TextArea constraints;
	@FXML
	private TextArea resultadoValidarProducto;
	private String archivoSeleccionado;
	private Map<String, ItemFeature> mapaItemFeature = new HashMap<String, ItemFeature>();
	//final ObservableList<DatoAnalisis> data = FXCollections.observableArrayList();
	@FXML
	private Label configProducto;
	@FXML
	private Label contradicciones;
	@FXML
	private Label modelo;
	@FXML
	private Label caracteristicasComunes;	
	@FXML
	private Label caracteristicasMuertas;	
	@FXML
	private Label configuracionesPosibles;
	@FXML
	private ImageView icono;
	
	private boolean habilitarSelect;
	private boolean indefinido;
	private boolean autocompletar;
	
	public void cargarAnalisis(String archivoSeleccionado) throws IOException  {
		Image image = new Image(new File("src/imagen/iconoRec.png").toURI().toString());
		 icono.setImage(image);
		this.archivoSeleccionado= archivoSeleccionado;
		Main main= new Main();
		ArrayList<String> treeYConstraints= main.analizar("src/archivos/"+archivoSeleccionado);
		
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
		
		GestionarArchivo.guardar(contenidoArchivoXML, "src/archivosSalida/salida"+archivoSeleccionado,".xml");
		
		
		// Completar arbol
		String[] textoArchivo = treeYConstraints.get(0).split("\n");
		ItemFeature root = new ItemFeature(textoArchivo[0], obtenerClave(textoArchivo[0]));
		rootItem = new CheckBoxTreeItem<ItemFeature>(root);
		
		rootItem.setIndependent(true);
		mapaItemFeature.put(obtenerClave(textoArchivo[0]),root);
		armarArbolRecursivo(textoArchivo, rootItem, 1);
		
		featureTree.setEditable(true);
		
		
		//featureTree.setCellFactory(CheckBoxTreeCell.<ItemFeature>forTreeView());
		featureTree.setCellFactory((item) -> {
		    return new CheckBoxTreeCell<ItemFeature>(){

		        @Override
		        public void updateItem(ItemFeature item, boolean empty) {
		            super.updateItem(item, empty);
		            
		            if(item != null) {
		            	
		                this.disableProperty().unbind();
		                CheckBoxTreeItem<ItemFeature> value = (CheckBoxTreeItem<ItemFeature>) treeItemProperty().getValue();
		                this.disableProperty().bind(value.getValue().disabledProperty());
		                
		                
		               
		                
		            }
		        }
		    };
		});
		
		featureTree.setRoot(rootItem);
		habilitarSelect=true;
		indefinido=true;
		autocompletar=false;
		setEventoArbol();
		/*rootItem.addEventHandler(CheckBoxTreeItem.checkBoxSelectionChangedEvent(), new EventHandler<TreeModificationEvent<Object>>(){
            
			@Override
			public void handle(TreeModificationEvent<Object> event) {
				if(habilitarSelect){
				
				System.out.println(((ItemFeature)event.getTreeItem().getValue()).getClave());
				System.out.println(event.getTreeItem().isIndeterminate());
				System.out.println(event.getTreeItem().isSelected());
				cambiarEstado(event.getTreeItem());
				/*((ItemFeature)event.getTreeItem().getValue()).setSeleccionado(event.getTreeItem().isSelected());
				
					//event.getTreeItem().setSelected(null);
				
				if(autocompletar){
					itemSeleccionado(((ItemFeature)event.getTreeItem().getValue()));
				}
				
				// TODO Auto-generated method stub
				}
			}
			
			
        });*/
		

		
		//Completar textArea constraints
		constraints.setText(treeYConstraints.get(1));
		
		//Completar tabla
		
		
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
		/*if(analisis[0]==1){
			modelo.setText("Consistente");
		}else{
			modelo.setText("Inconsistente");
		}
	
		caracteristicasComunes.setText(""+analisis[1]);
		caracteristicasMuertas.setText(""+analisis[2]);
		configuracionesPosibles.setText(""+analisis[3]);
		*/
	}
	
	public int armarArbolRecursivo(String[] textoArchivo, CheckBoxTreeItem<ItemFeature> padre, int i){
		
		for (; i<textoArchivo.length; i++){
			ItemFeature itemFeature = new ItemFeature(textoArchivo[i], obtenerClave(textoArchivo[i]));
			mapaItemFeature.put(obtenerClave(textoArchivo[i]),itemFeature);
			CheckBoxTreeItem<ItemFeature> item = new CheckBoxTreeItem<ItemFeature>(itemFeature);
			//item.setIndependent(true);
			//ImageView mv = new ImageView();
			//Image img =new Image("src/imagen/Cruz_Roja.png", true);
            //mv.setImage(new Image(new File("src/imagen/Cruz_Roja.png").toURI().toString()));
            //item.setGraphic(value);
			
			if (itemFeature.getEstado()=="indefinido")
				item.setIndeterminate(true);
			else if(itemFeature.getEstado()=="seleccionado")
				item.setSelected(true);
			else
				item.setSelected(false);
			
			if(i+1<textoArchivo.length){
				if(textoArchivo[i].lastIndexOf('\t')<textoArchivo[i+1].lastIndexOf('\t')){
					i= armarArbolRecursivo(textoArchivo, item, i+1);
					item.getValue().setFeature(item.getValue().getFeature().replaceAll("\t", ""));
					//item.setValue(item);
					
					padre.getChildren().add(item);
					if(i+1<textoArchivo.length){
					int t= textoArchivo[i+1].lastIndexOf('\t');
					int z= padre.getValue().getFeature().lastIndexOf('\t');
					if(t<=z){
						break;
					}}
				}
				else if(textoArchivo[i].lastIndexOf('\t')>textoArchivo[i+1].lastIndexOf('\t')){
					item.getValue().setFeature(item.getValue().getFeature().replaceAll("\t", ""));
					//item.setValue(item.getValue().replaceAll("\t", ""));
					padre.getChildren().add(item);
					break;
				}
				else{
					item.getValue().setFeature(item.getValue().getFeature().replaceAll("\t", ""));
					//item.setValue(item.getValue().replaceAll("\t", ""));
					padre.getChildren().add(item);
				}
			}
			else{
				item.getValue().setFeature(item.getValue().getFeature().replaceAll("\t", ""));
				//item.setValue(item.getValue().replaceAll("\t", ""));
				padre.getChildren().add(item);
			}
        	//CheckBoxTreeItem<String> item = new CheckBoxTreeItem<String>(linea);
			//rootItem.getChildren().add(item);
	    }
		return i;
	}
	
	public String obtenerClave(String feature){
		if(feature.indexOf("_r")== -1)
			return "";
		
		 return feature.substring(feature.indexOf("_r"),feature.indexOf(")"));
		
	}
	
	public CheckBoxTreeItem<ItemFeature> actualizarArbol(CheckBoxTreeItem<ItemFeature> nodo){
		CheckBoxTreeItem<ItemFeature> nodoCopia = new CheckBoxTreeItem<ItemFeature>(nodo.getValue());
		
		ItemFeature itemFeature =nodo.getValue();
		
		nodoCopia.setIndependent(true);
		if (itemFeature.getEstado()=="indefinido")
			nodoCopia.setIndeterminate(true);
		else if(itemFeature.getEstado()=="seleccionado")
			nodoCopia.setSelected(true);
		else
			nodoCopia.setSelected(false);
		
		
		for(TreeItem<ItemFeature> nodoHijo: nodo.getChildren()){
			nodoCopia.getChildren().add(actualizarArbol((CheckBoxTreeItem<ItemFeature>)nodoHijo));
			nodoCopia.setExpanded(nodo.isExpanded());
		}
		
		return nodoCopia;
		
	}
	
	
	@FXML
	private void cargarDatos() {
		SATReasoningExample sat= new SATReasoningExample();
		int[] analisis=sat.run("src/archivosSalida/salida"+archivoSeleccionado+".xml");
		if(analisis[0]==1){
			modelo.setText("Consistente");
		}else{
			modelo.setText("Inconsistente");
		}
	
		caracteristicasComunes.setText(""+analisis[1]);
		caracteristicasMuertas.setText(""+analisis[2]);
		configuracionesPosibles.setText(""+analisis[3]);
		
		for(String clave: sat.getCaracteristicasMuertas()){
			mapaItemFeature.get(clave).setDisable(true);
			System.out.println(clave);
		}
		habilitarSelect=false;
		//actualizarArbol(rootItem);
		habilitarSelect=true;
		
	}
	
	public void itemSeleccionado(ItemFeature item){
		if(item.getEstado()!="indefinido"){
			SATConfigurationExample.select("src/archivos/salida"+archivoSeleccionado+".xml", item, mapaItemFeature);
			habilitarSelect=false;
			rootItem=actualizarArbol(rootItem);
			setEventoArbol();
			featureTree.setRoot(rootItem);
			habilitarSelect=true;
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// TODO Auto-generated method stub
		
	}
	@FXML
	public void validarProducto(){
		ArrayList<ItemFeature> listaContradicciones=SATConfigurationExample.validarSelecciones("src/archivosSalida/salida"+archivoSeleccionado+".xml", mapaItemFeature);
		String texto="";
		if(listaContradicciones.size()==0){
			configProducto.setText("Configuaración de producto válida");
		}
		else{
			configProducto.setText("Configuaración de producto inválida \n");
			contradicciones.setText(listaContradicciones.size()+" contradicciones");
			String seleccionar="";
			String desmarcar="";
			for (ItemFeature itemFeature : listaContradicciones) {
				if(itemFeature.getSeleccionado()=="noSeleccionado")
					desmarcar+="\n	-"+itemFeature.getFeature();
				else if(itemFeature.getSeleccionado()=="seleccionado")
					seleccionar+="\n	-"+itemFeature.getFeature();
			}
			texto+=("Para solucionar conflictos \n Características que deben seleccionarse:" + seleccionar);
			texto+=("\nCaracterísticas que no deben seleccionarse:" + desmarcar);
			
		}
		resultadoValidarProducto.setText(texto);
	}
	@FXML
	public void configuracionParcial(){
		
	}
	@FXML
	public void autocompletar(){
		if(checkAutocompletar.isSelected()){
			autocompletar=true;
		}
		else
			autocompletar=false;
	}
	@FXML
	public void inicio(){
		MainInterfaz.pantallaInicio();
	}
	
	private void cambiarEstado(CheckBoxTreeItem<Object> checkBoxTreeItem){
		habilitarSelect=false;
		//checkBoxTreeItem.setSelected(false);
		//checkBoxTreeItem.setIndeterminate(true);
		ItemFeature itemFeature= ((ItemFeature)checkBoxTreeItem.getValue());
		if(itemFeature.getEstado()=="indefinido"){
			itemFeature.setEstado("seleccionado");
			//checkBoxTreeItem.setSelected(true);
			//checkBoxTreeItem.setIndeterminate(false);
		}
		else if(itemFeature.getEstado()=="seleccionado"){
			itemFeature.setEstado("noSeleccionado");
			//checkBoxTreeItem.setIndeterminate(true);
		}
		else{
			itemFeature.setEstado("indefinido");
			indefinido=false;
		}
		
		CheckBoxTreeItem<ItemFeature> rootCopia= actualizarArbol(rootItem);
		rootItem=rootCopia;
		//rootCopia.setExpanded(true)
		featureTree.refresh();
		featureTree.setRoot(rootItem);
		setEventoArbol();
		
		habilitarSelect	=true;
		
	}
	
	private void setEventoArbol(){
			rootItem.addEventHandler(CheckBoxTreeItem.checkBoxSelectionChangedEvent(), new EventHandler<TreeModificationEvent<Object>>() {
            
			@Override
			public void handle(TreeModificationEvent<Object> event) {
				
				if(habilitarSelect){
					if(indefinido){
				System.out.println(((ItemFeature)event.getTreeItem().getValue()).getClave());
				System.out.println(event.getTreeItem().isIndeterminate());
				System.out.println(event.getTreeItem().isSelected());
				cambiarEstado(event.getTreeItem());
				
				/*((ItemFeature)event.getTreeItem().getValue()).setSeleccionado(event.getTreeItem().isSelected());
				
					//event.getTreeItem().setSelected(null);
				*/
				if(autocompletar){
					itemSeleccionado(((ItemFeature)event.getTreeItem().getValue()));
				}
				// TODO Auto-generated method stub
				}
					else{
						event.getTreeItem().setIndeterminate(true);
						indefinido=true;
					}
						
			}
				
			}
				
			
			
			
        });
	}
	
}
