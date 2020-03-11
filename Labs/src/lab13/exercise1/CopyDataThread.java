package lab13.exercise1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CopyDataThread implements Runnable {
	
	File file1,file;
	
	CopyDataThread(File fl1,File fl2){
		this.file = fl1;
		this.file1 = fl2;
	}
	@Override
	public void run() {
		this.fileCopy();		
	}
	public void fileCopy() {
		
		int count= 0;
		try (FileReader fr = new FileReader(this.file);FileWriter writer = new FileWriter(this.file1, true)) {
			
			int content;
			while ((content = fr.read()) != -1) {
				 writer.write((char) content);
				
				count++;
				if(count%10 == 0) {
					System.out.println("“10 characters are copied");
					try {
						Thread.sleep(5000);
						}catch (InterruptedException e) {
							System.out.println(e);
						}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}