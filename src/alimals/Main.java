package alimals;

import java.util.ArrayList;

public class Main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alimal alimal = new Dog();
		ArrayList<Alimal> alimal1 = new ArrayList<>();
		Dog dog1 = new Dog();
		Cat cat1 = new Cat();
		
		alimal1.add(dog1);
		alimal1.add(cat1);
		
		for (int i = 0; i < alimal1.size(); i++) {
			alimal1.get(i).speak();
		}
		
	}

}
