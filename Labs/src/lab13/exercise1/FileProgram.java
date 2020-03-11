package lab13.exercise1;

import java.io.File;

public class FileProgram {

	public static void main(String[] args) {
		File file1=new File("C:\\Users\\Evision\\Desktop\\source.txt");
		File file2= new File("C:\\Users\\Evision\\Desktop\\target.txt");
		
		CopyDataThread cdt = new CopyDataThread(file1,file2);
		Thread th1 =new Thread(cdt);
		th1.start();
		
	}

}
