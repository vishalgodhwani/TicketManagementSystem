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

@WebServlet(urlPatterns="/removeagent")

public class RemoveAgent extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Database d = new Database();
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		session.setAttribute("d", d);
		int emp_id=(int)Integer.parseInt(request.getParameter("removeagent"));
		int check=0;
		for(int i=0;i<d.list1.size();i++) {
			if(emp_id==d.list1.get(i).getEmp_id()) {
				check=1;
				d.list1.remove(i);
				String removesuccess="Agent Remove Successfully";
				request.setAttribute("success", removesuccess);
				request.getRequestDispatcher("/WEB-INF/views/adminpage.jsp").forward(request, response);
				break;
			}
		}
		if(check==0) {
			String removefail = "Invalid Agent ID";
			request.setAttribute("removefail", removefail);
			request.getRequestDispatcher("/WEB-INF/views/removeagent.jsp").forward(request, response);
		}
	}
}
