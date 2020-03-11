package lab6.exercise2;

public class AgeException extends Exception {
	private float age;
	public AgeException(float age){
		this.age=age;
	}
		

	public String toString() {
		return age+" is an invalid age"; 
	}
}