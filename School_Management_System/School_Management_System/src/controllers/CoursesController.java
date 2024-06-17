package controllers;


import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.ResourceBundle;

import data.CourseData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import model.CourseModel;

public class CoursesController implements Initializable {

	@FXML
	private AnchorPane coursesPane;

	@FXML
	private Pane pane;

	@FXML
	private Accordion accordion;

	@FXML
	private ImageView coursesHomeButton;

	@FXML
	private Button newCourse;
	
	@FXML
	private ImageView logout;
	
	public void logOut() {
    	loadStage("/fxml/Login.fxml");
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			loadCourses();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void handleButtonClicks(ActionEvent mouseEvent) throws IOException {

		if (mouseEvent.getSource() == newCourse) {
			loadNewStage("/fxml/NewCourse.fxml");
		}
	}
	
	public void redirectHome() {
    	loadStage("/fxml/Home.fxml");
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

	private void loadStage(String fxml) {
		try {
			AnchorPane pane = FXMLLoader.load(getClass().getResource(fxml));
			coursesPane.getChildren().setAll(pane);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void loadCourses() throws IOException {
		
		CourseData.loadData();
		Collection<CourseModel> coursesList = CourseData.coursesList;
		
		for(CourseModel course : coursesList) {
			TitledPane tp = new TitledPane();
			tp.setFont(Font.font("System", FontWeight.NORMAL ,FontPosture.REGULAR, 23));
			
			tp.setText(course.getTitle());
			AnchorPane ap = new AnchorPane();
			Font font = Font.font("System", FontWeight.BOLD, FontPosture.REGULAR, 17);
			Label lb1 = new Label("  Description     : " + course.getDescription());
			lb1.setFont(font);
			Label lb2 = new Label("\n" + "  Department    : " + course.getDepartment());
			lb2.setFont(font);
			Label lb3 = new Label("\n" +"\n" +"  Course Code  : " + course.getCode());
			lb3.setFont(font);
			Label lb4 = new Label("\n" +"\n" +"\n" +"  Faculty             : " + course.getFaculty());
			lb4.setFont(font);
			
			ap.getChildren().add(lb1);
			ap.getChildren().add(lb2);
			ap.getChildren().add(lb3);
			ap.getChildren().add(lb4);
			tp.setContent(ap);
			accordion.getPanes().add(tp);
		}
		
	}

}
