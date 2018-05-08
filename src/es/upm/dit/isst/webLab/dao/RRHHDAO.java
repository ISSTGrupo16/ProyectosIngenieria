package es.upm.dit.isst.webLab.dao;

import java.util.List;
import es.upm.dit.isst.webLab.dao.model.RRHH;

public interface RRHHDAO {

	public void createRRHH (RRHH rrhh);
	public RRHH readRRHH (String email);
	public void updateRRHH (RRHH rrhh);
	public void deleteRRHH (RRHH rrhh);
	
	public List<RRHH> readAllRRHH();
	public RRHH loginRRHH(String email, String password);

}