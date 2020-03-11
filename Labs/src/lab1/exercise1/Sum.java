package lab1.exercise1;
import java.util.Scanner;
public class Sum {
	public static int calculateSum(int num){
		int sum=0;
		for(int iter=1;iter<=num;iter++)
		{
			if( iter % 3 == 0 || iter % 5 == 0){
				sum+=iter;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the range of natural number");
		number=scanner.nextInt();
		int sum=calculateSum(number);
		System.out.println("Sum of numbers: "+sum);
		scanner.close();
	}

}
