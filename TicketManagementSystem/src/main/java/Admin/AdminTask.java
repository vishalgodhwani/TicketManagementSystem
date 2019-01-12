package Admin;
import Database.Database;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns="/admintask")

public class AdminTask extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String option = request.getParameter("admintask").toString();
		//pw.print("Hello"+option);
		HttpSession session = request.getSession();
		Database d = (Database) session.getAttribute("d");
		if(option.equals("logout")) {
			//pw.print("gr");
			String output = "Logout Successful";
			request.setAttribute("output", output);
			request.getRequestDispatcher("/WEB-INF/views/homepage.jsp").forward(request, response);
		}
		else if(option.equals("viewagentlist")) {
			String message = "The agent list will be displayed in below format ";
			request.setAttribute("message", message);
			request.getRequestDispatcher("/WEB-INF/views/viewagent.jsp").forward(request, response);
			//return;
		}
		else if(option.equals("addagent")) {
			request.getRequestDispatcher("/WEB-INF/views/newagent.jsp").forward(request, response);
		}
		else if(option.equals("removeagent")) {
			request.getRequestDispatcher("/WEB-INF/views/removeagent.jsp").forward(request, response);
		}
		else if(option.equals("addticket")){
			request.getRequestDispatcher("/WEB-INF/views/addticket.jsp").forward(request, response);
		}
	}
}
