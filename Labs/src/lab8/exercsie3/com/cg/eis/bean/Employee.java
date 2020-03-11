package lab8.exercsie3.com.cg.eis.bean;

import lab6.exercise3.com.cg.eis.exception.EmployeeException;

public class Employee {

	private String name,designation,insuranceScheme;
	private int id;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) throws EmployeeException {
		if(salary<3000)
			throw new EmployeeException(salary);
		else
			this.salary = salary;
	}
	
}
