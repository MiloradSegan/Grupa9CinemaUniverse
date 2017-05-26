package servlets;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import managers.filmManager;
import managers.repertoarManager;
import model.Film9;
import model.Repertoar9;

/**
 * Servlet implementation class pretragaTipS
 */
@WebServlet("/pretragaTipS")
public class pretragaTipS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pretragaTipS() {
        super();
        // TODO Auto-generated constructor stub 
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //pretraga
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tip = request.getParameter("tip");
		List<Repertoar9> rep = new repertoarManager().pretragaTip(tip);
		request.setAttribute("rep", rep);
		getServletConfig().getServletContext().getRequestDispatcher("/pretragaTip.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response); 
	}

}
