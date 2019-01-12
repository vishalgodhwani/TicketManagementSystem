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

@WebServlet(urlPatterns="/addticket")

public class AddTicket extends HttpServlet {
	Database d = new Database();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		d= (Database) session.getAttribute("d");
		int check =0,num=0;
		int emp_id = (int) Integer.parseInt(request.getParameter("emp_id"));
		for(int i=0;i<d.list1.size();i++)
		{
			if(emp_id==d.list1.get(i).getEmp_id())
			{
				check=1;
				int numOfTickets=d.list1.get(i).getNumOfTickets();
				if(numOfTickets<2)
				{
					d.list1.get(i).setNumOfTickets(numOfTickets+1);
					String addticket = "Ticket Assigned Successfully to "+ d.list1.get(i).getEmp_id();
					request.setAttribute("success", addticket);
					request.getRequestDispatcher("/WEB-INF/views/adminpage.jsp").forward(request, response);
				}
				else if(numOfTickets>=2)
				{
					String addticket = "Cannot Assign more tickets to employee id "+ d.list1.get(i).getEmp_id()+"\n Reassign Ticket";
					request.setAttribute("message", addticket);
					request.getRequestDispatcher("/WEB-INF/views/addticket.jsp").forward(request, response);
				}
			}
		}
		if(check==0) {
			String message = "Invalid Agent ID";
			request.setAttribute("message", message);
			request.getRequestDispatcher("/WEB-INF/views/addticket.jsp").forward(request, response);
		}
	}
}
