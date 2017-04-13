package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Repertoar9;
import managers.repertoarManager;

/**
 * Servlet implementation class prikazRepertoara
 */
@WebServlet("/prikazRepertoara")
public class prikazRepertoara extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public prikazRepertoara() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	
    @Override
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
    		List<Repertoar9> rep = new repertoarManager().getRepertoare();
		    System.out.println(rep.size());
		    System.out.println("velicina");
    	
		request.setAttribute("rep", rep);
		getServletConfig().getServletContext().getRequestDispatcher("/prikaziRepertoara.jsp")
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
