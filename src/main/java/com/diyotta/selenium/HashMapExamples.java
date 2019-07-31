package com.diyotta.selenium;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExamples {

	public static void main(String[] args) {

		Map map2 = new HashMap();
		Map<Integer, String> map3 = new HashMap<Integer, String>();

		HashMap map = new HashMap();
		map.put(1, "String");
		map.put(10.2f, "String2");

		System.out.println("Non Type safety map : " + map);

		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("key1", "String3");
		map1.put("key1", "String4"); // Duplicate Key
		map1.put(null, "String5"); // Null key
		map1.put(null, "String6"); // Null key
		map1.put("Key3", "String6"); // Duplicate value
		map1.put("Key2", null); // null value

		System.out.println("Type safety map with null and duplicate key value : " + map1);

		// looping through EntrySet
		for (Map.Entry m : map1.entrySet())
			System.out.println("key: " + m.getKey() + " value : " + m.getValue());
		
		// looping through Iterartor
		/*Iterator<String> itr = map1.;

		while (itr.hasNext())
			System.out.println("key: " + itr.next());*/
		
		

	}

}
