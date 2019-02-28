package workfile;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class writerfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String content = "This is content";
			String path = "D:\\a.txt";
			File file = new File(path);
			if(!file.exists()) {
				file.createNewFile();
			}
			FileWriter filewrite = new FileWriter(file.getAbsolutePath());
			BufferedWriter bw = new BufferedWriter(filewrite);
			
			bw.write(content);
			bw.close();
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
