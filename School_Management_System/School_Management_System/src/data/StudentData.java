package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.StudentModel;

public class StudentData {

	private static int idGenerator;

	public static ObservableList<StudentModel> studentData;

	public static void loadData() throws IOException {

		BufferedReader br = null;
		String sCurrentLine;
		String lastLine = "";

		br = new BufferedReader(new FileReader("StudentData.txt"));

		while ((sCurrentLine = br.readLine()) != null) {
			lastLine = sCurrentLine;
		}
		String[] lastLineArr = lastLine.split(",");
		idGenerator = Integer.parseInt(lastLineArr[0]) + 1;
		if (br != null)br.close();


		Collection<StudentModel> studentList = Files.readAllLines(new File("StudentData.txt").toPath())
				.stream()
				.map(line -> {
					String[] details = line.split(",");
					StudentModel student = new StudentModel();
					student.setId(Integer.parseInt(details[0]));
					student.setName(details[1]);
					student.setTerm(details[2]);
					student.setDegree(details[3]);
					student.setMajor(details[4]);
					student.setCourse1(details[5]);
					student.setCourse2(details[6]);
					return student;
				}).collect(Collectors.toList());

		studentData = FXCollections.observableArrayList(studentList);

	}

	public static void addStudent(String name, String term, String degree, String major, String course1, String course2) throws IOException {
		Files.write(Paths.get("StudentData.txt"), ("\n" + idGenerator + "," + name + "," + term + "," + degree  + "," + major + "," + course1+ "," + course2).getBytes(), StandardOpenOption.APPEND);
		studentData.add(new StudentModel(idGenerator, name, degree ,term, major, course1, course2));
		idGenerator++;
	}

}
