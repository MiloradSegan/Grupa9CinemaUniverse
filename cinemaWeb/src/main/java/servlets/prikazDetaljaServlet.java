package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import managers.filmManager;
import managers.korisnikManager;
import managers.repertoarManager;
import model.Film9;
import model.Komentar9;
import model.Repertoar9;

/**
 * Servlet implementation class prikazDetaljaFilma
 */
public class prikazDetaljaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public prikazDetaljaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	String s = request.getParameter("idfil");
    	
		Film9 f = new filmManager().getFilmForId(Integer.parseInt(s));
		List<Komentar9> kom = new korisnikManager().getKomentare(Integer.parseInt(s));
	
	request.setAttribute("kom", kom);
	request.getSession().setAttribute("f", f);
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
