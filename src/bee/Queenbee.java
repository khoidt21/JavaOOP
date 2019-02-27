package bee;

public class Queenbee extends Health {
	
	// Ong chua dead health < 20 
	private int min = 1;
	private int max = 100;
	
	private int health;
	
	private int number;
	private String name;
	private String status;
	
    public Queenbee(int number,String name,int health,String status) {
		// TODO Auto-generated constructor stub
    	this.number = number;
    	this.name = name;
    	this.health = health;
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
		if(health < 20) {
			return status = "dead";
		}
		else
			return status;
	}
	
	public String toString() {
		return String.format("%-10d%-20s%-10d%-20s",number,name,health,status);
	}
	
	
}
