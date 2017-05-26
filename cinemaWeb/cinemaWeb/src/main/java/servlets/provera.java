package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import managers.korisnikManager;
import managers.repertoarManager;
import model.Komentar9;
import model.Repertoar9;

/**
 * Servlet implementation class provera
 */
public class provera extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public provera() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idfil = request.getParameter("idfil");
	    Integer a = 1;
	   new repertoarManager().update1(Integer.parseInt(idfil),55);
		
		//rep.setMesta(rep.getMesta()-a);
		
	 //  System.out.println(rep.getMesta());
	    System.out.println("velicina");
	   // request.setAttribute("rep", rep);
	//request.setAttribute("kom", kom);
	
	    
	    	
	    
	getServletConfig().getServletContext().getRequestDispatcher("/Pocetna.jsp")
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
