package com.diyotta.selenium;

import java.util.ArrayList;

public class ArrayListWithGenerics {

	public static void main(String[] args) {

		// Type saftey in array list using Java generics

		ArrayList<String> list = new ArrayList<String>();

		ArrayList<Integer> integerList = new ArrayList<Integer>();

		ArrayList<StudentEncapsulation> stList = new ArrayList<StudentEncapsulation>();

		// Fixing size of an arrayList

		ArrayList<String> staticSizeList = new ArrayList<String>();

		ArrayList<String> staticSizeList1 = new ArrayList<String>();
		
		ArrayList<Integer> staticSizeList3 = new ArrayList<Integer>();

		staticSizeList.add("strt1");
		staticSizeList.add("strt2");
		staticSizeList.add("strt3");

		staticSizeList1.add("str4");
		staticSizeList1.add("str5");
		
		staticSizeList3.add(1);
		staticSizeList3.add(2);
		

		// Merge two different arrayList to a new arraylist
		ArrayList<String> staticSizeList2 = new ArrayList<String>();

		staticSizeList2.addAll(staticSizeList);
		staticSizeList2.addAll(staticSizeList1);
		
		//staticSizeList2.addAll(staticSizeList3); uncomment code to see the error
		
		System.out.println("ArrayList merge : " + staticSizeList2);

		System.out.println("Before size : " + staticSizeList.size());

		// trim the size of arrayList with respect to memory allocation
		staticSizeList.trimToSize();

		System.out.println("After size : " + staticSizeList.size());

		// enhance the size of arrayList with respect to memory allocation
		staticSizeList.ensureCapacity(50);

		// clearing arrayList data
		staticSizeList.clear();

		System.out.println("With clear method: " + staticSizeList);

		staticSizeList.add("Test");

		staticSizeList.removeAll(staticSizeList);

		System.out.println("With RemoveAll method: " + staticSizeList);

	}

}
