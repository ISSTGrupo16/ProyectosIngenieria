package es.upm.dit.isst.webLab.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.webLab.dao.GestorDAOImplementation;
import es.upm.dit.isst.webLab.dao.ProyectoDAOImplementation;
import es.upm.dit.isst.webLab.dao.model.Gestor;
import es.upm.dit.isst.webLab.dao.model.Proyecto;




@WebServlet("/Form1ProyectoServlet")
public class Form1ProyectoServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String title = req.getParameter("title");
		String gestorEmail = req.getParameter("advisor");
		String numeroTrabajadores = req.getParameter("numeroTrabajadores");
		String numeroHorasTrabajadas = req.getParameter("numeroHorasTrabajadas");
		String numeroHorasTotales = req.getParameter("numeroHorasTotales");
		

	
		Gestor advisor = GestorDAOImplementation.getInstance().readGestor(gestorEmail);
		
		Proyecto proyecto = new Proyecto();
		
		proyecto.setEmail(email);
		proyecto.setName(name);
		proyecto.setTitle(title);
		proyecto.setPassword(password);
		proyecto.setAdvisor(advisor);
		proyecto.setNumeroTrabajadores(numeroTrabajadores);
		proyecto.setNumeroHorasTrabajadas(numeroHorasTrabajadas);
		proyecto.setNumeroHoras(numeroHorasTotales);
		
		
		
		proyecto.setStatus(1);
		
		ProyectoDAOImplementation.getInstance().createProyecto(proyecto);
		
		resp.sendRedirect(req.getContextPath()+"/LoginGestor.jsp");

		
	}
	
}