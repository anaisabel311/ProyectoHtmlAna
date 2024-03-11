package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Pojos.RolTabla;
import Pojos.UsuarioEnum;
import daos.RolDao;
import daos.UsuarioDAO;




/**
 * Servlet implementation class AlumnoServlet
 */

public class LoginServlet extends HttpServlet {
	private static final Logger logger = LogManager.getLogger(LoginServlet.class);
	
	private static final long serialVersionUID = 1L;
	private String subtitulo;
	private RolDao roldao;
	
    public LoginServlet() {
       super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		subtitulo = config.getInitParameter("subtitle");
		
		roldao = new RolDao();
		if(roldao.isVacio()) {
		roldao.insert(new RolTabla(UsuarioEnum.USER.toString()));
		roldao.insert(new RolTabla(UsuarioEnum.ADMINJR.toString()));
		roldao.insert(new RolTabla(UsuarioEnum.ADMINSR.toString()));
		roldao.insert(new RolTabla(UsuarioEnum.PROGRAMSR.toString()));
		roldao.insert(new RolTabla(UsuarioEnum.PROGRAMJR.toString()));
		}	
		
		
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
		
// recogemos los datos introducidos en el LoginUsuario		
		
		String passUsuario = request.getParameter("password");
		String idUsuario = request.getParameter("username");
		
		UsuarioDAO rao = new UsuarioDAO(); 
		
// validamos los logins	
		
		if (rao.isValidLogin(idUsuario, passUsuario)) {
            logger.info("Credenciales válidas");
            RequestDispatcher rd = request.getRequestDispatcher("FormUsuario.jsp");
    		rd.forward(request, response);
       
        } else {
            logger.info("Credenciales inválidas");
           
            response.sendRedirect("loginUsuario.jsp"); 
        }
    }
		
// pasamos los datos al FormUsuario
		
		//request.setAttribute(passUsuario, "password");
		//request.setAttribute(idUsuario, "idUsuario");
		

	
	}	
