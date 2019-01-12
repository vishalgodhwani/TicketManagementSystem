package Database;

import Agent.AgentDetails;
import java.util.ArrayList;

public class Database {
	public ArrayList<AgentDetails> list1=new ArrayList<>();
	public Database() {
		AgentDetails details1=new AgentDetails(01, "Ojas", 30,"ojas",0);
		list1.add(details1);
		AgentDetails details2=new AgentDetails(02, "Jainik", 26,"jainik",0);
		list1.add(details2);
		AgentDetails details3=new AgentDetails(03, "Salony", 25,"salony",0);
		list1.add(details3);
		AgentDetails details4=new AgentDetails(04, "Gagan", 23,"gagan",0);
		list1.add(details4);
		AgentDetails details5=new AgentDetails(05, "Pratim", 24,"pratim",0);
		list1.add(details5);
	}
	
}