package workfile;
import java.io.*;

public class readfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "D:\\notepad.txt";
		File file = new File(url);
		try {
			BufferedReader bf = new BufferedReader(new FileReader(file));
			String st;
			while((st = bf.readLine()) !=null) {
				System.out.println(st);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
