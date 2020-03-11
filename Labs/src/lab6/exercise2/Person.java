package lab6.exercise2;

public class Person {

	private String name;
	private float age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) throws AgeException{
		if(age<15)
			throw new AgeException(age);
		else
			this.age = age;
	}
	@Override
	public String toString() {
		return "Name: " + name + " Age: " + age;
	}
	
}
