package hcn;

public class HinhChuNhat {

	private int chieurong;
	private int chieudai;
	private int S;
	private int C;
	
	public HinhChuNhat() {}
	
	public HinhChuNhat(int chieurong,int chieudai) {
		this.chieurong = chieurong;
		this.chieudai = chieudai;
	}
	
	public int getChieurong() {
		return chieurong;
	}
	public void setChieurong(int chieurong) {
		this.chieurong = chieurong;
	}
	public int getChieudai() {
		return chieudai;
	}
	public void setChieudai(int chieudai) {
		this.chieudai = chieudai;
	}
	public String toString() {
		return chieurong + " " + chieudai + " " + S + " " + C; 
	}
	
	// Tinh dien tich chu vi 
	public int tinhDienTich() {
		return S = chieudai * chieurong;
	}
	// Tinh chu vi
	public int tinhChuVi() {
		return C = 2*(chieudai + chieurong);
	}
	
}
