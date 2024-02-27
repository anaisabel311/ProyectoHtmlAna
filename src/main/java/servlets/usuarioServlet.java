package servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Pojos.RolTabla;
import Pojos.UsuarioTabla;
import daos.UsuarioDAO;

/**
 * Servlet implementation class AlumnoServlet
 */

public class usuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String subtitulo;
	
    public usuarioServlet() {
       super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		subtitulo=config.getInitParameter("subtitle");
		System.out.println("Entrando init con subtitulo "+ subtitulo );
		super.init(config);
	}
		
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println ("Está dentro del doGet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/**
	 *
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println ("Está dentro del doPost");
		
// recogemos los datos introducidos en el FormUsuario		
		
		String nomUsuario = request.getParameter("NombreUsuario");
		String apeUsuario = request.getParameter("ApellidosUsuario");
		String passUsuario = request.getParameter("password");
		String idUsuario = request.getParameter("IdUsuario");
		String emailUsuario = request.getParameter("EmailUsuario");
		String telUsuario = request.getParameter("TelefonoUsuario");
		String sexUsuario = request.getParameter("sexo");
		
		String fnacUsuariostr = request.getParameter("FechaNaciemiento");
		SimpleDateFormat fnacUsuario = new SimpleDateFormat(fnacUsuariostr);
		
		String dniUsuario = request.getParameter("DniUsuario");
		
		String[] rolUsuario = request.getParameterValues("SeleccionRol");
		List<RolTabla> usuarioRoles = new ArrayList();
		for (String rol : rolUsuario) {
			RolTabla rols = new RolTabla(rol);
			usuarioRoles.add(rols);
		}
		
// crear objeto tipo usuarioDAO 
		
		UsuarioDAO udao = new UsuarioDAO ();
		UsuarioTabla usuario = null;
		try {
			 usuario = new UsuarioTabla (
					usuarioRoles,
					nomUsuario, 
					apeUsuario,
					passUsuario,
					idUsuario,
					emailUsuario,
					Integer.parseInt(telUsuario),
					fnacUsuario.parse("dd/mm/yyyy"),
					sexUsuario,
					dniUsuario);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
// Insertamos el usuario en la bbdd
		
		udao.insert(usuario);
		
		
		
		
		
		
		
		
		
		
		
	}

}
