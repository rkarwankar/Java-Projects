package model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class FacultyModel {
	
	private SimpleIntegerProperty id;
	private SimpleStringProperty name;
	private SimpleStringProperty department;
	private SimpleIntegerProperty yearsOfExp;
	private SimpleStringProperty areaOfIntrest;

	public FacultyModel() {
		super();
	}

	public FacultyModel(Integer id, String name,  String department , Integer yearsOfExp, String areaOfIntrest) {
		super();
		this.id = new SimpleIntegerProperty(id);
		this.name = new SimpleStringProperty(name);
		this.areaOfIntrest = new SimpleStringProperty(areaOfIntrest);
		this.yearsOfExp = new SimpleIntegerProperty(yearsOfExp);
		this.department = new SimpleStringProperty(department);
	}

	public String getName() {
		return name.get();
	}
	public void setName(String name) {
		this.name = new SimpleStringProperty(name);
	}
	public int getId() {
		return id.get();
	}
	public void setId(int id) {
		this.id = new SimpleIntegerProperty(id);
	}
	public String getAreaOfIntrest() {
		return areaOfIntrest.get();
	}
	public void setAreaOfIntrest(String areaOfIntrest) {
		this.areaOfIntrest = new SimpleStringProperty(areaOfIntrest);
	}
	public int getYearsOfExp() {
		return yearsOfExp.get();
	}
	public void setYearsOfExp(int yearsOfExp) {
		this.yearsOfExp = new SimpleIntegerProperty(yearsOfExp);
	}
	public String getDepartment() {
		return department.get();
	}
	public void setDepartment(String department) {
		this.department = new SimpleStringProperty(department);
	}

}

