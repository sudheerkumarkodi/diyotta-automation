package com.diyotta.pages;

import org.openqa.selenium.By;

public class AddNewUser {

	public By clickUsers = By.xpath("//a[@title='Users']/img");
	public By newUser = By.xpath("//div[@title='New']//span[text()='New']");
	public By uid = By.id("inputControl_1");// input[@id='inputControl_1']
	public By uname = By.id("inputControl_2");
	public By passwd = By.xpath("//div/label/following-sibling::input[@type='password']");
	public By email = By.xpath("//div/label/following-sibling::input[@type='text']");
	public By phoneNo = By.id("inputControl_5");
	public By desc = By.id("inputControl_6");
	
	public By privileges = By.xpath("//*[text()='Privileges']");
	public By grantadmin= By.id("inputControl_grant_1");
	// save the User
	public By saveUser = By.xpath("//span[text()='Save']");

	/*
	 * public By By.id("inputControl_1")).sendKeys("sudheer"); public By
	 * By.id("inputControl_2")).sendKeys("Sridurga@1"); public By
	 * By.id("inputControl_5")).click(); public By
	 * By.xpath("//div/a[@title='DI Suite']/img")).click(); public By
	 * By.xpath("//a[@title='Admin']/span/img")).click(); Thread.sleep(5000);
	 */

	/*
	 * //Organization Tab public By
	 * By.xpath("//a[text()=' Organizations']")).click(); //img[@title='Add']
	 */
	// public By By.xpath("//img[@title='Add']")).click();




}
