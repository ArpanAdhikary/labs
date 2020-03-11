package lab8.exercise3.com.cg.eis.pl;
import java.util.Scanner;
import lab6.exercise3.com.cg.eis.exception.EmployeeException;
import lab6.exercise3.com.cg.eis.bean.Employee;
import lab6.exercise3.com.cg.eis.service.Service;;

public class InsuranceApp {

	public static void main(String[] args) {
		String name,designation;
		int id;
		double salary;
		Service srv = new Service();
		Employee emp = new Employee();
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("Enter Employee Id");
		id=scanner.nextInt();
		System.out.println("Enter Employee Name");
		name=scanner.next();
		System.out.println("Enter Employee Salary");
		salary=scanner.nextDouble();
		System.out.println("Enter Employee Designation");
		designation=scanner.next();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		emp.setDesignation(designation);
		srv.generateScheme(emp);
		System.out.println("Employeee ID:"+emp.getId());
		System.out.println("Employeee Name:"+emp.getName());
		System.out.println("Employeee Salary:"+emp.getSalary());
		System.out.println("Employeee Designation:"+emp.getDesignation());
		System.out.println("Employeee Insurance Scheme:"+emp.getInsuranceScheme());	
		
		}
		catch(EmployeeException e) {
			System.out.println(e);
	}
		scanner.close();
	}

}
