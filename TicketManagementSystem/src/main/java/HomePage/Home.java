package HomePage;
import Database.Database;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns="/home")

public class Home extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Database d = new Database();
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		session.setAttribute("d", d);
		//pw.print(d.toString());
		request.getRequestDispatcher("/WEB-INF/views/homepage.jsp").forward(request, response);
	}
}
