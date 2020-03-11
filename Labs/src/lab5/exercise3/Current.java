package lab5.exercise3;

public class Current extends Account{

private  double overDraft= -500;
	
	@Override
	public void withdraw(double value) {
		if(super.getBalance()-value <= overDraft){
			System.out.println("OverDraft limit has reached/will reach if you withdraw the amount");	
		}
		else {
			System.out.println("OverDraft limit is not reached you can withdraw "+value);
		}
	}
}
