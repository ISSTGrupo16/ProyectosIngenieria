package es.upm.dit.isst.webLab.dao.model;


import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Gestor implements Serializable {

	@Id
	private String email;
	private String password;
	private String name;

	
	@OneToMany(mappedBy = "advisor", fetch = FetchType.EAGER)
	private List<Proyecto> advisedProyectos;
	
	public Gestor() {
		this.advisedProyectos = new ArrayList<>();
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

	public List<Proyecto> getAdvisedProyectos() {
		return advisedProyectos;
	}

	public void setAdvisedProyectos(List<Proyecto> advisedProyectos) {
		this.advisedProyectos = advisedProyectos;
	}
}


