package connection;

import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Severlet3
 * @param <RequestDispatcher>
 */
@WebServlet("/Servlet1")
public class Servlet1<RequestDispatcher> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public Servlet1() {
    	
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		javax.servlet.RequestDispatcher rd = null;
		if(username.equalsIgnoreCase("tom")&& (password.equals("jerry"))) {
			rd=request.getRequestDispatcher("SuccessServlet");
			rd.forward(request, response);
		
			
			
		} else {
			rd=request.getRequestDispatcher("Login.html");
			PrintWriter out=response.getWriter();
			rd.include(request, response);
			out.println("<center> <span style='color:red'> Invalid credentials </span></center>");
			
					
		}}}



