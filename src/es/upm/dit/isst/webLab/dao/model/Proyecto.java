package es.upm.dit.isst.webLab.dao.model;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;

import java.util.List;

@Entity
public class Proyecto implements Serializable {
	
	@Id
	private String title;
	private String name;
	private Date date;
	private int status;
	private int numeroTrabajadores;
	private String numeroHorasTotales;
	private String numeroHorasTrabajadas;
	
	
	@Lob
	private byte[] document;
	
	@ManyToOne
	private Gestor advisor;
	
	@ManyToMany
	private List <Trabajador> lista_trabajadores;

	public Proyecto() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}


	public byte[] getDocument() {
		return document;
	}

	public void setDocument(byte[] document) {
		this.document = document;
	}

	public Gestor getAdvisor() {
		return advisor;
	}

	public void setAdvisor(Gestor advisor) {
		this.advisor = advisor;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	//Nuevo metodo numero trabajadores
	public int getNumeroTrabajadores() {
		return numeroTrabajadores;
	}

	public void setNumeroTrabajadores(int numeroTrabajadores) {
		this.numeroTrabajadores = numeroTrabajadores;
	}
		
	//Nuevo metodo horas trabajadas
	public String getNumeroHorasTrabajadas() {
		return numeroHorasTrabajadas;
	}

	public void setNumeroHorasTrabajadas(String numeroHorasTrabajadas) {
		this.numeroHorasTrabajadas = numeroHorasTrabajadas;
	}
		
	//Nuevo metodo horas totales
	public String getNumeroHorasTotales() {
		return numeroHorasTotales;
	}

	public void setNumeroHoras(String numeroHorasTotales) {
		this.numeroHorasTotales = numeroHorasTotales;
	}
	
	public List<Trabajador> getListaTrabajadores() {
		return lista_trabajadores;
	}

	public void setListaTrabajadores(List<Trabajador> lista_trabajadores) {
		this.lista_trabajadores = lista_trabajadores;
	}
	
	
		

	
}


