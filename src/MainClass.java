import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int tuSo = 5;
//		int mauSo = 6;
		int[] phanSo1 = {5,6};
		
		int[][] mangPhanSo = new int[3][2];
		
		nhapPhanSo(mangPhanSo);
		int sum = 0;
		System.out.println("Hien thi phan so ");
		for (int i = 0; i < mangPhanSo.length; i++) {
			  hienThiPhanSo(mangPhanSo[i]);
			  
		}
		int[] phanSo2 = {3,4};
		System.out.println("Kq cong 2 phan so ");
		hienThiPhanSo(congHaiPhanSo(phanSo1, phanSo2));
		
		
	}
	//viet ham nhap gia tri cho mot mang phan so
	public static void nhapPhanSo(int arr[][]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i < arr.length; i++)
		{
			int tuso, mauso;
			System.out.println("Nhap tu so ");
			tuso = sc.nextInt();
			System.out.println("Nhap mau so ");
			mauso = sc.nextInt();
		    arr[i][0] = tuso;
		    arr[i][1] = mauso;
		    
		    
		}
	}
	//viet ham hien thi 1 phan so theo hinh thuc a/b voi dau vao la mot mang 2 phan tu
	public static void hienThiPhanSo(int arr[]) 
	{
		System.out.println(" " + arr[0] + "/" + arr[1]);
	}
	
	// viet ham cong 2 phan so 
	public static int[] congHaiPhanSo(int[] phanSo1,int[] phanSo2) {
		
		// 4/5 + 5/6 = (4*6 + 5*5)/5*6
		int[] psKq = new int[2];
		//set tu so cho phan so ket qua
		psKq[0] =  phanSo1[0] * phanSo2[1] + phanSo2[0] * phanSo1[1];
		//set mau so cho phan so ket qua
		psKq[1] = phanSo1[1] * phanSo2[1];
		
		int uscln = USCLN(psKq[0], psKq[1]);
		psKq[0] = psKq[0] / uscln;
		psKq[1] = psKq[1] / uscln;
		
		return psKq;
	}
	// uoc so chung lon nhat 
	public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
	

}
