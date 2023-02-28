package week1.day2;

public class MissingElementInArray {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,5,6,7};
		// Since one element is missing added 1 to the length
		int n= arr.length+1;
		//Formula to find the sum of n elements
		int sumOfElements = n*(n+1)/2; 
		System.out.println(sumOfElements);
		
		int sum =0;
		
		int missingElement =0;
		//Sum of the array elements
		for(int i=0;i<arr.length;i++) {
			
			sum += arr[i];
			
		}
		System.out.println(sum);
		missingElement =sum - sumOfElements;
		System.out.println(missingElement);
	}

}
