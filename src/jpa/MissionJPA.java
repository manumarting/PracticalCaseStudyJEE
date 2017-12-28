package jpa;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="tfg.mission")

public class MissionJPA implements Serializable {

private static final long serialVersionUID = 2L;
	
	private String name;
	private String category;
	private String description;
	private String armies_info;
	private String deployment_info;
	private String turn_info;
	private String duration;
	private String deployment;
	
	public MissionJPA() {
		super();
	}
	
	public MissionJPA(String name, String category, String description, String armies_info, String deployment_info, String turn_info, String duration, String deployment) {
		this.name=name;
		this.category=category;
		this.description=description;
		this.armies_info=armies_info;
		this.deployment_info=deployment_info;
		this.turn_info=turn_info;
		this.duration=duration;
		this.deployment = deployment;
	}
	@Id
	public String getName() {
		return name;
	}
	
	public String getCategory() {
		return category;
		
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getArmies_info() {
		return armies_info;
		
	}
	public String getDeployment_info() {
		return deployment_info;
	}
	
	public String getTurn_info() {
		return turn_info;
	}
	
	public String getDuration() {
		return duration;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setCategory(String category) {
		this.category=category;
	}
	
	public void setDescription(String description) {
		this.description=description;
	}
	
	public void setArmies_info(String armies_info) {
		this.armies_info=armies_info;
	}
	
	public void setDeployment_info(String deployment_info) {
		this.deployment_info=deployment_info;
	}
	
	public void setTurn_info(String turn_info) {
		this.turn_info=turn_info;
	}
	
	public void setDuration(String duration) {
		this.duration=duration;
	}
	
	
	
	public String getDeployment() {
		return deployment;
	}

	public void setDeployment(String deployment) {
		this.deployment=deployment;
	}

}
