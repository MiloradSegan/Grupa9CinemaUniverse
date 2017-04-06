package servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cinemaJPA.Film9;
import cinemaJPA.Repertoar9;
import managers.filmManager;
import managers.repertoarManager;


/**
 * Servlet implementation class SaveClanServlet
 */
public class unosRepertoaraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public unosRepertoaraServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cena = request.getParameter("cena");
		String dan = request.getParameter("dan");
		String mesta = request.getParameter("mesta");
		String sala = request.getParameter("sala");
		String tip = request.getParameter("tip");
		String id = request.getParameter("idfilm");
		
		repertoarManager rm = new repertoarManager();
		filmManager fm = new filmManager();
		try{
			String poruka;
			Film9 f = fm.getFilmForId(Integer.parseInt(id));
			
			Repertoar9 r = rm.saveRepertoar(Integer.parseInt(cena),dan,Integer.parseInt(mesta),sala,tip,f);
			
			if(r!=null){
				poruka="Uspesno ste snimili repertoar";
			}else{
				poruka="Greska prilikom snimanja";
			}
			request.setAttribute("poruka", poruka);
			RequestDispatcher rd = request.getServletContext()
					.getRequestDispatcher("/unosRepertoara.jsp");
			rd.forward(request, response);

		}catch(Exception e){
			e.getMessage();
		}
	}

}
