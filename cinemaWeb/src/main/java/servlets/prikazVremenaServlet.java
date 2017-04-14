package servlets;

import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import managers.repertoarManager;
import model.Repertoar9;

/**
 * Servlet implementation class prikazVremenaServlet
 */
public class prikazVremenaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public prikazVremenaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String vreme = request.getParameter("vreme");
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		
		try{
			
			Date d1 =(Date)format.parse(vreme);
			Time time = new Time(d1.getTime());
		List<Repertoar9> rep = new repertoarManager().poVremenu(time);
	    System.out.println(rep.size());
	    System.out.println("velicina");
		
	request.setAttribute("rep", rep);
	getServletConfig().getServletContext().getRequestDispatcher("/prikazVremena.jsp")
	.forward(request, response);
		}catch(Exception e){
			
		}
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
