package lab14.exercise1to5;

//14.1: Write a lambda expression which accepts x and y numbers and return x^y

import java.util.Scanner;

interface Power {
	public long power(int x, int y);
}

public class XRaisedToY {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the x and y:");
		int x = s.nextInt();
		int y = s.nextInt();

		Power pow = (int a, int b) -> {
			long result = 1;
			while (b > 0) {
				result = result * a;
				b--;
			}
			return result;
		};

		long result = pow.power(x, y);
		System.out.println("x^y: " + result);
		s.close();
	}

}
