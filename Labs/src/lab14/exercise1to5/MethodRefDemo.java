package lab14.exercise1to5;

@FunctionalInterface
interface Something {
	public void func(int a);
}

class A {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void display(int a) {
		setA(a);
		System.out.println("I'm display of A: " + getA());
	}
}

public class MethodRefDemo {

	public static void main(String[] args) {

		Something s = new A()::display;
		s.func(24);
	}

}
