package com2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import connection.Servlet1;

/**
 * Servlet implementation class SuccessServlet
 */
@WebServlet("/SuccessServlet")
public class SuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuccessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		out.print("<div> <center><h2>  Welcome " +request.getParameter("username") + "! to the Learners Academy Portal </h2></center>"
+
				"<center><h3>Please select from the possible options</h3></center>"

+
"<center><button onclick=\"window.location.href='Login.html';\">\n"
+ "      Login Page\n"
+ "    </button></center>"
+
"<center><button onclick=\"window.location.href='Students.jsp';\">\n"
+ "      View master list of all the students\n"
+ "    </button></center>"
+
"<center><button onclick=\"window.location.href='Teachers.jsp';\">\n"
+ "      View master list of all the teachers\n"
+ "    </button></center>"
+
"<center><button onclick=\"window.location.href='Subjects.jsp';\">\n"
+ "      View master list of all the subjects\n"
+ "    </button></center>"
+
"<center><button onclick=\"window.location.href='Classes.jsp';\">\n"
+ "      View master list of all the classes\n"
+ "    </button></center>"
+
"<center><button onclick=\"window.location.href='Assign.jsp';\">\n"
+ "      Assign classes for subjects from the Master List \n"
+ "    </button></center>"
+"<center><button onclick=\"window.location.href='AssignTeachers.jsp';\">\n"
+ "      Assign teachers to a class for subjects from the Master List \n"
+ "    </button></center>"
+"<center><button onclick=\"window.location.href='ClassReport.jsp';\">\n"
+ "      Class Report \n"
+ "    </button></center>");
		
				
		
	}
	
}
