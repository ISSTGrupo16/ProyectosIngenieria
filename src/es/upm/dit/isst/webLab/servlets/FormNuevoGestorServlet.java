package es.upm.dit.isst.webLab.servlets;

import java.io.Console;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.webLab.dao.GestorDAOImplementation;
import es.upm.dit.isst.webLab.dao.model.Gestor;

@WebServlet("/FormNuevoGestorSecServlet")
public class FormNuevoGestorServlet extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		Gestor gestor = new Gestor();
		gestor.setName(name);
		gestor.setEmail(email);
		gestor.setPassword(password);
		
		GestorDAOImplementation.getInstance().createGestor(gestor);

		resp.sendRedirect(req.getContextPath() + "/LoginRRHH.jsp");

		
	}

	
	
}