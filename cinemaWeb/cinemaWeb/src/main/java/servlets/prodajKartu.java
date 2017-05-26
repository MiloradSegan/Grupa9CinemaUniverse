package servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import managers.korisnikManager;
import managers.radnikManager;
import managers.repertoarManager;
import model.Karta9;
import model.Korisnik9;
import model.Repertoar9;
import model.Rezervacija9;

/**
 * Servlet implementation class prodajKartuServlet
 */
public class prodajKartu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public prodajKartu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String idrep = request.getParameter("id");
			Repertoar9 rep = new repertoarManager().getRepForId(Integer.parseInt(idrep)); 
			request.getSession().setAttribute("rep", rep);
			getServletConfig().getServletContext().getRequestDispatcher("/prodajaKarte1.jsp")
			.forward(request, response);
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Repertoar9 r = (Repertoar9)request.getSession().getAttribute("rep");
		    String brmesta = request.getParameter("brm");

	       String name=(String)request.getSession().getAttribute("ulogovanRadnik");
		   Date datum = new Date();
		    Integer br = r.getMesta() - Integer.parseInt(brmesta);
				Korisnik9 k = new korisnikManager().korisnikUser(name);
				new repertoarManager().update1(r.getIdrep(),br);
				Karta9 kat = new radnikManager().prodajKartu(r, k, datum, (float)(r.getCena()),Integer.parseInt(brmesta));
				String poruka;
				if(kat !=null){
					poruka="Uspesno ste prodali kartu";
				}else{
					poruka="Niste prodali kartu";
				}

				request.setAttribute("poruka", poruka);
				
				getServletConfig().getServletContext().getRequestDispatcher("/prodajaKarte1.jsp").forward(request, response);
		}

	}
