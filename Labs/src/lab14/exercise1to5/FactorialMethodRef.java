package lab14.exercise1to5;

//14.5: Write a method to calculate factorial of a number. Test this method using method reference
//feature. 

@FunctionalInterface
interface FindFact {
	public long factCalc(int n);
}

class Calculation {
	public long calculateFact(int n) {
		long factorial = 1;
		while (n > 0) {
			factorial = factorial * n;
			n--;
		}
		return factorial;
	}
}

public class FactorialMethodRef {

	public static void main(String[] args) {
		FindFact ff = new Calculation()::calculateFact;
		long factorial = ff.factCalc(5);
		System.out.println("The factorial is : " + factorial);
	}

}
