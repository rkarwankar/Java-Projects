package data;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.stream.Collectors;

import model.StudentModel;
import model.CourseModel;

public class CourseData {
	
	public static Collection<CourseModel> coursesList;
	
	public static void loadData() throws IOException {
		
		coursesList = Files.readAllLines(new File("CourseData.txt").toPath())
				.stream()
				.map(line -> {
					String[] details = line.split(",");
					CourseModel courseModel = new CourseModel();
					courseModel.setTitle(details[0]);
					courseModel.setDescription(details[1]);
					courseModel.setDepartment(details[2]);
					courseModel.setCode(details[3]);
					courseModel.setFaculty(details[4]);
					return courseModel;
				}).collect(Collectors.toList());
		
	}
	
	public static void addCourse(String title, String description, String department, String code, String facuty) throws IOException {
		Files.write(Paths.get("CourseData.txt"), ("\n" + title + "," + description + "," +department + ","+ code + ","+ facuty ).getBytes(), StandardOpenOption.APPEND);
		coursesList.add(new CourseModel(title, description, department, code, facuty));
	}

}
