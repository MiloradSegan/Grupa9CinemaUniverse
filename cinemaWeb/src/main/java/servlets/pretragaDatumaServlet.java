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
 * Servlet implementation class pretragaPoDatumuServlet
 */
public class pretragaDatumaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pretragaDatumaServlet () {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String datumOd = request.getParameter("dat");
        String datumDo = request.getParameter("datum");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		try{
			Date d1 = sdf.parse(datumOd);
			Date d2 = sdf.parse(datumDo);
			
		List<Repertoar9> rep = new repertoarManager().pretragaDatuma(d1, d2);
	    System.out.println(rep.size());
	   
		
	request.setAttribute("rep", rep);
	getServletConfig().getServletContext().getRequestDispatcher("/pretragaPoDatumu.jsp")
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
