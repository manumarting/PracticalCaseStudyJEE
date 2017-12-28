package jpa;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
@Table (name="tfg.specialrules")
public class SpecialRuleJPA implements Serializable{

	private static final long serialVersionUID = 2L;
	private String name;
	private String description;
	
	public SpecialRuleJPA() {
		super();
	}

	public SpecialRuleJPA(String name, String description) {
		this.name= name;
		this.description=description;
		
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
	
	public void setDescription(String description) {
		this.description=description;
	}
}
