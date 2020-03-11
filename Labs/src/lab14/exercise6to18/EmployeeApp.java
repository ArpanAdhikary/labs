package lab14.exercise6to18;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class EmployeeApp {

	public static void main(String[] args) {
		
		Department dep = new Department(10,"HR",100);
		
		LocalDate dt = LocalDate.from(ZonedDateTime.now()); 
		Employee emp = new Employee(1,"shailesh","singh","@gmail","1234",dt,"analyst",5000,10,dep);
		
		EmployeeRepository er = new EmployeeRepository();
		er.setEmployee(emp);
		emp = new Employee(2,"sonu","bhai","@gmail","1234",dt,"analyst",10000,10,dep);
		er.setEmployee(emp);
		emp = new Employee(3,"arpan","bhai","@gmail","1234",dt,"analyst",6000,10,dep);
		er.setEmployee(emp);
		
		emp = new Employee(4,"sid","bhai","@gmail","1234",dt,"analyst",8000,10,null);
		er.setEmployee(emp);
		
		
		EmployeeServiceImpl es = new EmployeeServiceImpl();
		//es.findSumOf()
		
		for(int i=1;i<4;i++) {
			emp = er.getEmployee(i);
			System.out.println(emp);
		}
		
		EmployeeServiceImpl esi = new EmployeeServiceImpl();
		double sum = esi.es1.query();
		System.out.println("sum of salary: "+sum);
		
		esi.es2.query();
		System.out.println(EmployeeRepository.getLength());
	}

}
