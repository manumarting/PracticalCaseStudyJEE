package jpa;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;


@Entity
@Table(name="tfg.faction")
public class FactionJPA implements Serializable{
	
	private static final long serialVersionUID = 2L;
	
	private String name;
	
	private Collection <TraitJPA> traits;
	private Collection<CommanderJPA> commanders;
	private Collection<FactionObjectiveJPA> factionObjectives;

	public FactionJPA() {
		super();
	}
	
	public FactionJPA(String name) {
		
		this.name=name;
	}
	
	@Id
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name=name;
	}
	
	
	@OneToMany (cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="faction")
	public Collection<TraitJPA> getTraits(){
		return traits;
	}
	
	public void setTraits(Collection<TraitJPA> traits) {
		this.traits=traits;
	}
	
	public void addTrait(TraitJPA trait) {
		traits.add(trait);
	}
	
	public void removeTrait(TraitJPA trait) {
		traits.remove(trait);
	}
	
	
	@OneToMany (cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="faction")
	public Collection<CommanderJPA> getCommanders(){
		return commanders;
	}
		
	public void setCommanders (Collection<CommanderJPA> commanders) {
		this.commanders=commanders;
	}
	
	public void addCommander(CommanderJPA commander) {
		commanders.add(commander);
	}
	
	public void removeCommander(CommanderJPA commander) {
		commanders.remove(commander);
	}
	
	
	@OneToMany (cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="faction")
	public Collection<FactionObjectiveJPA> getFactionObjectives(){
		return factionObjectives;
	}
	
	public void setFactionObjectives (Collection<FactionObjectiveJPA> factionObjectives) {
		this.factionObjectives=factionObjectives;
	}
	
	public void addFactionObjective(FactionObjectiveJPA factionObjective) {
		factionObjectives.add(factionObjective);
	}
	
	public void removeFactionObjective(FactionObjectiveJPA factionObjective) {
		factionObjectives.remove(factionObjective);
	}
	

}

