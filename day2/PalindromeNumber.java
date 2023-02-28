package week1.day2;

public class PalindromeNumber {
	
	//To check if the given number is Palindrome or not
	public static void main(String[] args) {
		
		
		int number =555;
		
		int temp = number;
		
		int sum=0;
		
		int remainder =0;
		
		while(number>0) {
			
			remainder = number%10;
			
			sum = (sum*10)+remainder;
			
			number = number/10;
			
			
		}
		if(sum==temp)
			System.out.println("The number "+temp+" is a palindrome");
		else
			System.out.println("The number "+temp+" is not a palindrome");
	}

}
