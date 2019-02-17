import java.util.Scanner;

import model.PhanSo;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhanSo ps = new PhanSo();
		ps.setTuSo(5);
		ps.setMauSo(6);
		//ham khoi tao co tham so
		PhanSo ps2 = new PhanSo(5,6);
		PhanSo[] psArray = new PhanSo[3];//-> {null, null, null}
		//nhap phan so
		for(int i = 0; i < psArray.length; i++) {
			System.out.println("Nhap phan so thu " + (i + 1) + ":");
			psArray[i] = new PhanSo();
			Scanner sc = new Scanner(System.in);
			System.out.println("Tu so: ");
			psArray[i].setTuSo(sc.nextInt());
			System.out.println("Mau so:");
			psArray[i].setMauSo(sc.nextInt());
		}
		
		//xuat mang phan so
	    for (int i = 0; i < psArray.length; i++) {
			//System.out.println(psArray[i]);
	    	psArray[i].hienThi();
		}
	    
	}

}
