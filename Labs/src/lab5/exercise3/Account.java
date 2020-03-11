package lab5.exercise3;

public abstract class Account {

	private long accNum;
	private double accBalance;
	private Person accHolder;
	
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public long getAccNum() {
		return accNum;
	}
	
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double balance) {
		this.accBalance += balance;
	}
	
	public abstract void  withdraw(double balance);
	
	public double getBalance() {
		return accBalance;
	}
	
	
	@Override
	public String toString() {
		return "Account Number: " + accNum + " Account Balance: " + accBalance;
	}
}
