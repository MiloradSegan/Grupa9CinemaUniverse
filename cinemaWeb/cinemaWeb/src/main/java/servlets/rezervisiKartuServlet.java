package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import managers.filmManager;
import managers.korisnikManager;
import managers.repertoarManager;
import model.Film9;
import model.Korisnik9;
import model.Repertoar9;
import model.Rezervacija9;

/**
 * Servlet implementation class rezervisiKartu
 */
public class rezervisiKartuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public rezervisiKartuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idrep = request.getParameter("id");
		Repertoar9 rep1 = new repertoarManager().getRepForId(Integer.parseInt(idrep)); 
		System.out.println("asdas" + rep1.getMesta());
		request.getSession().setAttribute("rep1", rep1);
		getServletConfig().getServletContext().getRequestDispatcher("/rezervacijaKarte.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Repertoar9 r = (Repertoar9)request.getSession().getAttribute("rep1");
	    String brmesta = request.getParameter("brm");
       String name=(String)request.getSession().getAttribute("ulogovanUser");
       String poruka;
       try{
	        Integer br = r.getMesta() - Integer.parseInt(brmesta);
			Korisnik9 k = new korisnikManager().korisnikUser(name);
			new repertoarManager().update1(r.getIdrep(),br);
			Rezervacija9 rez = new korisnikManager().saveRezervaciju(Integer.parseInt(brmesta),k , r);
			if(rez != null){
				poruka="uspesno ste snimili rezervaciju";
			}else{
				poruka="rezervacija nije snimljena";
			}
			

			request.setAttribute("poruka", poruka);
			
			getServletConfig().getServletContext().getRequestDispatcher("/rezervacijaKarte.jsp").forward(request, response);
       }catch(Exception e){
    	   e.printStackTrace();
       }

	
}

}