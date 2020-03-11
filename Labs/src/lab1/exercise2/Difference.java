package lab1.exercise2;
import java.util.Scanner;
public class Difference {
	
	public static int calculateDifference(int num) {
		int Sum=0,sumNatural=0,sumSquare=0;
		for(int iter=1;iter<=num;iter++)
		{
			sumSquare+=(iter*iter);
			sumNatural+=iter;
		}
		Sum=sumSquare-(sumNatural*sumNatural);
		return Sum;
		
	}
	public static void main(String[] args) {
		int number;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the range of the natural number");
		number=scanner.nextInt();
		int Sum=calculateDifference(number);
		System.out.println("The sum is "+Sum);
		scanner.close();
	}
}


