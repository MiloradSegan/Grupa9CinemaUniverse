package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import managers.korisnikManager;
import managers.radnikManager;
import model.Korisnik9;
;

/**
 * Servlet implementation class unosZaposlenog
 */
public class unosRadnikaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public unosRadnikaServlet() {
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
		String poruka;

			try {
				List<String> sviUser = new radnikManager().getUserNamesZap();
				
				//Korisnik9 k = new korisnikManager().saveKorisnik(ime,prezime, user, pass, email);
				
				if (sviUser.contains(user)){
					poruka = "Radnik sa ovim username vec postoji u bazi";
				}else{
					Korisnik9 z = new radnikManager().saveRadnika(ime,prezime, user, pass, email);
					if(z == null){
					poruka = "Zaposleni nije sacuvan";
					}else{
						poruka="Zaposleni je sacuvan";
					}
					}
				
				request.setAttribute("poruka", poruka);
				RequestDispatcher rd = request.getServletContext()
						.getRequestDispatcher("/unosRadnika.jsp");
				rd.forward(request, response);

			} catch (Exception e) {

			}

		doGet(request, response);
	}

}