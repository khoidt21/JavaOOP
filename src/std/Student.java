package std;

public class Student {

	private int id;
	private String name;
	private float diemLT;
	private float diemTH;
	
	//select in (select )
	/*
	a[15,3,5]
			
	for( a)
		
	if(3)
		fizz
		else (5)
		 buzz
		 else 15 
		 fizz buzz
	/*
	 * 
	 */
	/*
	class element 
	class cat extends element
	
	element a = new cat
	cat c = new element 
	*/
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id,String name,float diemLT,float diemTH) {
		this.id = id;
		this.name = name;
		this.diemLT = diemLT;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}
	public float getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}
	public float calDTB() {
		return (diemLT + diemTH) % 2;
	}
	public String toString() {
		//return id + " " + name + " " + diemLT + " " + diemTH;
		return String.format("%-10d%-20s%-10.2f%-10.2f%-10.2f", id, name, diemLT, diemTH, calDTB());
	}
	
}
