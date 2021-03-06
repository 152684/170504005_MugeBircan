/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package userInterface;

import com.mycompany.inf202.Kunde;
import com.mycompany.inf202.UngueltigeIDException;
import databaseFunctions.SelectRecords;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author mbirc
 */
public class KundeListeController implements Initializable {

    private ObservableList<Kunde> kundeData = FXCollections.observableArrayList();
    public static TableView<Kunde> table_info_app;

    @FXML
    private TableView<Kunde> kundeTable;
    @FXML
    private TableColumn<Kunde, String> nameColumn;
    @FXML
    private TableColumn<Kunde, Long> burgerIdColumn;
    @FXML
    private TableColumn<Kunde, String> anschriftColumn;
    @FXML
    private TableColumn<Kunde, String> emailColumn;
    @FXML
    private TableColumn<Kunde, Integer> telColumn;
    @FXML
    private TableColumn<Kunde, String> geburtColumn;
    @FXML
    private TableColumn<Kunde, String> toursColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        table_info_app = kundeTable;
        initializeCols();
        try {        
            loadData();
        } catch (UngueltigeIDException ex) {
            Logger.getLogger(MitarbeiterListeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
 
    /**
     * Initialisieren den Spalten
     */
    private void initializeCols(){
      
      nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
      burgerIdColumn.setCellValueFactory(new PropertyValueFactory<>("burgerID"));
      anschriftColumn.setCellValueFactory(new PropertyValueFactory<>("anschrift"));
      emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
      telColumn.setCellValueFactory(new PropertyValueFactory<>("telefonnummer"));
      geburtColumn.setCellValueFactory(new PropertyValueFactory<>("geburtsdatum"));
      toursColumn.setCellValueFactory(new PropertyValueFactory<>("reisen"));
    }   
    
    /**
     * Data in die Tabelle speichern
     * @throws UngueltigeIDException 
     */
    private void loadData() throws UngueltigeIDException{

        ArrayList<Kunde> kunden = new ArrayList();
        SelectRecords.allKundenInArray(kunden);
        Iterator<Kunde> iter = kunden.iterator();
                
        while(iter.hasNext()){
            kundeData.add(iter.next());
        }

        kundeTable.setItems(kundeData);
    }    
    
}
