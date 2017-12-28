package jpa;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="tfg.faction_objective")
public class FactionObjectiveJPA implements Serializable{

	private static final long serialVersionUID = 2L;
	private String name;
	private String description;
	private int points;
	private int number;
	private FactionJPA faction;


	
	public FactionObjectiveJPA() {
		super();
	}

	public FactionObjectiveJPA (String name, String description, int points, int number, FactionJPA faction) {
		this.name=name;
		this.description=description;
		this.points=points;
		this.number=number;
		this.faction= faction;
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
	
	public int getnumber() {
		return number;
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
	

	public void setnumber (int number) {
		this.number=number;
	}
	
	@ManyToOne (cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn (name="faction")
	public FactionJPA getFaction() {
		return faction;
	}
	
	public void setFaction (FactionJPA faction) {
		this.faction=faction;
	}

}
