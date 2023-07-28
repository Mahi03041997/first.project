package z1project;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		doGet(request, response);
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String fathername = request.getParameter("fathername");
		String mothername = request.getParameter("mothername");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		String number = request.getParameter("number");
		String email = request.getParameter("email");
		String adhar = request.getParameter("adhar");
		String adress = request.getParameter("adress");
		String payment = request.getParameter("payment");
		String password = request.getParameter("password");
		
		Connectionin coo = new Connectionin();
		Encap encap = new Encap(firstname, lastname, fathername, mothername, gender, dob, number, email, adhar, adress, password, payment);
		try {
			int result = coo.Register(encap);
			response.getWriter().print("Registration succesfull");
			response.sendRedirect("Login.jsp");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
