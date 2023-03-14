package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class PrintDuplicatesinArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(14);
		numList.add(20);
		numList.add(30);
		numList.add(14);
		numList.add(16);
		numList.add(17);
		numList.add(17);
		numList.add(19);
		Collections.sort(numList);
		System.out.println("Before removing duplicates "+numList);
		HashSet<Integer> numSet = new HashSet<Integer>(numList);
		System.out.println("After removing duplicates "+numSet);
		

	}

}
