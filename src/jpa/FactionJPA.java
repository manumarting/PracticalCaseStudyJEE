/*
 * Copyright FUOC.  All rights reserved.
 * @author Vicenç Font Sagristà, 2012
 */
package jpa;
import java.io.Serializable;

import javax.persistence.*;

/**
 * JPA Class FactionJPA
 */
@Entity
@Table(name="40K_assistant.faction")
public class FactionJPA implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String nombre;

	/**
	 * Class constructor methods
	 */
	public FactionJPA() {
		super();
	}
	public FactionJPA(int id, String nombre ) {		
		this.id = id;
		this.nombre = nombre;
	}

	/**
	 *  Methods get/set the fields of database
	 */
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	public String getNombre() {
		return nombre;
	}
	public  void setNombre(String nombre) {
		this.nombre= nombre;
	}
}
