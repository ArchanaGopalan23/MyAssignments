package week1.day2;

import java.util.Arrays;

public class SecondSmallestArrayElement {
	
	// To find the second smallest element in the array
	
	public static void main(String[] args) {
		
		int[] arr = {23,45,67,32,89,22};
		
		Arrays.sort(arr);
		
		System.out.println("Second smallest element :"+arr[2]);
	}

}
