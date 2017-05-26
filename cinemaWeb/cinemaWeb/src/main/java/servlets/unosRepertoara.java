package servlets;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Film9;
import model.Repertoar9;
import managers.filmManager;
import managers.repertoarManager;


/**
 * Servlet implementation class SaveClanServlet
 */
public class unosRepertoara extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public unosRepertoara() {
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
		String naziv = request.getParameter("nazivi");
		String vreme = request.getParameter("vreme");
		String datumpro = request.getParameter("datumpro");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		repertoarManager rm = new repertoarManager();
		
		String poruka;
		try{
			
			Date d1 =(Date)format.parse(vreme);
			Time time = new Time(d1.getTime());
			
			Date datumprodate = sdf.parse(datumpro);
			 
			
			Film9 f = new filmManager().findNaziv(naziv);
			
			Repertoar9 r = rm.saveRepertoar(Integer.parseInt(cena),dan,Integer.parseInt(mesta),sala,tip,f,time,datumprodate);
			
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
