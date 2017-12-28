package jpa;
import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="tfg.commander")
public class CommanderJPA implements Serializable {
	
private static final long serialVersionUID = 2L;
	
	private String name;
	private FactionJPA faction;
	private TraitJPA trait;
		
	public CommanderJPA() {
		super();
	}
	
	public CommanderJPA (String name, FactionJPA faction, TraitJPA trait) {
		this.name=name;
		this.faction=faction;
		this.trait=trait;
	}
	
	@Id
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	@ManyToOne (cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn (name="faction")
	public FactionJPA getFaction() {
		return faction;
	}
	
	public void setFaction (FactionJPA faction) {
		this.faction=faction;
	}
	
	public TraitJPA getTrait() {
		return trait;
	}
	
	public void setTrait (TraitJPA trait) {
		this.trait=trait;
	}
	
}
