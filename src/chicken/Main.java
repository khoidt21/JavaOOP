package chicken;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 Chicken chicken = new Chicken();
		 Sparrow sparrow = new Sparrow();
		 
		 chicken.name = "Ga";
		 chicken.weight = 10;
		 sparrow.name = "Chim se";
		 sparrow.weight = 5;
		 System.out.println("Name of chicken " + chicken.name);
		 System.out.println("Wieght of chicken " + chicken.grow());
		 System.out.println("------------------------------------");
		 System.out.println("Name of sparrow " + sparrow.name);
		 System.out.println("Wight of sparrow "+ sparrow.grow());
		 sparrow.fly();
		 
		 
	}

}
