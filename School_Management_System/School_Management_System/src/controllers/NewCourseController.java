package controllers;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ResourceBundle;

import data.CourseData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class NewCourseController implements Initializable {
	
	@FXML
    private AnchorPane newCoursePane;
	
	@FXML
	private Button add;

	@FXML
	private Button cancel;

	@FXML
	private TextField description;

	@FXML
	private TextField title;

	@FXML
	private TextField department;

	@FXML
	private TextField code;

	@FXML
	private ComboBox<String> faculty;

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
		for(String line  : Files.readAllLines(new File("FacultyData.txt").toPath())) {
			String[] details = line.split(",");
			faculty.getItems().add(details[1]);
		}
		
		faculty.setPromptText("Faculty");
    }
	public void handleButtonClicks(ActionEvent mouseEvent) throws IOException {
		
		if (mouseEvent.getSource() == add) {
			CourseData.addCourse(title.getText(), description.getText(), department.getText(), code.getText(), faculty.getValue());
			
			Stage stage = (Stage) cancel.getScene().getWindow();
            stage.close();
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("New Course");
			alert.setContentText("Course added successfully");
			alert.showAndWait();
		}

		if (mouseEvent.getSource() == cancel) {
			
			Stage stage = (Stage) cancel.getScene().getWindow();
            stage.close();
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("New Course");
			alert.setContentText("Course not added");
			alert.showAndWait();
		}
		
	}

}
