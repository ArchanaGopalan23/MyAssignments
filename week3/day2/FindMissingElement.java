package week3.day2;

import java.util.ArrayList;

public class FindMissingElement {
	
	/* To find the missing element in the ArrayList*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Missing element 5 and 9
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		numList.add(4);
		numList.add(6);
		numList.add(7);
		numList.add(8);
		numList.add(10);
		
		//assigning number of missing element in variable as 5 and 9 are missing the list
		int missingCount =2;
		
		int[] missinglst = findMissing(numList,missingCount);
		for(int i=0;i<missinglst.length;i++) {
			if(missinglst[i]==0)
				//incrementing by 1 as array element starts from 0
				System.out.println("The missing element is: "+(i+1));

		}

	}
	
	static int[] findMissing(ArrayList<Integer> lst, int missingCount) {
		//add number of missing elements(e.g 2 elements in this list)
        int n = lst.size() + missingCount;
     // initializing the tempArr array populating it with 0 of size n+2 as two elements missing.
        int[] tempArr = new int[n]; 
        for (int i = 0; i < n; i++)
        	tempArr[i] = 0;

        //Iterating list and incrementing by 1 the tempArr[lst(i)-1] 
        for (int i = 0; i < lst.size(); i++) {
        	//decrementing by 1 as array element starts from 0 else throws Arrayindexout of bound
        	tempArr[lst.get(i)-1]++;
        }
         return tempArr;
    }

}


