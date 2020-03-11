package lab3.exercise1;
import java.util.*;
public class StringApp {
	
	
	public String stringOperation(String obj,int choice){
		String temp;
		temp="";
		int length,i;
		switch(choice) {
		
		case 1:
			obj+=obj;
			return obj;
			
		case 2:
			length=obj.length();
			for(i=0;i<length;i++) {
				if(i%2!=0) {
					temp+="#";
				}
				else
					temp+=obj.charAt(i);
			}
			return temp;
		case 3:
			length=obj.length();
			for(i=0;i<length-1;i++) {
				//String s=(obj.charAt(i)).toString();
			    if(temp.contains(Character.toString(obj.charAt(i)))==false){
			    	temp+=obj.charAt(i);
				}			    
			}
			return temp;
		case 4:
			length=obj.length();
			for(i=0;i<length;i++) {
				if(i%2!=0) {
					temp+=Character.toUpperCase(obj.charAt(i));
				}
				else
					temp+=obj.charAt(i);
			}
			return temp;
		default:
			return "Wrong choice";
				
		}
	}
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		StringApp obj =  new StringApp();
		System.out.println("Enter the Word or Sentence");
		String word=scanner.nextLine();
		
		System.out.println("Enter the choice");
		int choice = scanner.nextInt();
		String output =  obj.stringOperation(word,choice);
		System.out.println(output);
		scanner.close();
	}
}

