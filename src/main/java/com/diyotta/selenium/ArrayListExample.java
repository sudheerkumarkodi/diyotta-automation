package com.diyotta.selenium;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		List<String> arrayList = new ArrayList<String>();

		// Add values to arraylist object

		list.add(10);
		list.add("String");
		list.add(10.3f);
		list.add(10.2);
		list.add('c');
		list.add("String");

		list.add(null);
		list.add("");

		// get size of the arraylist

		System.out.println("arraylist size is : " + list.size());

		System.out.println("before remove : " + list);
		
		// looping in arraylist using normal for loop
		for (int i = 0; i < list.size(); i++)
			System.out.println("for loop :" + list.get(i));
		
		
		//Remove data from an arraylist
		list.remove(2);
		list.remove(3);

		// looping in arraylist using for each loop

		for (Object obj : list)
			System.out.println("for each loop :" + obj);
		

		// list = null;

		System.out.println("after remove : " + list);

	}

}
