package lab6.exercise3.com.cg.eis.exception;

public class EmployeeException extends Exception {

	private double salary;
	public EmployeeException(double salary){
		this.salary=salary;
	}
		

	public String toString() {
		return "salary need to be more than 3000"; 
	}

}
