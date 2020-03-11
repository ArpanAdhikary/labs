package lab14.exercise1to5;

//14.3: Write a method that uses lambda expression to accept username and password and return
//true or false. (Hint: Use any custom values for username and password for authentication)


interface Verify {
	final String user = "shailesh";
	final String pass = "1234";

	public boolean validate(String username, String password);
}

public class Authentication {

	public static void main(String[] args) {
		String name1 = "siddarth";
		String pass1 = "3234";

		String name2 = "shailesh";
		String pass2 = "1234";

		Verify v = (String username, String password) -> {
			if (Verify.user.equals(username) && Verify.pass.equals(password))
				return true;
			else
				return false;
		};

		boolean sidResult = v.validate(name1, pass1);
		boolean shaileshResult = v.validate(name2, pass2);

		System.out.println("Authenticity of sid is: " + sidResult);
		System.out.println("Authenticity of shailesh: " + shaileshResult);
	}

}
