package jpa;
import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="tfg.objective")
public class ObjectiveJPA implements Serializable{
	
	private static final long serialVersionUID = 2L;
	
	private String name;
	private String description;
	private int points;
	private String type;
	
	public ObjectiveJPA() {
		super();
	}
	
	public ObjectiveJPA(String name, String description, int points, String type) {
		this.name=name;
		this.description=description;
		this.points=points;
		this.type=type;
	}
	
	@Id
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}

	public int getPoints() {
		return points;
	}
	
	public String getType() {
		return type;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setDescription(String description) {
		this.description=description;
	}
	
	public void setPoints(int points) {
		this.points=points;
	}
	
	public void setType (String type) {
		this.type=type;
	}
}
