package servlets;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import managers.filmManager;
import managers.korisnikManager;
import model.Film9;
import model.Korisnik9;

/**
 * Servlet implementation class registracija
 */
public class registracija extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registracija() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ime = request.getParameter("ime");
		String prezime = request.getParameter("prezime");
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		String email = request.getParameter("email");
		

			try {
				List<String> sviUser = new korisnikManager().getUserNames();
				System.out.println(sviUser.size());
				//Korisnik9 k = new korisnikManager().saveKorisnik(ime,prezime, user, pass, email);
				String poruka;
				if (sviUser.contains(user)){
					poruka = "Korisnik sa ovim username vec postoji u bazi";
				}else{
					Korisnik9 k = new korisnikManager().saveKorisnika(ime,prezime, user, pass, email);
					if(k == null){
					poruka = "korisnik nije sacuvan";
					}else{
						poruka="korisnik je sacuvan";
					}
					}
				
				request.setAttribute("poruka", poruka);
				RequestDispatcher rd = request.getServletContext()
						.getRequestDispatcher("/registracijaKorisnika.jsp");
				rd.forward(request, response);

			} catch (Exception e) {

			}

		doGet(request, response);
	}

}
