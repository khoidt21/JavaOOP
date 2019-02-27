package core;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;

public class readfile {
	
	private static String filePath = "D:\\notepad.txt";
	public static void main(String[] args) {
		File file = new File(filePath);
		try {
			FileInputStream in = new FileInputStream(file);
			
			System.out.println("Tong so bye doc file "+ in.available());
			int i;
			StringBuffer buf = new StringBuffer("");
			while((i = in.read()) != -1) {
				buf.append((char)i);
			}
			in.close();
			System.out.println("Noi dung cua file ");
			System.out.println(buf);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
