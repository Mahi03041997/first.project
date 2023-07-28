

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
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
		doGet(request, response);
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String fathername = request.getParameter("fathername");
		String mothername = request.getParameter("mothername");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		String educlass = request.getParameter("educlass");
		String number = request.getParameter("number");
		String email = request.getParameter("email");
		String PaymentOption = request.getParameter("PaymentOption");
		
		PrintWriter out = response.getWriter();
		Details det = new Details(firstname, lastname, fathername, mothername, gender, dob, educlass, number, email, PaymentOption);
		DataConnection datacon = new DataConnection();
		String finalresult  = datacon.Insert(det);
		if(finalresult.equals("Registration Done Succesfully"));
		{
			out.println("<script type=\"text/javascript\">");
		out.println("<alert (Registration Done Succesfully)>");
		out.println("</script>");
		response.sendRedirect("index.html");
		}

	}

}
