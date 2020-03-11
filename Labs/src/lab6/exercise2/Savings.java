package lab6.exercise2;

public class Savings extends Account{
	
	private final double  minBalance=500;
	
	@Override
	public void withdraw(double value) {
		if(super.getBalance() > minBalance){
			super.setAccBalance((super.getAccBalance())-value);			
		}
	}

}
