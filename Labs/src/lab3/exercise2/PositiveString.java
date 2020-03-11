package lab3.exercise2;

import java.util.*;

public class PositiveString {

	public boolean stringPositive(String obj) {
		obj=obj.toLowerCase();
		for(int i=0;i<obj.length()-1;i++) {
			int charValue1=(int)(obj.charAt(i));
			int charValue2=(int)(obj.charAt(i+1));
			if((charValue2-charValue1)<0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PositiveString obj = new PositiveString();
		String word = scanner.nextLine();
		if(obj.stringPositive(word)==true) 
			System.out.println(word+" is a positve String");
		else
			System.out.println(word+" is a negative String");
		scanner.close();
		}
	}


