package week3.day1;

public class AxisBank extends BankInfo{
	
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		//super.deposit();
		
		System.out.println("Inside deposit method of Axis Bank class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AxisBank axisBank = new AxisBank();
		
		axisBank.deposit();

	}

}
