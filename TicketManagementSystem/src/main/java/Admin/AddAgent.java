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

import Agent.AgentDetails;

@WebServlet(urlPatterns="/newagent")

public class AddAgent extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		Database d = (Database) session.getAttribute("d");
		int emp_id = (int) Integer.parseInt(request.getParameter("emp_id"));
		String emp_name = request.getParameter("emp_name");
		int emp_age = (int) Integer.parseInt(request.getParameter("emp_age"));
		String emp_password = request.getParameter("emp_password");
		int emp_tickets = (int) Integer.parseInt(request.getParameter("emp_tickets"));
		//pw.print("gdf"+emp_age+emp_password);
		AgentDetails details = new AgentDetails(emp_id, emp_name, emp_age, emp_password, emp_tickets);
		d.list1.add(details);
		String addsuccess="Agent Added Successfully";
		request.setAttribute("success", addsuccess);
		request.getRequestDispatcher("/WEB-INF/views/adminpage.jsp").forward(request, response);
	}
}
