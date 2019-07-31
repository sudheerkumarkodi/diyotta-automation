package com.diyotta.selenium;

public class FinallyBlockInException {

	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("I am in finally");
		}

	}

}
