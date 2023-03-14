package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using Treeset 
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(7);
		
		System.out.println("The list contains "+list);
		
		Collections.sort(list);
		
		System.out.println("The list after sorting  "+list);

		
		System.out.println("The second Largest element is "+list.get(list.size()-2));
		
	}

}
