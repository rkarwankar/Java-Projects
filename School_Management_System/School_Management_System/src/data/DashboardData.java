package data;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Collectors;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.DashboardModel;
import model.StudentModel;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.BarChart;


public class DashboardData {
	
	public static ObservableList<DashboardModel> dashboardData;
	
	public static ObservableList<PieChart.Data> coursePieChartData;
		
	public static XYChart.Series series1;
	
	public static void loadData() throws IOException {
		
		HashMap<String, Integer> studentByDepartment = new HashMap<String, Integer>();
		HashMap<String, Integer> studentByCourse = new HashMap<String, Integer>();
		
		series1 = new XYChart.Series();
		
		for(String line : Files.readAllLines(new File("StudentData.txt").toPath())) {
			String[] details = line.split(",");
			studentByDepartment.put(details[4], studentByDepartment.getOrDefault(details[4] , 0) + 1);
			studentByCourse.put(details[5], studentByCourse.getOrDefault(details[5] , 0) + 1);
			studentByCourse.put(details[6], studentByCourse.getOrDefault(details[6] , 0) + 1);
		}
		
		
		for(String key : studentByDepartment.keySet()) {
			if(studentByDepartment.get(key) == 0) continue;
			series1.getData().add(new XYChart.Data(key, studentByDepartment.get(key)));
		}
		
		coursePieChartData = FXCollections.observableArrayList();
		
		for(String key : studentByCourse.keySet()) {
			if(studentByCourse.get(key) == 0) continue;
			System.out.println(key + " " + studentByCourse.get(key));
			coursePieChartData.add(new PieChart.Data(key, studentByCourse.get(key)));
			
		}
		


	}
	
}
