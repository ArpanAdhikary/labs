package lab2.exercise1;
import java.util.Scanner;
public class Person {

	public static void main(String[] args) {
		String firstName,lastName,gender;
		int age;
		double  weight;
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter first name ");
		firstName = scanner.next();
		System.out.println("Enter last name ");
		lastName = scanner.next();
		System.out.println("Enter gender ");
		gender = scanner.next();
		System.out.println("Enter Age ");
		age = scanner.nextInt();
		System.out.println("Enter Weight");
		weight = scanner.nextDouble();
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Weight: "+weight);
		scanner.close();
	}

	}

