package bee;

public class Wokerbee extends Health {
	
	// ong tho suc khoe duoi 70 khong the bay va chet
	private int min = 1;
	private int max = 100;
	private int number;
	private int health;
	
	private String name;
	private String status;
	
	
	public Wokerbee(int number,String name,int health,String status) {
		this.number = number;
		this.name = name;
		this.status = status;
		this.health = health;
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
		if(health < 70) {
			return status = "dead";
		}
		else
			return status;
	}
	public String toString() {
		return String.format("%-10d%-20s%-10d%-20s",number,name,health,status);
	}


	@Override
	public String allstatusBee() {
		// TODO Auto-generated method stub
		String death = statusDeal();
		if(death.equals(death)) { 
			return "dead";
		}
		return "dead";
	}
	
}
