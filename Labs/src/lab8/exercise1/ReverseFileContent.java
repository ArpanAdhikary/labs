package lab8.exercise1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReverseFileContent {

	public void readFile(String fileName) {
		StringBuffer word=new StringBuffer();
		File file= new File(fileName);
		if(file.exists()) {
			try{
				FileReader fr = new FileReader(file);
				 int i;    
		         while((i=fr.read())!=-1)    
		          word = word.append(Character.toString((char)i));
		         reverseWord(word);
		         fr.close();
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}	
		}
		else
			System.out.println("File is not present");
	}
	
	public void reverseWord(StringBuffer word) {
		StringBuffer newWord = new StringBuffer(word); 
		String revWord = (newWord.reverse()).toString();
		writeFile(revWord);
	}
	
	public void writeFile(String revWord) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the file name and path for write purpose");
		File fileWrite = new File(scanner.next());		
		try {
			FileWriter fw = new FileWriter(fileWrite);
			fw.write(revWord);
			System.out.println("Succesfully Reveresed and wrote on file");
			fw.close();
			scanner.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
