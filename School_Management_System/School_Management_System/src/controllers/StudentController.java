package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import data.StudentData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.StudentModel;

public class StudentController implements Initializable {
	
	@FXML
	private AnchorPane studentPane;
	
	@FXML
    private ImageView home;
	
	@FXML
    private TableView<StudentModel> studentTable;
	
	@FXML
    public TableColumn<StudentModel, String> studentId;
	
	@FXML
    public TableColumn<StudentModel, String> studentName;

    @FXML
    public TableColumn<StudentModel, String> term;
    
    @FXML
    public TableColumn<StudentModel, String> degree;
    
    @FXML
    public TableColumn<StudentModel, String> major;

    @FXML
    public TableColumn<StudentModel, String> course1;

    @FXML
    public TableColumn<StudentModel, String> course2;
    
    @FXML
    public Button addNewStudent;
    
    @FXML
	private ImageView logout;
	
	public void logOut() {
    	loadStage("/fxml/Login.fxml");
    }
    
    public void handleButtonClicks(ActionEvent mouseEvent) throws IOException {
        if (mouseEvent.getSource() == home) {
        	loadStage("/fxml/Home.fxml");
        }
        
        else if (mouseEvent.getSource() == addNewStudent) {
        	loadNewStage("/fxml/NewStudent.fxml");
        }
        
    }
    
    public void redirectHome() {
    	loadStage("/fxml/Home.fxml");
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	
    	try {
			loadStudents();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    private void loadStudents() throws IOException
    {
    	studentId.setCellValueFactory(new PropertyValueFactory<>("id"));
    	studentName.setCellValueFactory(new PropertyValueFactory<>("Name"));
    	term.setCellValueFactory(new PropertyValueFactory<>("Term"));
    	degree.setCellValueFactory(new PropertyValueFactory<>("Degree"));
    	major.setCellValueFactory(new PropertyValueFactory<>("Major"));
    	course1.setCellValueFactory(new PropertyValueFactory<>("Course1"));
    	course2.setCellValueFactory(new PropertyValueFactory<>("Course2"));
    	StudentData.loadData();
    	studentTable.setItems(StudentData.studentData);
    }

    private void loadStage(String fxml) {
        try {
        	AnchorPane pane = FXMLLoader.load(getClass().getResource(fxml));
        	studentPane.getChildren().setAll(pane);
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
    
}