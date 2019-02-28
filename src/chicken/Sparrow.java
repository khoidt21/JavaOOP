package chicken;

public class Sparrow extends Animal implements Flyable {
	
	public Sparrow() {
		this.name = name;
		
	}
	@Override
	public double grow() {
		// TODO Auto-generated method stub
		return weight + 0.5;
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Chim se dang bay");
	}
	
}
