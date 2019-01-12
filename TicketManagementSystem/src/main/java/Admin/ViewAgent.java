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

@WebServlet(urlPatterns="/viewagent")

public class ViewAgent extends HttpServlet {
	static int k=0;
	Database d = new Database();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		d = (Database) session.getAttribute("d");
		for(;k<d.list1.size();) {
			int emp_id = d.list1.get(k).getEmp_id();
			request.setAttribute("emp_id", emp_id);
			String emp_name= d.list1.get(k).getEmp_name();
			request.setAttribute("emp_name", emp_name);
			int num_tickets = d.list1.get(k).getNumOfTickets();
			request.setAttribute("num_tickets", num_tickets);
			k++;
			request.getRequestDispatcher("/WEB-INF/views/viewagent.jsp").forward(request, response);
			return;
		}
		if(k==d.list1.size()) {
			k=0;
			request.getRequestDispatcher("/WEB-INF/views/adminpage.jsp").forward(request, response);
		}
	}
}
