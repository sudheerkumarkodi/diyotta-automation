package com.diyotta.selenium;

public class MultiExceptionInSingleCatchBlock {
	static String str = "str";

	public static void main(String[] args) {

		try {
			System.out.println(str.charAt(1));
		}
		// System.out.println("test"); // uncomment this line to see the error
		catch (NullPointerException | StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			// System.out.println(e.toString());
			// System.out.println(e.getMessage());
		}

	}

}
