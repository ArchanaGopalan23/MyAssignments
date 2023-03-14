package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		ArrayList<Integer> intersection = new ArrayList<Integer>();
		
		int count=0;
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(0);


		System.out.println("List 1 elements "+list1);

		list2.add(3);
		list2.add(0);
		list2.add(3);
		list2.add(4);
		list2.add(7);
		list2.add(5);
		list2.add(8);

		System.out.println("List 1 elements "+list2);
		
		for (int i = 0; i < list1.size(); i++) {
			//Checking the count to ensure only one intersection element is added from both the list
			count=0;
			for (int j = 0; j < list2.size(); j++) {
				if(list1.get(i).equals(list2.get(j)) && count==0) {
					count++;
					intersection.add(list1.get(i));
					
				}
				
			}
			
		}
		Collections.sort(intersection);
		System.out.println("The intersection elements are "+intersection);


		
	}

}
