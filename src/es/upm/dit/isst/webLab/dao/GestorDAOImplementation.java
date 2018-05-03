package es.upm.dit.isst.webLab.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import es.upm.dit.isst.webLab.dao.model.Gestor;

public class GestorDAOImplementation implements GestorDAO{

	private static GestorDAOImplementation instance;
	private GestorDAOImplementation() {};
	public static GestorDAOImplementation getInstance() {
		if(null== instance) instance = new GestorDAOImplementation();
		return instance;
	}

	@Override
	public void createGestor(Gestor gestor) {
		// TODO Auto-generated method stub
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.save(gestor);
			session.getTransaction().commit();
		}
		catch (Exception e){
			
		}finally {
			session.close();
		}
		
	}

	@Override
	public Gestor readGestor(String email) {
		// TODO Auto-generated method stub
		Gestor gestor = null;
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			gestor = session.get(Gestor.class, email);
			session.getTransaction().commit();
		}
		catch(Exception e) {
			
		}finally {
			session.close();
		}
		return gestor;
	}

	@Override
	public void updateGestor(Gestor gestor) {
		// TODO Auto-generated method stub
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(gestor);
			session.getTransaction().commit();
		}
		catch (Exception e){
			
		}finally {
			session.close();
		}
		
	}

	@Override
	public void deleteGestor(Gestor gestor) {
		// TODO Auto-generated method stub
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.delete(gestor);
			session.getTransaction().commit();
		}
		catch (Exception e){
			
		}finally {
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Gestor> readAllGestor() {
		// TODO Auto-generated method stub
		List<Gestor> gestors = new ArrayList<>();
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			gestors.addAll(
					session.createQuery("from Gestor").list()
					);
			
			session.getTransaction().commit();
		}
		catch (Exception e){
			
		}finally {
			session.close();
		}
		return gestors;
	}
	
	
	public Gestor loginGestor(String email, String password) {
		// TODO Auto-generated method stub
		Gestor gestor = null;
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();

			gestor = (Gestor) session.createQuery("select p from Gestor p where p.email =:email and p.password = :password")
				.setParameter("email", email)
				.setParameter("password", password)
				.getSingleResult();
			
			session.getTransaction().commit();
		}
		catch (Exception e){
			
		}finally {
			session.close();
		}
		return gestor;
	}

}



