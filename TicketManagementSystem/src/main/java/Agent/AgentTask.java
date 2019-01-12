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

@WebServlet("/agenttask")
public class AgentTask extends HttpServlet {
	Database d = new Database();
	int emp_id;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String option = request.getParameter("agenttask").toString();
		HttpSession session = request.getSession();
		d=(Database) session.getAttribute("d");
		emp_id=(int)session.getAttribute("emp_ID");
		//int emp_id = (int) Integer.parseInt((String) session.getAttribute("emp_id"));
		//pw.print("Hello"+option);
		if(option.equals("updateticket")) {
			for(int i=0;i<d.list1.size();i++)
			{
				if(emp_id==d.list1.get(i).getEmp_id())
				{
					int numOfTickets=d.list1.get(i).getNumOfTickets();
					//pw.print(numOfTickets+emp_id);
					if(numOfTickets>0)
					{
						d.list1.get(i).setNumOfTickets(numOfTickets-1);
						String output = "Ticket Updated Successfully";
						request.setAttribute("output", output);
						request.getRequestDispatcher("/WEB-INF/views/agentpage.jsp").forward(request, response);
						break;
					}
					else if (numOfTickets==0)
					{
						String output = "No Ticket To Update";
						request.setAttribute("output", output);
						request.getRequestDispatcher("/WEB-INF/views/agentpage.jsp").forward(request, response);
						break;
					}
				}
			}
		}
		else {
			String output = "Logout Successful";
			request.setAttribute("output", output);
			request.getRequestDispatcher("/WEB-INF/views/homepage.jsp").forward(request, response);
		}
	}
}
