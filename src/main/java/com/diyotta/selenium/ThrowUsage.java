package com.diyotta.selenium;

public class ThrowUsage {

	public static void main(String[] args) throws ThrowKeywordException, Exception {

		test();
	}

	public static void test() throws ThrowKeywordException, Exception {
		System.out.println("Throwing own exception");
		throw new ThrowKeywordException();
		// throw new ThrowKeywordException2();
		// throw new ArithmeticException("new execption");
	}
}
