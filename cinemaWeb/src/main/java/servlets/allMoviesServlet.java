package servlets;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
import model.Komentar9;
import model.Korisnik9;
import model.Repertoar9;

/**
 * Servlet implementation class allMoviesServlet
 */
public class allMoviesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public allMoviesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tekst = request.getParameter("komentar");
		String naziv= request.getParameter("nazivi");
		//String datumpro = request.getParameter("df");
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	    String user = request.getParameter("user");
		Date date1 = new Date();
		HttpSession session=request.getSession(false);  
        
        String name=(String)session.getAttribute("ulogovan");
        
		try{
			//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		
			//Date datumprodate = sdf.parse(datumpro);
			String poruka;
			Korisnik9 k = new korisnikManager().korisnikUser(name);
			Film9 f = new filmManager().findNaziv(naziv);
			
			Komentar9 r = new korisnikManager().saveKomentar(f,k, tekst,date1);
			
			if(r!=null){
				poruka="Uspesno ste snimili repertoar";
			}else{
				poruka="Greska prilikom snimanja";
			}
			request.setAttribute("poruka", poruka);
			RequestDispatcher rd = request.getServletContext()
					.getRequestDispatcher("/prikazfilmova.jsp");
			rd.forward(request, response);

		}catch(Exception e){
			e.getMessage();
		}
	}

}