package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import managers.filmManager;
import managers.repertoarManager;
import model.Film9;

/**
 * Servlet implementation class ocenaFilm
 */
public class ocenaFilmaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ocenaFilmaServlet() {
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
			// TODO Auto-generated method stub
			Film9 f = (Film9) request.getSession().getAttribute("f");
			String vote = request.getParameter("rating");
			try{
				
			new repertoarManager().saveOcena(Float.parseFloat(vote),f);
			double sum = new repertoarManager().br(f.getIdfil());
			float a = (float)sum;
			new filmManager().update2(f.getIdfil(), a);
			RequestDispatcher rd = request.getServletContext()
					.getRequestDispatcher("/prikazDetaljaFilma.jsp");
			rd.forward(request, response);
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	}
