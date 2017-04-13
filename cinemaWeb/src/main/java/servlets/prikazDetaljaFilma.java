package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import managers.filmManager;
import model.Film9;

/**
 * Servlet implementation class prikazDetaljaFilma
 */
public class prikazDetaljaFilma extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public prikazDetaljaFilma() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	String s = request.getParameter("idfil");
		
		Film9 f = new filmManager().getFilmForId(Integer.parseInt(s));
	    
	
	request.setAttribute("f", f);
	getServletConfig().getServletContext().getRequestDispatcher("/prikazDetaljaFilma.jsp")
	.forward(request, response);
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
