package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class AlumnoServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String subtitulo;
	
    public LoginServlet() {
       super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		subtitulo = config.getInitParameter("subtitle");
		
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
		
// recogemos los datos introducidos en el LoginUsuario		
		
		String passUsuario = request.getParameter("password");
		String idUsuario = request.getParameter("username");
		
// pasamos los datos al FormUsuario
		
		request.setAttribute(passUsuario, "password");
		request.setAttribute(idUsuario, "idUsuario");
		
// redirigimos los datos al FormUsuario.jsp
		
		RequestDispatcher rd = request.getRequestDispatcher("FormUsuario.jsp");
		rd.forward(request, response);
	
	}	
}