package jpa;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="tfg.stratagem")
public class StratagemJPA implements Serializable{
	
private static final long serialVersionUID = 2L;
	
	private String name;
	private String description;
	private String faction;
	private int cost;

	public StratagemJPA() {
		super();
	}
	
	public StratagemJPA(String name, String description, String faction, int cost) {
		this.name=name;
		this.description=description;
		this.faction=faction;
		this.cost=cost;
	}
	
	@Id
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
		
	}
	
	public String getFaction() {
		return faction;
	}
	
	public int getCost() {
		return cost;
	}
	
	
	public void setName(String name) {
		this.name=name;
		
	}
	
	public void setDescription(String description) {
		this.description=description;
		
	}
	
	public void setFaction(String faction) {
		this.faction=faction;
	}
	
	public void setCost (int cost) {
		this.cost=cost;
	}

}
