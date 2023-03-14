package week3.day2;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicatesInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<String>  fruitList = new ArrayList<String>();

		fruitList.add("Apple");
		fruitList.add("Mango");
		fruitList.add("Grapes");
		fruitList.add("Orange");
		fruitList.add("Orange");
		fruitList.add("Berries");


		//List contains duplicate 
		System.out.println("ArrayList with Duplicates: "+fruitList);

		//Removing duplicates from list by passing the list in Set ---method 1

		LinkedHashSet<String> fruitsSet = new LinkedHashSet<String>(fruitList);
		// System.out.println("Set without duplicates; "+fruitsSet);

		//Removing duplicates from list by remove method ---method 2

		 System.out.println("ArrayList without Duplicates: "+removeDuplicates(fruitList));

	}

	public static ArrayList<String> removeDuplicates(ArrayList<String> fruitList ){

		for (int i = 0; i < fruitList.size(); i++) {

			for (int j = i+1; j < fruitList.size(); j++) {

				if(fruitList.get(i).equalsIgnoreCase(fruitList.get(i+1))) {

					fruitList.remove(i+1);

				}

			}

		}


		return fruitList;
	}

}
