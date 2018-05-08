package es.upm.dit.isst.webLab.dao.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
public class Trabajador implements Serializable {

	@Id
	private String email;
	private String password;
	private String name;
	
	@ManyToMany
	private Set<Proyecto> proyectos = new HashSet<Proyecto>(0);
	
	public Trabajador() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "TRABAJADOR_PROYECTO", joinColumns = { @JoinColumn(name = "email") }, inverseJoinColumns = { @JoinColumn(name = "title") })
	public Set<Proyecto> getCourses() {
		return this.proyectos;
	}

	public void setCourses(Set<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

}


