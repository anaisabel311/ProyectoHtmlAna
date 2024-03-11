package daos;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Pojos.RolTabla;

import jakarta.persistence.EntityManager;
import servlets.LoginServlet;
import utils.JpaUtil;

public class RolDao {
	
	private static final Logger logger = LogManager.getLogger(RolDao.class);

	private EntityManager em = JpaUtil.getEM();
	
	// método listar desde bbdd
	
		public List<RolTabla> get () {
			
			List<RolTabla> roles = em.createQuery("from RolTabla").getResultList();
			return roles;
		}
		
	// método listar por PK desde bbdd
		
		public RolTabla getByPk (long id) {
			RolTabla rolusuario=em.find(RolTabla.class, id);
			 return rolusuario;
		}
		
	// método insertar en bbdd	
		
		public void insert (RolTabla rol) {
			logger.info("Comenzando la insercion de roles en la bbdd");
			this.em.getTransaction().begin();
			try{
				em.persist(rol);
				this.em.getTransaction().commit();
			}catch (Exception e) {
				logger.info("Error al insertar roles " + e.getMessage());
				this.em.getTransaction().rollback();
			}
		
		}
		
	// mirar si hay datos en la bbdd
		
		
		public boolean isVacio() {
			List<RolTabla> roles = em.createQuery("from Roles", RolTabla.class).getResultList();
			logger.info(roles.size());
			boolean isVacio = false;
			if(roles.isEmpty()) {
				isVacio = true;
			}
			return isVacio;

		}
		
	
		
		
		
		
}
