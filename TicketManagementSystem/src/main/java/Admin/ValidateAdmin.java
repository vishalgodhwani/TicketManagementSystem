package Admin;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Database.Database;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns="/validateadmin")

public class ValidateAdmin extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		Database d = (Database) session.getAttribute("d");
		//pw.print(d.toString());
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		if(name.equals("s")) {
			if(password.equals("s")) {
				String output = "Welcome Shravani";
				request.setAttribute("output", output);
				request.getRequestDispatcher("/WEB-INF/views/adminpage.jsp").forward(request, response);
			}
			else {
				String output="Invalid Password!\n"+"Try Again";
				request.setAttribute("output", output);
				request.getRequestDispatcher("/WEB-INF/views/admin.jsp").forward(request, response);
			}
		}
		else {
			String output="Invalid Name!\n"+"Try Again";
			request.setAttribute("output", output);
			request.getRequestDispatcher("/WEB-INF/views/admin.jsp").forward(request, response);
		}
	}
}
