
package bee;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------Bee hive------------");
		int choiceentry;
		
		do {
			 	System.out.println("1 - Create bee list");
			 	System.out.println("2 - Attck beas");
			 	System.out.println("3 - Exit");
			 	System.out.println("Enter your choice (1,2 or 3)");
			 	Drone drone1 = new Drone(1,"Drone",100,"alive");
	            Drone drone2 = new Drone(2,"Drone",100,"alive");
	            Drone drone3 = new Drone(3,"Drone",100,"alive");
	            Queenbee queebee1 = new Queenbee(4,"Queenbee",100,"alive");
	            Queenbee queebee2 = new Queenbee(5,"Queenbee",100,"alive");
	            Queenbee queebee3 = new Queenbee(6,"Queenbee",100,"alive");
	            Wokerbee wokerbee1 = new Wokerbee(7, "Wokerbee",100,"alive");
	            Wokerbee wokerbee2 = new Wokerbee(8, "Wokerbee",100,"alive");
	            Wokerbee wokerbee3 = new Wokerbee(9, "Wokerbee",100,"alive");
	            Wokerbee wokerbee4 = new Wokerbee(10, "Wokerbee",100,"alive");
	            
			    choiceentry = sc.nextInt();

			    switch (choiceentry)
			    {
			        case 1:
			            System.out.println("Bees details at the beginning:");
			            
			            System.out.println(drone1);
			            System.out.println(drone2);
			            System.out.println(drone3);
			            System.out.println(queebee1);
			            System.out.println(queebee2);
			            System.out.println(queebee3);
			            System.out.println(wokerbee1);
			            System.out.println(wokerbee2);
			            System.out.println(wokerbee3);
			            System.out.println(wokerbee4);
			            
			            
			            break;
			        case 2: 
			            System.out.println("Bees detail at the moment:");
			            drone1.randomHealth();
			            drone1.statusDeal();
			            System.out.println(drone1);          
			            drone2.randomHealth();
			            drone2.statusDeal();
			            System.out.println(drone2);
			            drone3.randomHealth();
			            drone3.statusDeal();
			            System.out.println(drone3);
			            queebee1.randomHealth();
			            queebee1.statusDeal();
			            System.out.println(queebee1);
			            queebee2.randomHealth();
			            queebee2.statusDeal();
			            System.out.println(queebee2);
			            queebee3.randomHealth();
			            queebee3.statusDeal();
			            System.out.println(queebee3);
			            wokerbee1.randomHealth();
			            wokerbee1.statusDeal();
			            System.out.println(wokerbee1);
			            wokerbee2.randomHealth();
			            wokerbee2.statusDeal();
			            System.out.println(wokerbee2);
			            wokerbee3.randomHealth();
			            wokerbee3.statusDeal();
			            System.out.println(wokerbee3);
			            wokerbee4.randomHealth();
			            wokerbee4.statusDeal();
			            System.out.println(wokerbee4);
			            
			            break;
			        case 3: 
			            
			            break;
			        default:
			    }   
		}
		while(choiceentry !=3);
	}

}
