package jpa;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="tfg.traits")
public class TraitJPA implements Serializable {
	
private static final long serialVersionUID = 2L;
	
	private String name;
	private String description;
	private FactionJPA faction;
	
	
	public TraitJPA() {
		super();
	}
	
	public TraitJPA (String name, String description, FactionJPA faction) {
		
		this.name=name;
		this.description=description;
		this.faction=faction;

	}
	
	@Id
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}

	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setDescription (String description) {
		this.description=description;
	}
	
	@ManyToOne (cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn (name="faction")
	public FactionJPA getFaction() {
		return faction;
	}
	
	public void setFaction (FactionJPA faction) {
		this.faction= faction;
	}
}
