package week1.day2;

public class PrimeNumberCheck {
	
	/*
	 * To check if the given number is prime or not. Prime Number has factor 1 and
	 * same number. So checking if it has factors between 2 and the given number
	 */	
	public static void main(String[] args) {
		
		boolean isPrime =true;
		
		int num = 13;
		
		for(int i=2; i<num; i++) {
			
			if(num %i == 0) 
				isPrime = false;
	}
		if(isPrime && num!=1)
			System.out.println("The number is Prime Number");
		else
			System.out.println("The number is not a Prime Number");
		
		
		
	}
	

}
