package lab6.exercise3.com.cg.eis.service;

import lab6.exercise3.com.cg.eis.bean.Employee;
public class Service implements EmployeeService{

	
	@Override
	public void generateScheme(Employee emp){
		if(emp.getSalary()<5000 && emp.getDesignation().equals("Clerk")){
			emp.setInsuranceScheme("No Scheme");
		}
		else if(emp.getSalary()>5000 &&emp.getSalary()<20000 && emp.getDesignation().equals("System Associate")){
			emp.setInsuranceScheme("Scheme C");
		}
		
		else if(emp.getSalary()>=20000 && emp.getSalary() < 40000 && emp.getDesignation().equals("Programmer")){
			emp.setInsuranceScheme("Scheme B");
		}
		else if(emp.getSalary()>=40000  && emp.getDesignation().equals("Manager")){
			emp.setInsuranceScheme("Scheme C");
		}
	}
}

