package week1.day2;

import cucumber.api.cli.Main;

public class FibonacciSeries {

	
	  public static void FibonacciMethod1() {
	  
	  int a[] = new int [8];
	  
	  a[0]=0; a[1]=1;
	  
	  int sum = 0;
	  
	  for(int i=2; i<8; i++) {
	  
	  a[i] = a[i-1]+a[i-2];
	  
	  } System.out.println("The sum of numbers is "+a[a.length-1]);
	  
	  for(int j = 0; j<a.length;j++) { 
		  System.out.println(a[j]); 
		  }
	  
	  
	  }
	 


	public static void FibonacciMethod2() {

		
				 
		int firstNum=0;
		int secNum =1;
		
		int sum=0;
		System.out.println(firstNum);
		for(int i=1; i<8; i++) {

			 sum = firstNum+secNum;
			 
			 firstNum = secNum;
			 
			 secNum =sum;
				
			 System.out.println(sum);

		}
		
    

	}
	
	public static void main(String[] args) {
		
		//FibonacciMethod2();
		FibonacciMethod1();
	}


}
