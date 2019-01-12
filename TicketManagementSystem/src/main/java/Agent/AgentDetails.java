package Agent;


public class AgentDetails {
	private int emp_id;
	private String emp_name;
	private int emp_age;
	private String password;
	private int numOfTickets;
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_age() {
		return emp_age;
	}

	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getNumOfTickets() {
		return numOfTickets;
	}

	public void setNumOfTickets(int numOfTickets) {
		this.numOfTickets = numOfTickets;
	}
	
	public AgentDetails(int emp_id, String emp_name, int emp_age, String password, int numOfTickets) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_age = emp_age;
		this.password = password;
		this.numOfTickets = numOfTickets;
	}

	@Override
	public String toString() {
		return "\nEmployee id=" + emp_id + "\nEmployee name=" + emp_name + "\nEmployee age=" + emp_age + "\nEmployee password="
				+ password + "\nNumber of Tickets ="+ numOfTickets;
	}
	
}
