package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import data.StudentData;
import data.FacultyData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.StudentModel;
import model.FacultyModel;

public class FacultyController implements Initializable {
	

	
	@FXML
	private AnchorPane facultyPane;
	
	@FXML
	private ImageView homeButton;
	
	@FXML
    private TableView<FacultyModel> facultyTable;
	
	@FXML
    public TableColumn<FacultyModel, String> facultyid;
	
	@FXML
    public TableColumn<FacultyModel, String> facultyName;

    @FXML
    public TableColumn<FacultyModel, String> expYears;
    
    @FXML
    public TableColumn<FacultyModel, String> areaOfIntrest;
    
    @FXML
    public TableColumn<FacultyModel, String> department;
    
    @FXML
    public Button addNewFaculty;
    
    
    @FXML
	private ImageView logout;
	
	public void logOut() {
    	loadStage("/fxml/Login.fxml");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	
    	try {
    		loadFaculty();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    private void loadFaculty() throws IOException
    {
    	facultyid.setCellValueFactory(new PropertyValueFactory<>("id"));
    	facultyName.setCellValueFactory(new PropertyValueFactory<>("Name"));
    	department.setCellValueFactory(new PropertyValueFactory<>("Department"));
    	expYears.setCellValueFactory(new PropertyValueFactory<>("YearsOfExp"));
    	areaOfIntrest.setCellValueFactory(new PropertyValueFactory<>("AreaOfIntrest"));
    	FacultyData.loadData();
    	facultyTable.setItems(FacultyData.facultyData);
    }
    
    private void loadStage(String fxml) {
        try {
        	AnchorPane pane = FXMLLoader.load(getClass().getResource(fxml));
        	facultyPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void loadNewStage(String fxml) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxml));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
    public void redirectHome() {
        	loadStage("/fxml/Home.fxml");
        
    }

}
