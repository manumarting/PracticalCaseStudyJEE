package jpa;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="tfg.deployment")
public class DeploymentJPA implements Serializable{
	
private static final long serialVersionUID = 2L;
	
	private String name;
	private String map;


	public DeploymentJPA() {
		super();
	}

	public DeploymentJPA(String name, String map) {
		this.name=name;
		this.map=map;
	}
	
	@Id
	public String getName() {
		return this.name;
	}
	
	public String getMap() {
		return this.map;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setMap (String map) {
		this.map=map;
	}
	
	
	
}
