package week3.day2;

public class RemoveDuplicatesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Program to remove the Duplicate occurance of the word

		String input = "We learn java basics as part of java sessions in java week1";
		String [] inputArr = input.split(" ");
		StringBuilder sb=  new StringBuilder();

		int count=0;
		for (int i = 0; i < inputArr.length; i++) {
			for(int j=i+1; j<inputArr.length;j++) {
				//Clearing count value before every comparison so that conditon count>0 wont be evaluated always
				count=0;
				if(inputArr[i].equalsIgnoreCase(inputArr[j])) {
					count++;
				}if(count>0) {
					inputArr[j]="";
				}
			}
			
			sb.append(inputArr[i]).append(" ");
		}
		System.out.println(sb.toString());

	}
}

