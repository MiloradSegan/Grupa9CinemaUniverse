package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import managers.repertoarManager;
import model.Repertoar9;

/**
 * Servlet implementation class prikazRepertoaraAdmin
 */
public class prikazRepertoaraAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public prikazRepertoaraAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		List<Repertoar9> rep = new repertoarManager().getRepertoare();
		System.out.println(rep.size());
	
	    request.setAttribute("rep", rep);
	  
	getServletConfig().getServletContext().getRequestDispatcher("/prikaziRepertoaraAdmin.jsp")
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
