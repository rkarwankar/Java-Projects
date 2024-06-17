package model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class StudentModel {

	private SimpleIntegerProperty id;
	private SimpleStringProperty name;
	private SimpleStringProperty degree;
	private SimpleStringProperty term;
	private SimpleStringProperty major;
	private SimpleStringProperty course1;
	private SimpleStringProperty course2;

	public StudentModel() {
		super();
	}

	public StudentModel(Integer id, String name, String degree, String term, String major, String course1,
			String course2) {
		super();
		this.id = new SimpleIntegerProperty(id);
		this.name = new SimpleStringProperty(name);
		this.degree = new SimpleStringProperty(degree);
		this.term = new SimpleStringProperty(term);
		this.major = new SimpleStringProperty(major);
		this.course1 = new SimpleStringProperty(course1);
		this.course2 = new SimpleStringProperty(course2);
	}

	public String getDegree() {
		return degree.get();
	}

	public void setDegree(String degree) {
		this.degree = new SimpleStringProperty(degree);
	}

	public String getTerm() {
		return term.get();
	}

	public void setTerm(String term) {
		this.term = new SimpleStringProperty(term);
	}

	public String getMajor() {
		return major.get();
	}

	public void setMajor(String major) {
		this.major = new SimpleStringProperty(major);
	}

	public String getCourse1() {
		return course1.get();
	}

	public void setCourse1(String course1) {
		this.course1 = new SimpleStringProperty(course1);
	}

	public String getCourse2() {
		return course2.get();
	}

	public void setCourse2(String course2) {
		this.course2 = new SimpleStringProperty(course2);
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

}
