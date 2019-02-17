package hcn;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HinhChuNhat hcn1 = new HinhChuNhat();
		HinhChuNhat hcn2 = new HinhChuNhat();
		Scanner sc = new Scanner(System.in);
		System.out.println("Chieu rong HCN 1 ");
		hcn1.setChieurong(sc.nextInt());
		System.out.println("Chieu dai HCN 1 ");
		hcn1.setChieudai(sc.nextInt());
		System.out.println("Chu vi HCN 1 " + hcn1.tinhChuVi());
		System.out.println("Dien tich HCN 1 " + hcn1.tinhDienTich());
		System.out.println("-----------------------------------------------------");
		System.out.println("Chieu rong HCN 2");
		hcn2.setChieurong(sc.nextInt());
		System.out.println("Chieu dai HCN 2");
		hcn2.setChieudai(sc.nextInt());
		System.out.println("Chu vi HCN 2 " + hcn2.tinhChuVi());
		System.out.println("Dien tich HCN 2 " + hcn2.tinhDienTich());
		System.out.println("---------------------------------------");
		
		/*
		int arrA[] = new int[3];
		arrA[0] = 15;
		arrA[1] = 3;
		arrA[2] = 5;
		
		for (int i = 0; i < arrA.length; i++) {
			 if(arrA[i] % 15 ==0) {
				 System.out.println("Fuzz");
			 }
			 else if(arrA[i] % 3==0) {
				 System.out.println("Bizz");
			 }
			 else if(arrA[i] % 5==0) {
				 System.out.println("Fuzz Bizz");
			 }
		}
		*/
		
		
		
	}

}
