package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "TestLeaf";
		
		String revTest="";
		
		for(int i= test.length()-1; i>=0; i--)
			
			revTest+=test.charAt(i);
		
		if(test.equalsIgnoreCase(revTest))
			System.out.println("String "+test+ " is a palindrome");
		else
			System.out.println("String is not a palindrome");


	}

}
