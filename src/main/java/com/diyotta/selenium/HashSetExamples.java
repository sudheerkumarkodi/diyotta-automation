package com.diyotta.selenium;

import java.util.HashSet;
import java.util.Set;

public class HashSetExamples {

	public static void main(String[] args) {

		HashSet hashSet1 = new HashSet();
		HashSet<String> hashSet2 = new HashSet<String>();

		Set hashSet3 = new HashSet();
		Set<String> hashSet4 = new HashSet<String>();

		hashSet2.add("Test");
		hashSet2.add("Test2");
		hashSet2.add("Test3");
		hashSet2.add("Test3"); // Duplicate value
		hashSet2.add(null); // allows null

		System.out.println(hashSet2);
		
		

	}

}
