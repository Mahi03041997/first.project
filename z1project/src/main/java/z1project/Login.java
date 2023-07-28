package z1project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Encap e = new Encap();
		e.setEmail(username);
		e.setPassword(password);
		Connectionin con = new Connectionin();
		try {
			if(con.validate(e)) {
				
				out.println("<script type=\"text/javascript\">");
			       out.println("alert('Login Success');");
			       out.println("</script>");
			       response.sendRedirect("welcome.jsp"); 
			}else {
				out.println("<script type=\"text/javascript\">");
			       out.println("alert('User or password incorrect');");
			       out.println("</script>");
			       
			       response.sendRedirect("Login.jsp");
			}
			
		}catch(Exception ee) {
			response.getWriter().print(ee);
		}
		}

		
	}


