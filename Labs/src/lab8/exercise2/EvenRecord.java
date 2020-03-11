package lab8.exercise2;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class EvenRecord {

	private Scanner sc;

	public void readFile() {
		StringBuffer word=new StringBuffer();
		File file =new File("C:\\Users\\Evision\\Desktop\\number.txt");
		 
		if(file.exists()) {
			
			try{
				sc = new Scanner(file);
				while (sc.hasNext()) {  
		          word = word.append(sc.nextLine());
		         evenNumber(word);
				}
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}	
		}
		else
			System.out.println("File is not present");
	}
	
	public void evenNumber(StringBuffer word) {
		String []number = (word.toString()).split(",");
		int length =number.length;
		for(int iter = 0;iter<length;iter++) {
			int num = Integer.parseInt(number[iter]);
			if((num%2)==0)
				System.out.println(num);
			
		}
		
	}
}
