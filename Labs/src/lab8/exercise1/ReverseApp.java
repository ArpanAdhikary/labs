package lab8.exercise1;


import java.util.Scanner;

public class ReverseApp {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the file name and path for read purpose");
		String readFileContent = scanner.next();
		ReverseFileContent record =new ReverseFileContent();
		record.readFile(readFileContent);
		scanner.close();
		
	}

}
