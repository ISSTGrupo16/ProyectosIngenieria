package es.upm.dit.isst.webLab.servlets;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.webLab.dao.GestorDAOImplementation;
import es.upm.dit.isst.webLab.dao.model.Gestor;



@WebServlet("/FormProyecto1Servlet")
public class FormProyecto1Servlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Gestor> gestor_list = GestorDAOImplementation.getInstance().readAllGestor();
		req.getSession().setAttribute("gestor_list", gestor_list);
		resp.sendRedirect(req.getContextPath() + "/FormProyecto1.jsp");
		
	
		
	}
	
}
