package com.cg.eis.pl;
import java.util.*;
import com.cg.eis.bean.*;
import com.cg.eis.service.*;
public class InsuranceApp {

	public static void main(String[] args) {
		
		String name,designation;
		double salary;
		int id;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter ID:");
		id = scanner.nextInt();
		
		System.out.println("enter Salary:");
		salary = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("enter Name:");
		name = scanner.nextLine();
		
		System.out.println("enter Designation:");
		designation = scanner.nextLine();
		
		Service ser=  new Service();
		Employee emp1 = new Employee();
		emp1.setDesignation(designation);
		emp1.setId(id);
		emp1.setName(name);
		emp1.setSalary(salary);
		ser.EmployeeInsuranceScheme(emp1);
		System.out.println("Employee ID: "+emp1.getId());
		System.out.println("Employee Name: "+emp1.getName());
		System.out.println("Employee Salary: "+emp1.getSalary());
		System.out.println("Employee Designation: " +emp1.getDesignation());
		System.out.println("Employee Insurance Scheme: "+emp1.getInsuranceScheme());
		scanner.close();
	}
}
