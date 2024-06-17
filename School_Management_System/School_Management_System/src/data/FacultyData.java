package data;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collection;
import java.util.stream.Collectors;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.FacultyModel;

public class FacultyData {

	public static ObservableList<FacultyModel> facultyData;

	public static void loadData() throws IOException {


		Collection<FacultyModel> facultyList = Files.readAllLines(new File("FacultyData.txt").toPath())
				.stream()
				.map(line -> {
					String[] details = line.split(",");
					FacultyModel facultyModel = new FacultyModel();
					facultyModel.setId(Integer.parseInt(details[0]));
					facultyModel.setName(details[1]);
					facultyModel.setDepartment(details[2]);
					facultyModel.setYearsOfExp(Integer.parseInt(details[3]));
					facultyModel.setAreaOfIntrest(details[4]);
					return facultyModel;
				}).collect(Collectors.toList());

		facultyData = FXCollections.observableArrayList(facultyList);

	}

}
