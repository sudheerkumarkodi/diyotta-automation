package com.diyotta.selenium;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConverstion {

	public static void main(String[] args) {

		// Convert Array to ArrayList

		// 1stWay of doing conversation
		String[] strArray = { "Test", "Test1" };
		ArrayList<String> strArrayList = new ArrayList<String>(Arrays.asList(strArray));
		System.out.println(strArrayList);

		// 2ndWay of doing
		ArrayList<String> strArrayList1 = new ArrayList<String>();
		for (int i = 0; i < strArray.length; i++)
			strArrayList1.add(strArray[i]);

		System.out.println(strArrayList1);

		// Convert ArrayList to Array
		ArrayList<String> strArrayList2 = new ArrayList<String>();
		strArrayList2.add("Test2");
		strArrayList2.add("Test3");

		// String ArrayList to String array
		String[] strArray1 = strArrayList2.toArray(new String[strArrayList2.size()]);

		for (String str : strArray1) {
			System.out.println(str);
		}

	}

}
