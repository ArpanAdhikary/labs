package lab4.exercise1;



public class AccountApp {

	private static  long accNumber=1200;
	public static void main(String[] args) {
		
				
		Account acc = new Account();
		acc.setAccNum(accNumber++);
		
		acc.setAccBalance(2000);
		
		Person cust = new Person();
		cust.setName("Smith");
		cust.setAge(40);
		
		acc.setAccHolder(cust);
		
		System.out.println(acc);
		System.out.println(acc.getAccHolder());
		
		Account acc1 = new Account();
		acc1.setAccNum(accNumber++);		
		acc1.setAccBalance(3000);		
		Person cust1 = new Person();
		cust1.setName("Kathy");
		cust1.setAge(45);		
		acc1.setAccHolder(cust);
		
		System.out.println(acc1);
		System.out.println(acc1.getAccHolder());
		
		acc.deposit(2000);
		acc1.withdraw(2000);

		System.out.println(acc);
		System.out.println(acc.getAccHolder());
		
		System.out.println(acc1);
		System.out.println(acc1.getAccHolder());
	}

}
