package com.diyotta.selenium;

import java.sql.SQLException;

public class ThrowsKeywordEXception {

	public static void main(String[] args) throws ArithmeticException{
		// TODO Auto-generated method stub

		//test();

		/*
		 * try{ test(); }catch(Exception e){ e.printStackTrace(); }
		 */

		System.out.println("Test");

	}

	public static void test()
			throws ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, SQLException {
		System.out.println(10 / 0);

	}

}
