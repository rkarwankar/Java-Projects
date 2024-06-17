package model;

public class CourseModel {
	

	private String title;
	private String description;
	private String code;
	private String faculty;
	private String department;
	
	public CourseModel() {
		super();
	}
	
	public CourseModel(String title, String description, String code, String faculty, String department) {
		super();
		this.title = title;
		this.description = description;
		this.code = code;
		this.faculty = faculty;
		this.department = department;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
