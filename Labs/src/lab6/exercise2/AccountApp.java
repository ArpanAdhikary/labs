package lab6.exercise2;



public class AccountApp {

	private static  long accNumber=1200;
	public static void main(String[] args) {
		
				
		try
		{
		Account acc1 = new Current();
		acc1.setAccNum(accNumber++);		
		acc1.setAccBalance(3000);		
		Person cust1 = new Person();
		cust1.setName("Smith");
		cust1.setAge(10);		
		acc1.setAccHolder(cust1);
		acc1.withdraw(3000);
		System.out.println(acc1);
		System.out.println(acc1.getAccHolder());
		}
		catch(AgeException e) {
			System.out.println();
			System.out.println(e);
		}
		try {
		Account acc2 =new Savings();
		acc2.setAccNum(accNumber++);		
		acc2.setAccBalance(3000);		
		Person cust2 = new Person();
		cust2.setName("Kathy");
		cust2.setAge(40);		
		acc2.setAccHolder(cust2);
		acc2.withdraw(2000);
		
		System.out.println(acc2);
		System.out.println(acc2.getAccHolder());
		}
		catch(AgeException e) {
			System.out.println();
			System.out.println(e);
		}
		//System.out.println(acc1);
		//System.out.println(acc1.getAccHolder());
	}

}
