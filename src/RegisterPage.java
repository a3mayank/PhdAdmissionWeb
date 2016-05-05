/*
 * Mohammad Nayeem
 * 2014147
 * Mayank Attri
 * 2014063 
 */
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterPage")
public class RegisterPage extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("login.jsp");
		RequetsDispatcherObj.forward(request, response);
		
		//out.print("<a href=\"https://accounts.google.com/o/oauth2/auth?scope=email%20profile&response_type=code&state=%2Fprofile&redirect_uri=http://localhost:8080/final_/hello&client_id=1055932237333-8d95lmbqtv6u5ju3j4pkbijug6dbd446.apps.googleusercontent.com\">Signin</a>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		doGet(request, response);
	}

}