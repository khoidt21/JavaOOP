
package bee;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tim phan tu lon thu nhat lon thu hai cua mang
		
		//int max=0;
		/*
		int j;
		int temp = 0;
		int arrA[] = {11,1,2,3,5};
		for (int i = 0; i < arrA.length; i++) {
			for(j = i + 1;j < arrA.length;j++) {
				if(arrA[i] > arrA[j]) {
					temp = arrA[i];
					arrA[i] = arrA[j];
					arrA[j] = temp;
				}
			}
		}
		//System.out.println("Max "+ max);
		System.out.println("Mang sau khi sap xep lai: ");
		for (int i = 0; i < arrA.length; i++) {
			System.out.println(arrA[i]);
			
		}
		int max = arrA[0];
		for (int i = 1; i < arrA.length; i++) {
			if(arrA[i] > max)
				max = arrA[i];
		}
		int max2 = arrA[0];
		for (int i = 1; i < arrA.length; i++) {
			if(arrA[i] > max2 && arrA[i] < max) {
				max2 = arrA[i];
			}
		}
		System.out.println("Phan tu lon nhat: " + max);
		System.out.println("Phan tu lon thu 2: " + max2);
		*/
		
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
			            
			            // kiem tra khi tat ca cac ong deu da chet 
			            String dronedead1 = drone1.allstatusBee();
			            String dronedead2 = drone2.allstatusBee();
			            String dronedead3 = drone3.allstatusBee();
			            
			            String qdead1 = queebee1.allstatusBee();
			            String qdead2 = queebee2.allstatusBee();
			            String qdead3 = queebee3.allstatusBee();
			            
			            String wo1 = wokerbee1.allstatusBee();
			            String wo2 = wokerbee2.allstatusBee();
			            String wo3 = wokerbee3.allstatusBee();
			            String wo4 = wokerbee4.allstatusBee();
			            
			            if(dronedead1.equals("dead") && dronedead2.equals("dead") 
			            && dronedead3.equals("dead") && qdead1.equals("dead") 
			            && qdead2.equals("dead")  && qdead3.equals("dead") 
			            && wo1.equals("dead") && wo2.equals("dead") 
			            && wo3.equals("dead") && wo4.equals("dead"))
			            {
			            	    System.out.println("------------------");
			            		System.out.println("All bees are dead");
			            		System.out.println("------------------");
			            }
			            
			            break;
			        case 3: 
			            
			            break;
			        default:
			    }   
		}
		while(choiceentry !=3);
	}

}
