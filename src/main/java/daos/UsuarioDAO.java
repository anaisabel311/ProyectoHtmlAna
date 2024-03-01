package daos;

import java.util.List;

import Pojos.UsuarioTabla;
import jakarta.persistence.EntityManager;
import servlets.UsuarioServlet;
import utils.JpaUtil;

public class UsuarioDAO  {
	
	private EntityManager em = JpaUtil.getEM();
	
	
// método listar desde bbdd
	
	public List<UsuarioTabla> get () {
		
		List<UsuarioTabla> usuarios = em.createQuery("from UsuarioTabla").getResultList();
		return usuarios;
	}
	
// método listar por PK desde bbdd
	
	public UsuarioTabla getByPk (long id) {
		UsuarioTabla usuario=em.find(UsuarioTabla.class, id);
		 return usuario;
	}
	
// método insertar en bbdd	
	
	public void insert (UsuarioTabla usuario) {
		System.out.println("Comenzando la insercion de usuarios en la bbdd");
		this.em.getTransaction().begin();
		try{
			em.persist(usuario);
			this.em.getTransaction().commit();
		}catch (Exception e) {
			System.out.println("Error al insertar usuario " + e.getMessage());
			this.em.getTransaction().rollback();
		}
	
	}
	
	
	

}
