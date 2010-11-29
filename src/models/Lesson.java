package models;

import java.util.Date;


/**
 * @author Bertrand BRUN
 * 
 * Classe permettant de representer en memoire un cours.
 * La classe "Cours" represente un cours. Le cours represente les differentes possibilites,
 * pour une UE, d'avoir lieu.
 * Les serveurs de la faculte des sciences de Montpellier renvoient des cours sous forme JSON.
 * Cette classe permet de convertir le JSON en classe JAVA.
 * 
 * 
 */
public class Lesson {

	private int id;
	private boolean allDay;
	private boolean editable;
	private boolean readOnly;
	private boolean model;
	private String description;
	private String location;
	private String title;
	private String type;
	private String group;
	private Date end;
	private Date start;
	
	public int getId() {
		return id;
	}
	public boolean isAllDay() {
		return allDay;
	}
	public boolean isEditable() {
		return editable;
	}
	public boolean isReadOnly() {
		return readOnly;
	}
	public boolean isModel() {
		return model;
	}
	public String getDescription() {
		return description;
	}
	public String getLocation() {
		return location;
	}
	public String getTitle() {
		return title;
	}
	public String getType() {
		return type;
	}
	public String getGroup() {
		return group;
	}
	public Date getEnd() {
		return end;
	}
	public Date getStart() {
		return start;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAllDay(boolean allDay) {
		this.allDay = allDay;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}
	public void setModel(boolean model) {
		this.model = model;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	
	
	
	
}
