package lab4.exercise2;



public class AccountApp {

	private static  long accNumber=1200;
	public static void main(String[] args) {
		
		
		Account acc1 = new  Current();
		acc1.setAccNum(accNumber++);		
		acc1.setAccBalance(3000);		
		Person cust1 = new Person();
		cust1.setName("Kathy");
		cust1.setAge(45);		
		acc1.setAccHolder(cust1);
		acc1.withdraw(3600);
		System.out.println(acc1);
		System.out.println(acc1.getAccHolder());
		
		Account acc2 =new Savings();
		acc2.setAccNum(accNumber++);		
		acc2.setAccBalance(700);		
		Person cust2 = new Person();
		cust2.setName("Kathy2");
		cust2.setAge(45);		
		acc2.setAccHolder(cust2);
		acc2.withdraw(200);
	
		System.out.println(acc2);
		System.out.println(acc2.getAccHolder());
		
		
	}

}
