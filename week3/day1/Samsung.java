package week3.day1;

public class Samsung extends AndroidTV{

	public void playApp() {
		
		System.out.println("Implementing play App in Samsung");	
		}
	
	public static void main(String[] args) {
		
		Samsung samsung = new Samsung();
		
		samsung.openApp();
		samsung.playApp();
	}

	

}
