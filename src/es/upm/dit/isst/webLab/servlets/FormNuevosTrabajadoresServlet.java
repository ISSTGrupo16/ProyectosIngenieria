package es.upm.dit.isst.webLab.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.webLab.dao.ProyectoDAOImplementation;
import es.upm.dit.isst.webLab.dao.model.Gestor;
import es.upm.dit.isst.webLab.dao.model.Proyecto;
import es.upm.dit.isst.webLab.dao.model.Trabajador;

import java.util.List;

@WebServlet("/FormNuevosTrabajadoresServlet")
public class FormNuevosTrabajadoresServlet extends HttpServlet {
	
	private List <Trabajador> trabajadores;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		String proy_string = req.getParameter("proyecto");
		Object proyecto = req.getSession().getAttribute(proy_string);
		req.getSession().removeAttribute(proy_string);
		
		int tab_num = Integer.parseInt(req.getParameter("trabajador_num"));
		
		
		for (int i =0; i<tab_num ; i++) {
			
			trabajadores.add(trabajador +i);
			
			trabajador_${i} = proyecto.setListaTrabajadores(lista_trabajadores);
		}
		
		//proyecto.setStatus(1);
		
		//ProyectoDAOImplementation.getInstance().createProyecto(proyecto);
		
		resp.sendRedirect(req.getContextPath()+"/FormLogin.jsp");
		
		
		

		
	}

}
