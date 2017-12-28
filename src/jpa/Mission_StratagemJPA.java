package jpa;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="tfg.mission_stratagem")
public class Mission_StratagemJPA implements Serializable {

	private static final long serialVersionUID = 2L;
	private String name;
	private String description;
	private int cost;
	private Boolean attacker;
	private String mission;
	
	public Mission_StratagemJPA() {
		super();
	}
	
	public Mission_StratagemJPA(String name, String description, int cost, Boolean attacker, String mission) {
		this.name=name;
		this.description=description;
		this.cost=cost;
		this.attacker=attacker;
		this.mission=mission;
	}
	
	@Id
	public String getName () {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	public int getCost() {
		return cost;
	}
	
	public Boolean getAttacker() {
		return attacker;
	}
	
	public String getMission() {
		return mission;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setDescription (String description) {
		this.description=description;
	}
	
	public void setCost(int cost) {
		this.cost=cost;
	}
	
	public void setAttacker (Boolean attacker) {
		this.attacker=attacker;
	}
	
	public void setMission (String mission) {
		this.mission=mission;
	}
	
}
