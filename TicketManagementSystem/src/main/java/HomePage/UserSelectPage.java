package HomePage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/userselectpage")

public class UserSelectPage extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Database d =new Database();
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("user");
		//pw.print("Hello"+name);
		if(name.equals("adminlogin")) {
			request.getRequestDispatcher("/WEB-INF/views/admin.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("/WEB-INF/views/agent.jsp").forward(request, response);
		}
	}
}
