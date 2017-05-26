package servlets;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import model.Film9;
import managers.filmManager;

/**
 * Servlet implementation class unosFilmaServlet2
 */
@MultipartConfig(maxFileSize = 16177215)
public class unosFilmaServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public unosFilmaServlet1() {
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
		String naziv = request.getParameter("naziv");
		String opis = request.getParameter("opis");
		String zanr = request.getParameter("zanr");
		String glumci = request.getParameter("glumci");
		String reditelj = request.getParameter("reditelj");
		String trailer = request.getParameter("trailer");
		
		String poruka;  
			try {
				
				Film9 f = new filmManager().saveFilm(naziv,trailer, opis, zanr, glumci,/* sl,*/reditelj);
				
				if (f == null)
					poruka = "Doslo je do greske, film nije sacuvan";
				else
					poruka = "Film je sacuvan";

				request.setAttribute("poruka", poruka);
				RequestDispatcher rd = request.getServletContext()
						.getRequestDispatcher("/unosFilma.jsp");
				rd.forward(request, response);

			} catch (Exception e) {

			}

		doGet(request, response);
	}

}
