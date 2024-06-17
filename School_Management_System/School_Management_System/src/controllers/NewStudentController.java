package controllers;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.Collection;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import data.StudentData;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.StudentModel;

public class NewStudentController implements Initializable {
	
	@FXML
	private AnchorPane newStudentPane;
	
	@FXML
	private Button add;
	
	@FXML
	private Button cancel;
	
	@FXML
	private TextField name;
	
	@FXML
	private TextField term;
	
	@FXML
	private TextField major;
	
	@FXML
	private TextField degree;
	
	@FXML
	private ComboBox<String> course1;

	@FXML
	private ComboBox<String> course2;
	
	public void handleButtonClicks(ActionEvent mouseEvent) throws IOException {
        if (mouseEvent.getSource() == add) {
        	StudentData.addStudent(name.getText(), term.getText(), degree.getText(), major.getText(), course1.getValue(), course2.getValue());
        	Stage stage = (Stage) cancel.getScene().getWindow();
            stage.close();
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("New Student");
            alert.setContentText("Student added successfully");
            alert.showAndWait();
        }
        else if (mouseEvent.getSource() == cancel) {
        	Stage stage = (Stage) cancel.getScene().getWindow();
            stage.close();
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("New Student");
            alert.setContentText("Student not added");
            alert.showAndWait();
        }
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		try {
			loadComboBox();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void loadComboBox() throws IOException
    {
		for(String line  : Files.readAllLines(new File("CourseData.txt").toPath())) {
			String[] details = line.split(",");
			course1.getItems().add(details[0]);
			course2.getItems().add(details[0]);
		}
		
		course1.setPromptText("Choose Course 1");
		course2.setPromptText("Choose Course 2");
    }
	
	private void loadStage(String fxml) {
        try {
        	AnchorPane pane = FXMLLoader.load(getClass().getResource(fxml));
        	newStudentPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	
	

}
