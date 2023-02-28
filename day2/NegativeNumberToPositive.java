package week1.day2;

public class NegativeNumberToPositive {
	
	//Conversion of Negative number to positive number
	public static void main(String[] args) {
		
		int number = 39;
		
		if(number<0) {
			number*=-1;
			System.out.println("The number after conversion is "+number);

		}else {
			System.out.println("The number is already a positive number");
		}
			
		
	}

}
