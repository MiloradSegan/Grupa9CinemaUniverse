package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import managers.korisnikManager;
import model.Korisnik9;
import model.Rezervacija9;

/**
 * Servlet implementation class pregledRezervacija
 */
public class pregledRezervacija extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pregledRezervacija() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = (String) request.getSession().getAttribute("ulogovan");
		Korisnik9 k = new korisnikManager().korisnikUser(name);
		System.out.println(k.getIdkor());
		List<Rezervacija9> rez= new korisnikManager().getRezervacije(k.getIdkor());
		System.out.println(rez.size());
		request.setAttribute("rez", rez);
		getServletConfig().getServletContext().getRequestDispatcher("/pregledRezervacija.jsp")
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
