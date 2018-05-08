package es.upm.dit.isst.webLab.dao;

import java.util.List;
import es.upm.dit.isst.webLab.dao.model.Trabajador;

public interface TrabajadorDAO {

	public void createTrabajador (Trabajador trabajador);
	public Trabajador readTrabajador (String email);
	public void updateTrabajador (Trabajador trabajador);
	public void deleteTrabajador (Trabajador trabajador);
	
	public List<Trabajador> readAllTrabajador();
	public Trabajador loginTrabajador(String email, String password);

}