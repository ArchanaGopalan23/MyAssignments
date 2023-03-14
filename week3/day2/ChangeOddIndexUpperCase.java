package week3.day2;

public class ChangeOddIndexUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test ="changeme";
		
		char [] testChar = test.toCharArray();
		
		
		for(int i=0;i<testChar.length;i++) {
			
			if(i%2!=0) {
				
				System.out.println(Character.toUpperCase(testChar[i]));
			}
			
		}

	}

}
