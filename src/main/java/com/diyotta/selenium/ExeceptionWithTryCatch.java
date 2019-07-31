package com.diyotta.selenium;

public class ExeceptionWithTryCatch {

	int b = 2;

	public static void main(String[] args) {
		int a = 10;
		ExeceptionWithTryCatch execeptionWithTryCatch = null;
		try {
			System.out.println("1st Try");
			try {
				System.out.println("2nd Try");
				System.out.println(execeptionWithTryCatch.b); // NullPointerException
				try {
					System.out.println(execeptionWithTryCatch.b); // NullPointerException
				} catch (NullPointerException ne) {
					System.out.println("2nd try null pointer");
				}
			} catch (Exception e) {
				System.out.println("null pointer");
			}
			System.out.println(a / 0); // ArithmeticException
		} catch (ArithmeticException ae) {
			System.out.println("ArithmeticException ");
			try {
				System.out.println(execeptionWithTryCatch.b); // NullPointerException
			} catch (NullPointerException ne) {
				System.out.println("Catch block try null pointer");
			}
		}

		System.out.println("Test code");

	}

}
