package UsuarioTablas;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table (name="TB_ROLUSUARIO")

public class RolTabla {
	
	@Id
	 @SequenceGenerator (name="ROLUSUARIOSGEN", sequenceName="ROLUSUARIOS_GEN", initialValue=1, allocationSize=1)
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ROLUSUARIOSGEN")
	 @Column (name="ID",nullable = false, updatable = false)
	 private long id;
	 
	 @JoinColumn(name = "FK_id", nullable = false, updatable = false)
	 
	 
	 @Column (name= "RolUsuario", length=20, nullable=false)
	 private String RolUsuario;

// CONSTRUCTORES	 
	 
	public RolTabla() {
		super();
	}

	public RolTabla(long id, String rolUsuario) {
		super();
		this.id = id;
		RolUsuario = rolUsuario;
	}
	
// GETTERS AND SETTERS	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRolUsuario() {
		return RolUsuario;
	}

	public void setRolUsuario(String rolUsuario) {
		RolUsuario = rolUsuario;
	}
	 
	 


	
}
