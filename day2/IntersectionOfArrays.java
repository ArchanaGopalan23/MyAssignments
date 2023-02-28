package week1.day2;

import java.util.Arrays;

public class IntersectionOfArrays {
	//Array Intersection

	public static void main(String[] args) {

		int a[] = {3,2,11,4,6,7};

		int b[] = {1,2,8,4,9,7};
		
        //Sorting the arrays to make comparison easy
		Arrays.sort(a);
		Arrays.sort(b);
        
		//Declaring a visitedalready variable to check if the element is already visited in array b
		int visitedalready[] = new int[b.length];

		//Populating the intersection elements in intersectionElements
		int intersectionElements[] = new int[b.length];

		//variable to increment intersectionElements
		int k=0;

		for(int i=0; i<a.length;i++) {
			for(int j=0;j<b.length;j++) {

				if(a[i]==b[j] && visitedalready[j]==0) {

					intersectionElements[k++]=a[i];
					visitedalready[j]=1;
					break;

				}


			}
		}
		for(int m=0;m<intersectionElements.length;m++) {
			if(intersectionElements[m]!=0)
			System.out.println(intersectionElements[m]);
		}

	}

}
