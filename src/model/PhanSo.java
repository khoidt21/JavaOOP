package model;

public class PhanSo {

	private int tuSo;
	private int mauSo;
	
	
	public PhanSo() {}
	
	public PhanSo(int tuSo, int mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}

	public int getTuSo() {
		return tuSo;
	}

	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}

	public int getMauSo() {
		return mauSo;
	}

	public void setMauSo(int mauSo) {
		if(mauSo == 0) {
			System.out.println("Mau so khong duoc la 0");
			return;
		}
		this.mauSo = mauSo;
	}

	public void hienThi() {
		System.out.println(tuSo + "/" + mauSo);
	}

	public PhanSo cong(PhanSo ps2) {
		// 4/5 + 5/6 = (4*6 + 5*5)/5*6
		PhanSo psKq = new PhanSo();
		// set tu so cho phan so ket qua
		psKq.tuSo = this.tuSo * ps2.mauSo + ps2.tuSo * this.mauSo;
		
		
		//psKq[0] = phanSo1[0] * phanSo2[1] + phanSo2[0] * phanSo1[1];
		// set mau so cho phan so ket qua
		//psKq[1] = phanSo1[1] * phanSo2[1];

		psKq.tuSo = this.tuSo * ps2.tuSo;
		
		//int uscln = USCLN(psKq[0], psKq[1]);
		//psKq[0] = psKq[0] / uscln;
		//psKq[1] = psKq[1] / uscln;
		
		int uscln = USCLN(this.tuSo,this.mauSo);
		psKq.tuSo = psKq.tuSo / uscln;
		psKq.mauSo = psKq.mauSo / uscln;

		return psKq;
	}
	
	public int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }

}
