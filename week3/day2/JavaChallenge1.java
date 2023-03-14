package week3.day2;

public class JavaChallenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Given a string s consisting of words and spaces, return the length of the
		 * last word in the string.
		 */
		
		String input ="Life is full of Surprises";
		
		String[] inputStr = input.split(" ");
		
		System.out.println("The last word is "+inputStr[inputStr.length-1]+" with length "+inputStr[inputStr.length-1].length());
			
	

	}

}
