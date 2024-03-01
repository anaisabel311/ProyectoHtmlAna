package Pojos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table (name = "TB_USUARIOSTABLA")

public class UsuarioTabla {
 @Id
 @SequenceGenerator (name="USUARIOSGEN", sequenceName="USUARIOS_GEN", initialValue=1, allocationSize=1)
 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USUARIOSGEN")
 @Column (name="IdUsuario",nullable = false, updatable = false)
 private long id;
 
 @ManyToMany (cascade=CascadeType.ALL, fetch = FetchType.LAZY)
 
 @JoinTable (name="TB_USUARIOS_ROLES")
 private List<RolTabla> roles = new ArrayList<RolTabla>();
 
 @Column (name= "NombreUsuario", length=20, nullable=false)
 private String nomUsuario;
 
 @Column (name= "ApellidosUsuario", length=40, nullable=false)
 private String apeUsuario;
 
 @Column (name= "Password", length=8, nullable=false)
 private String passUsuario;
 
 @Column (name= "IdUsuario", length=20, nullable=false)
 private String idUsuario;
 
 @Column (name= "Email", length=40, nullable=false)
 private String emailUsuario;
 
 @Column (name= "Teléfono", length=9, nullable=false)
 private int telUsuario;
 
 @Column (name= "FechaAlta", length=10, nullable=false)
 private Date fAlta;
 
 @Column (name= "Sexo", length=5, nullable=false)
 private String sexo;
 
 @Column (name= "DNI", length=10, nullable=false)
 private String dni;
 
 
 

 // CONSTRUCTORES
 
public UsuarioTabla() {
	super();
}

public UsuarioTabla( List<RolTabla> roles, String nomUsuario, String apeUsuario, String passUsuario,
		String idUsuario, String emailUsuario, int telUsuario, Date fAlta, String sexo, String dni) {
	super();
	this.roles = roles;
	this.nomUsuario = nomUsuario;
	this.apeUsuario = apeUsuario;
	this.passUsuario = passUsuario;
	this.idUsuario = idUsuario;
	this.emailUsuario = emailUsuario;
	this.telUsuario = telUsuario;
	this.fAlta = fAlta;
	this.sexo = sexo;
	this.dni = dni;
}


//GETTERS AND SETTERS


public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public List<RolTabla> getRoles() {
	return roles;
}

public void setRoles(List<RolTabla> roles) {
	this.roles = roles;
}

public String getNomUsuario() {
	return nomUsuario;
}

public void setNomUsuario(String nomUsuario) {
	this.nomUsuario = nomUsuario;
}

public String getApeUsuario() {
	return apeUsuario;
}

public void setApeUsuario(String apeUsuario) {
	this.apeUsuario = apeUsuario;
}

public String getPassUsuario() {
	return passUsuario;
}

public void setPassUsuario(String passUsuario) {
	this.passUsuario = passUsuario;
}

public String getIdUsuario() {
	return idUsuario;
}

public void setIdUsuario(String idUsuario) {
	this.idUsuario = idUsuario;
}

public String getEmailUsuario() {
	return emailUsuario;
}

public void setEmailUsuario(String emailUsuario) {
	this.emailUsuario = emailUsuario;
}

public int getTelUsuario() {
	return telUsuario;
}

public void setTelUsuario(int telUsuario) {
	this.telUsuario = telUsuario;
}

public Date getfAlta() {
	return fAlta;
}

public void setfAlta(Date fAlta) {
	this.fAlta = fAlta;
}

public String getSexo() {
	return sexo;
}

public void setSexo(String sexo) {
	this.sexo = sexo;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}








 
 
}
