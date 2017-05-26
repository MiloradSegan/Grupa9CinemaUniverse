package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import managers.filmManager;
import managers.repertoarManager;
import model.Film9;
import model.Repertoar9;

/**
 * Servlet implementation class prikazsvihfilmova
 */
@WebServlet("/prikazsvihfilmova")
public class prikazsvihfilmova extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public prikazsvihfilmova() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Film9> filmovi = new filmManager().sviFilmovi();
	    System.out.println(filmovi.size());
	   
	request.setAttribute("fil", filmovi);
	getServletConfig().getServletContext().getRequestDispatcher("/prikazfilmova.jsp")
	.forward(request, response);
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
