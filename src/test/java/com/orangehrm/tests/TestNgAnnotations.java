package com.orangehrm.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgAnnotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@Test(priority = 0, enabled = true)
	@Parameters({ "browser", "env", "dbName" })
	public void f(String browserName, String env, String dbName) {
		System.out.println(browserName);
		System.out.println(env);
		System.out.println(dbName);
		System.out.println("Test Method");
	}

	@Test(priority = 1, enabled = true)
	public void f1() {
		System.out.println("Test Method-1");
	}

	@Test(priority = 2, enabled = true, groups = { "Smoke" })
	public void f2() {
		System.out.println("With Single Group name-Smoke");
	}

	@Test(priority = 3, enabled = true, groups = { "Smoke", "Regression" })
	public void f3() {
		System.out.println("With two Group names");
	}

	@Test(priority = 4, enabled = true, groups = { "Regression1" })
	public void f4() {
		System.out.println("With Regression1 as Group name");
	}

	@Test(priority = 5, enabled = true, groups = { "Regression2" })
	public void f5() {
		System.out.println("With Regression2 as Group name");
	}

	@Test(priority = 6, enabled = true, groups = { "dataProvider" }, dataProvider = "dp")
	public void f6(Integer number, String str) {
		System.out.println(number + " + " + str);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, new Object[] { 3, "c" } };
	}

	@DataProvider(name = "dp1")
	public Object[][] dp1() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, new Object[] { 3, "c" } };
	}

}
