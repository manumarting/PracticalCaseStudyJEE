package jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="topoffers.administrator")
public class AdministratorJPA implements Serializable{

	private static final long serialVersionUID = -5516706160280635664L;

	@Id
	@Column(name="admin_id")
	private int adminId;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
	
	public AdministratorJPA() {
		super();
	}
	
	public AdministratorJPA(int id, String password, String email) {
		this.adminId=id;
		this.password=password;
		this.email=email;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
