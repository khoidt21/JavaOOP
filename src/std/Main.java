package std;

import java.util.Scanner;

import hcn.Students;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		    Scanner sc = new Scanner(System.in);
			Student sv1 = new Student(1,"Le Huy Hoai",5.2f,7.2f);
			Student sv2 = new Student(2,"Linh Tran",7.2f,5.5f);
			Student sv3 = new Student();
			
			System.out.println("Id sinh vien 3: ");
			sv3.setId(sc.nextInt());
			sc.nextLine();
			System.out.println("Ten sinh vien 3: ");
			sv3.setName(sc.nextLine());
			
			System.out.println("Diem ly thuyet sinh vien 3: ");
			sv3.setDiemLT(sc.nextFloat());
			System.out.println("Diem thuc hanh sinh vien 3: ");
			sv3.setDiemTH(sc.nextFloat());
			
			System.out.println(sv1);
			System.out.println(sv2);
			System.out.println(sv3);
			
			
			
	}

}
