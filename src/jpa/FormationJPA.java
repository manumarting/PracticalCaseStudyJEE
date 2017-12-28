package jpa;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="tfg.formation")
public class FormationJPA implements Serializable{
	
private static final long serialVersionUID = 2L;
	
	private String name;
	private String description;
	private int command_points;

	public FormationJPA() {
		super();
	}

	public FormationJPA(String name, String description, int command_points) {
		this.name=name;
		this.description=description;
		this.command_points=command_points;
		
	}
	
	@Id
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public int getCommand_points() {
		return this.command_points;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setDescription (String description) {
		this.description= description;
	}
	
	public void setCommand_points (int command_points) {
		this.command_points= command_points;
	}
	
}
