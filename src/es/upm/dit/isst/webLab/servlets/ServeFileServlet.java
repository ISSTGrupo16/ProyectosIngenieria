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



@WebServlet("/ServeFileServlet")
public class ServeFileServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Proyecto proyecto = (Proyecto) req.getSession().getAttribute("proyecto");
		
		resp.setContentLength(proyecto.getDocument().length);
		resp.getOutputStream().write(proyecto.getDocument());
		
		}
	
}