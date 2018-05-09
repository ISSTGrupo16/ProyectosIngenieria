package es.upm.dit.isst.webLab.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.webLab.dao.GestorDAOImplementation;
import es.upm.dit.isst.webLab.dao.RRHHDAOImplementation;
import es.upm.dit.isst.webLab.dao.TrabajadorDAOImplementation;
import es.upm.dit.isst.webLab.dao.model.Gestor;
import es.upm.dit.isst.webLab.dao.model.RRHH;
import es.upm.dit.isst.webLab.dao.model.Trabajador;

@WebServlet("/FormNuevoUsuarioServlet")
public class FormNuevoUsuarioServlet extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String tipo = req.getParameter("tipo");
		String trab = "Trabajador";
		String rh = "RRHH";
		String gest = "Gestor";
		
		if(tipo == rh) {
			RRHH rrhh = new RRHH();
			rrhh.setName(name);
			rrhh.setEmail(email);
			rrhh.setPassword(password);
			RRHHDAOImplementation.getInstance().createRRHH(rrhh);
		}
		else if(tipo == gest){
			Gestor gestor = new Gestor();
			gestor.setName(name);
			gestor.setEmail(email);
			gestor.setPassword(password);
			GestorDAOImplementation.getInstance().createGestor(gestor);
		}
		else if(tipo == trab){
			Trabajador trabajador = new Trabajador();
			trabajador.setName(name);
			trabajador.setEmail(email);
			trabajador.setPassword(password);
			TrabajadorDAOImplementation.getInstance().createTrabajador(trabajador);
		}
		else {
			Gestor gestor = new Gestor();
			gestor.setName(tipo);
			gestor.setEmail(email);
			gestor.setPassword(password);
			GestorDAOImplementation.getInstance().createGestor(gestor);
		}
		
		resp.sendRedirect(req.getContextPath() + "/LoginRRHH.jsp");

		
	}

	
	
}