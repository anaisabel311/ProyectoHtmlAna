package daos;

import java.util.List;

import Pojos.RolTabla;
import jakarta.persistence.EntityManager;
import utils.JpaUtil;

public class RolDao {
	
	

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
			System.out.println("Comenzando la insercion de roles en la bbdd");
			this.em.getTransaction().begin();
			try{
				em.persist(rol);
				this.em.getTransaction().commit();
			}catch (Exception e) {
				System.out.println("Error al insertar roles " + e.getMessage());
				this.em.getTransaction().rollback();
			}
		
		}
}
