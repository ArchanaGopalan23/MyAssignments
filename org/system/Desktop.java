package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		// TODO Auto-generated method stub
		
		System.out.println("Inside Desktop");

	}
	public static void main(String[] args) {
		
		Desktop desktop = new Desktop();
		// Accessing superclass methods
		//calling the inherited method 
		desktop.computerModel();
		desktop.desktopSize();
	}

}
