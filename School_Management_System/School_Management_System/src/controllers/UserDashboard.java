package controllers;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.ResourceBundle;

import data.DashboardData;
import data.StudentData;
import data.CourseData;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Accordion;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.util.Duration;
import model.StudentModel;
import model.CalendarModel;
import model.CourseModel;

public class UserDashboard implements Initializable{
	
	@FXML
	private AnchorPane userDashboard;
	
	@FXML
	private ImageView logout;
	
	@FXML
	private Label dateTime;
	
	@FXML
	private Accordion accordion;
	
	@FXML
    private TableColumn<String, String> date;

    @FXML
    private TableColumn<String, String> calendar;

    @FXML
    private TableView<CalendarModel> calendarTable;
    
    @FXML
    private Label id;
    
    @FXML
    private Label name;
    
    @FXML
    private Label degree;
    
    @FXML
    private Label course1;
    
    @FXML
    private Label course2;
    
    @FXML
    private Label major;
    
    @FXML
    private Label term;
    
    @FXML
    private Label reportsTo;
    
    @FXML
    private Label department;
    
    @FXML
    private Button absent;
    
    @FXML
    private Button present;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		try {
			StudentData.loadData();
			loadCourses();
			loadCalendar();
			initClock();
			loadStudent();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void handleButtonClicks(ActionEvent mouseEvent) throws IOException {
        if (mouseEvent.getSource() == absent) {
        	DashboardData.loadData();
        	//DashboardData.addDashboardData(Integer.parseInt(id.getText()), name.getText(), dateTime.getText(), 0);
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Timesheet");
            alert.setContentText("You are absent today");
            alert.showAndWait();
        }
        else if (mouseEvent.getSource() == present) {
        	DashboardData.loadData();
        	//DashboardData.addDashboardData(Integer.parseInt(id.getText()), name.getText(), dateTime.getText(), 9);
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Timesheet");
            alert.setContentText("You are present today");
            alert.showAndWait();
        }
    }
	

	private void initClock() {

	    Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	        dateTime.setText(LocalDateTime.now().format(formatter));
	    }), new KeyFrame(Duration.seconds(1)));
	    clock.setCycleCount(Animation.INDEFINITE);
	    clock.play();
	}
	
	public void logOut() {
    	loadStage("/fxml/Login.fxml");
    }
	
	private void loadStage(String fxml) {
        try {
        	AnchorPane pane = FXMLLoader.load(getClass().getResource(fxml));
        	userDashboard.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	private void loadCourses() throws IOException {
		
//		CourseData.loadData();
//		Collection<CourseModel> courseList = CourseData.coursesList;
//		
//		for(CourseModel course : courseList) {
//			TitledPane tp = new TitledPane();
//			tp.setFont(Font.font("System", FontWeight.NORMAL ,FontPosture.REGULAR, 23));
//			
//			tp.setText(course.getTitle());
//			AnchorPane ap = new AnchorPane();
//			ap.getChildren().add(new Label(course.getDescription()));
//			tp.setContent(ap);
//			accordion.getPanes().add(tp);
//		}
		
	}
	
	private void loadCalendar() throws IOException {
		
        date.setCellValueFactory(new PropertyValueFactory<>("date"));
        calendar.setCellValueFactory(new PropertyValueFactory<>("calendar"));
        
        calendarTable.setItems(calendarModels);
	}
	
	private ObservableList<CalendarModel> calendarModels = FXCollections.observableArrayList(
			new CalendarModel("Jan. 1", "New Year’s Day"),
            new CalendarModel("Jan. 18", "Martin Luther King’s Birthday"),
            new CalendarModel("Feb. 15", "Washington’s Birthday"),
            new CalendarModel("Mar. 17", "Evacuation Day"),
            new CalendarModel("Apr. 19", "Patriot’s Day"),
            new CalendarModel("May 31", "Memorial Day"),
            new CalendarModel("June 17", "Bunker Hill Day"),
            new CalendarModel("July 4","Independence Day"),
            new CalendarModel( "Sept. 6","Labor Day"),
            new CalendarModel("Oct. 11","Columbus Day"),
            new CalendarModel( "Nov. 11","Veterans’ Day"),
            new CalendarModel( "Nov. 25", "Thanksgiving Day"),
            new CalendarModel( "Dec. 25", "Christmas Day")
    );
	
	private void loadStudent() {
		
		for(StudentModel em : StudentData.studentData) {
			if(em.getName().equals(LoginController.user)) {
				
				name.setText(em.getName());
				degree.setText(em.getDegree());
				major.setText(em.getMajor());
				term.setText(em.getTerm());
				course1.setText(em.getCourse1());
				course2.setText(em.getCourse2());
				
			}
		}
		
	}

}
