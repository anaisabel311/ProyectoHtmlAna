package daos;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Pojos.UsuarioTabla;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import servlets.LoginServlet;
import servlets.UsuarioServlet;
import utils.JpaUtil;

public class UsuarioDAO  {
	
	private EntityManager em = JpaUtil.getEM();
	
	private static final Logger logger = LogManager.getLogger(UsuarioDAO.class);
	
// método listar desde bbdd
	
	public List<UsuarioTabla> get () {
		logger.info("Listando usuarios en tabla");
		List<UsuarioTabla> usuarios = em.createQuery("from UsuarioTabla").getResultList();
		return usuarios;
	}
	
// método listar por PK desde bbdd
	
	/*
	 * public UsuarioTabla getByPk (long id) { UsuarioTabla
	 * usuario=em.find(UsuarioTabla.class, id); return usuario; }
	 */
	
// método insertar en bbdd	
	
	public void insert (UsuarioTabla usuario) {
		logger.info("Comenzando la insercion de usuarios en la bbdd");
		this.em.getTransaction().begin();
		try{
			em.persist(usuario);
			this.em.getTransaction().commit();
		}catch (Exception e) {
			logger.info("Error al insertar usuario " + e.getMessage());
			this.em.getTransaction().rollback();
		}
	
	}

	// validar parametros login
	
	public boolean isValidLogin(String idUsuario, String passUsuario) {
		Query query = em.createQuery("from UsuarioTabla ut where ut.idUsuario=?1 and ut.passUsuario=?2", UsuarioTabla.class);
		query.setParameter(1, idUsuario);
		query.setParameter(2, passUsuario);
		UsuarioTabla logins = null;
		try {
			logins = (UsuarioTabla) query.getSingleResult();
			return true;
		}catch(NoResultException nre) {
			//logger.error("Credenciales repetidas" + nre);
			return false;
		}

		
	}	
	


}
