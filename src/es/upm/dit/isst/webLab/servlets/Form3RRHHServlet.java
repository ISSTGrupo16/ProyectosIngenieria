package es.upm.dit.isst.webLab.servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.webLab.dao.ProyectoDAO;
import es.upm.dit.isst.webLab.dao.ProyectoDAOImplementation;
import es.upm.dit.isst.webLab.dao.model.Proyecto;




@WebServlet("/Form3RRHHServlet")
public class Form3RRHHServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String proyectoEmail = req.getParameter("proyecto_email");
		Proyecto proyecto = ProyectoDAOImplementation.getInstance().readProyecto(proyectoEmail);
		proyecto.setStatus(3);
		ProyectoDAOImplementation.getInstance().updateProyecto(proyecto);
		resp.sendRedirect(req.getContextPath() + "/LoginRRHH.jsp");
		
	
		
	}
	
}