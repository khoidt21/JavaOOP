package bee;
import java.util.Random;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

public class Drone extends Health {

	// class Ong Duc
	
	private int min = 1;
	private int max = 100;
	
	private int number;
	private String name;
	private String status;
	
	
	private int health;
	
	public Drone(int number,String name,int health,String status) {
		// TODO Auto-generated constructor stub
		this.number = number;
		this.name = name;
		this.health = health;
		this.status = status;
		
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public int randomHealth() {
		// TODO Auto-generated method stub
		   // int retVal = 0;
			int random = (int) (Math.random() * max + min);
			health = health - random;
			if(health < 0) {
				 return health = 0;
			}
			return health;
	}

	@Override
	public String statusDeal() {
		// TODO Auto-generated method stub
		int health = randomHealth();
		if(health < 50) {
			return status = "dead";
		}
		else
			return status;
	}
	public String toString() {
		return String.format("%-10d%-20s%-10d%-20s",number,name,health,status);
	}
	
}
