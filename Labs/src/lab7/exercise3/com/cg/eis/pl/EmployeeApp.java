package lab7.exercise3.com.cg.eis.pl;

import java.util.Scanner;
import lab7.exercise3.com.cg.eis.bean.Employee;
import lab7.exercise3.com.cg.eis.service.Service;

public class EmployeeApp {

	public static void main(String[] args) {

		Service se = new Service();
		Scanner s = new Scanner(System.in);

//		System.out.println("Enter the number of employees you want to enter:");
//		int count = s.nextInt();
//		while (count > 0) {
//			getDetails(se);
//			count--;
//		}
		while (true) {
			System.out.println("Enter the choice: ");
			System.out.println("1.add Employee");
			System.out.println("2.delete Employee");
			System.out.println("3.Enter scheme to display.");
			System.out.println("4.sort as per salary.");
			System.out.println("5.exit");
			int choice = s.nextInt();
			switch (choice) {
			case 1:
				getDetails(se);
				break;
			case 2:
				System.out.println("Enter the id to delete: ");
				int id = s.nextInt();
				se.deleteEmployee(id);
				break;
			case 3:
				s.nextLine();
				System.out.println("Enter the scheme: ");
				String scheme = s.nextLine();
				se.displayByScheme(scheme);
				break;
			case 4:
				se.sortMapBySalary();
				break;
			case 5:
				break;
			default:
				System.out.println("choice invalid\n");
				break;
			}
		}
		

	}

	public static void getDetails(Service se) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the id:");
		int id = s.nextInt();
		System.out.println("Enter the salary:");
		double salary = s.nextDouble();

		s.nextLine();
		System.out.println("Enter the name:");
		String name = s.nextLine();
		System.out.println("Enter the designation:");
		String designation = s.nextLine();

		Employee e = new Employee(id, name, salary, designation);
		se.generateScheme(e);
		se.addEmployee(e);
		System.out.println(e);
	}
}
