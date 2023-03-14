package week3.day2;


public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input ="TestLeaf";
		
		int count=0; 
		char []inputChar = input.toCharArray();
		
		for (int i = 0; i < inputChar.length; i++) {
			
			if(inputChar[i] == 'e') {
				count++;
			
			}
			
		}
		System.out.println(count);

	}

}
