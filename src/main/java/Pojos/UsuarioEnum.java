package Pojos;

public enum UsuarioEnum {

		    ADMINSR("ADMINSR"),
		    ADMINJR("ADMINJR"),
		    PROGRAMSR("PROGRAMSR"),
		    PROGRAMJR("PROGRAMJR"),
		    USER("USUARIO"); 
		    

		    private final String nombre;

		    UsuarioEnum(String nombre) {
		        this.nombre = nombre;
		    }

		    public String getNombre() {
		        return nombre;
		    }
		    

		    public static UsuarioEnum getRol(String nombre) {
		        for (UsuarioEnum rol : UsuarioEnum.values()) {
		            if (rol.getNombre().equalsIgnoreCase(nombre)) {
		                return rol;
		            }
		        }
		       
		        System.out.println(nombre + " no es un valor válido de RolUsuario");
		        return null; 
		    }
	}

