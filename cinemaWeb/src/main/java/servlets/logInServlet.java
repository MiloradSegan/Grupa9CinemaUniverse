package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import managers.korisnikManager;
import managers.radnikManager;
import model.Korisnik9;


/**
 * Servlet implementation class logIn
 */
public class logInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");

		try{
			List<Korisnik9> k = new korisnikManager().logIn2(user,pass);
			if(k.size()!= 0){
			if(k.get(0).getZaposleni() == true) {
				if(k.get(0).getUsernamekor().equalsIgnoreCase("admin")){
				 response.sendRedirect("adminPanel.jsp");
				}else{
					response.sendRedirect("radnikPanel.jsp");
					request.getSession().setAttribute("ulogovanRadnik",user);
				}
				 
			}else {  	    
				request.getSession().setAttribute("ulogovanUser",user);
				 response.sendRedirect("korisnikPocetna.jsp");
			}
			}else{
				response.sendRedirect("eror.jsp");
			}
		
	   
		getServletConfig().getServletContext().getRequestDispatcher("/logIn.jsp");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
