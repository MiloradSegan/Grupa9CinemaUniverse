package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Film9;
import model.Komentar9;
import model.Repertoar9;
import managers.filmManager;
import managers.korisnikManager;
import managers.repertoarManager;

/**
 * Servlet implementation class prikazRepertoara
 */

public class prikazRepertoaraGost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public prikazRepertoaraGost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	
    @Override
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	    String idfil = request.getParameter("idfil");
    		List<Repertoar9> rep = new repertoarManager().getRepertoare();
		    request.setAttribute("rep", rep);
		    
		    
		getServletConfig().getServletContext().getRequestDispatcher("/gostPanel1.jsp")
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
