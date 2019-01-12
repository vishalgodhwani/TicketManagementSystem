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

public class AgentCheck {
	public int agentcheck(Database d,int emp_id,String password) {
		for(int i=0;i<d.list1.size();i++) {
			if(emp_id==d.list1.get(i).getEmp_id()) {
				if(password.equals(d.list1.get(i).getPassword())) {
					return 1;
				}
				else {
					return -1;
				}
			}
		}
		return 0;
	}
}
