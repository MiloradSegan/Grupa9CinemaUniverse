package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import managers.repertoarManager;
import model.Repertoar9;

/**
 * Servlet implementation class brMestaServlet
 */
public class slobodnaMestaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public slobodnaMestaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String br = request.getParameter("br");
		
		try{
			List<Repertoar9> rep = new repertoarManager().brojSlobodnihMesta(Integer.parseInt(br));
	   
			request.setAttribute("rep", rep);
			getServletConfig().getServletContext().getRequestDispatcher("/brMesta.jsp")
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
