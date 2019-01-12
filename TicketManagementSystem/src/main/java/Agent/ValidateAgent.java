package Agent;
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

@WebServlet(urlPatterns="/validateagent")

public class ValidateAgent extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		int  emp_id = (int) Integer.parseInt(request.getParameter("emp_id"));
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		Database d = (Database) session.getAttribute("d");
		session.setAttribute("emp_ID", emp_id);
		//pw.print("hello"+name);
		AgentCheck ag = new AgentCheck();
		int isValid = ag.agentcheck(d, emp_id, password);
		if(isValid==1) {
			String output="Welcome employee ";
			request.setAttribute("output", output);
			//request.setAttribute("emp_id", emp_id);
			request.getRequestDispatcher("/WEB-INF/views/agentpage.jsp").forward(request, response);
		}
		else if(isValid==-1) {
			String output = "Invalid Password!\n"+"Try Again";
			request.setAttribute("output", output);
			request.getRequestDispatcher("/WEB-INF/views/agent.jsp").forward(request, response);
		}
		else {
			String output = "Invalid Employee ID and  Password!\n"+"Try Again";
			request.setAttribute("output", output);
			request.getRequestDispatcher("/WEB-INF/views/agent.jsp").forward(request, response);
		}
	}
}
