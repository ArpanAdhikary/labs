package com.cg.eis.service;
import com.cg.eis.bean.*;
public class Service implements EmployeeService  {

	
	@Override
	public void EmployeeInsuranceScheme(Employee emp){
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
