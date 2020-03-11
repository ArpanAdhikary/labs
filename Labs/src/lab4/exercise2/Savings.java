package lab4.exercise2;

public class Savings extends Account{
	
	private final double  minBalance=500;
	
	@Override
	public void withdraw(double value) {
		if(super.getBalance() > minBalance){
			super.setAccBalance((super.getAccBalance())-value);	
		}
		else
			System.out.println("You can't withdraw account balance is less than minimum balance");
		}
	}


