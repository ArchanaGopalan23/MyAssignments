package week1.day1;

public class Mobile {
	
	private void sendSms() {
		// TODO Auto-generated method stub
		//System.out.println("To Create a SMS");

	}
	
	private void takeSnapshot() {
		// TODO Auto-generated method stub
		
	//	System.out.println("To take the snapshot");

	}
	
	public void makecall() {
		// TODO Auto-generated method stub
		
		String mobileModel;
		float mobileWeight;
		System.out.println("This method is used for making calls");

	}
	
	public void sendMsg() {
		// TODO Auto-generated method stub
		
		boolean isFullCharged;
		int mobileCost;
		System.out.println("This method is used to send messages");

	} 
	
	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		mobile.sendSms();
		mobile.takeSnapshot();
		mobile.makecall();
		mobile.sendMsg();
		System.out.println("This is my mobile");
		
	}

}
