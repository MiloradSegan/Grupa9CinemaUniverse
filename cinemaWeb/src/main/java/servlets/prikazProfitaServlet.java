package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import managers.radnikManager;
import managers.repertoarManager;
import model.Repertoar9;

/**
 * Servlet implementation class profitServlet
 */
public class prikazProfitaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public prikazProfitaServlet() {
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
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	     
		try{
			Date d1 = sdf.parse(datumOd);
			Date d2 = sdf.parse(datumDo);
			
		double sum = new radnikManager().getSum(d1, d2);
		String a =String.valueOf(sum);
		String poruka = "Profit u periodu od "+ datumOd + " do " + datumDo + " je " + a + " din. ";
		
	    
	    
	          
	   
		
	request.setAttribute("poruka", poruka);
	getServletConfig().getServletContext().getRequestDispatcher("/prikazProfita.jsp")
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
