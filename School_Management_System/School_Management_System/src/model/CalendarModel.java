package model;

import javafx.beans.property.SimpleStringProperty;

public class CalendarModel {
	
	 private SimpleStringProperty date;
	 private SimpleStringProperty calendar;
	 
	 public CalendarModel(String date, String calendar) {
	        this.date = new SimpleStringProperty(date);
	        this.calendar = new SimpleStringProperty(calendar);
	 }
	 
	 public String getDate() {
	        return date.get();
	 }

	 public void setDate(String date) {
	    this.date = new SimpleStringProperty(date);
	 }
	 
	 public String getCalendar() {
	        return calendar.get();
	 }

	 public void setCalendar(String Calendar) {
	    this.calendar = new SimpleStringProperty(Calendar);
	 }
}
