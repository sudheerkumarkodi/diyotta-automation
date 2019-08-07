package com.diyotta.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import com.diyotta.drivers.DriverCreation;
import com.diyotta.tests.CommonTestMethods;

public class UserPage extends DriverCreation{
	CommonTestMethods commonTestMethods = new CommonTestMethods();

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
	
	
	public void addUser() {
		commonTestMethods.shiftModule("admin");
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getDriver().findElement(clickUsers).click();
		getDriver().findElement(newUser).click();
		getDriver().findElement(uid).sendKeys("test");
		getDriver().findElement(uname).sendKeys("test");
		getDriver().findElement(passwd).sendKeys("Test@143");
		getDriver().findElement(email).sendKeys("test@gmail.com");
		getDriver().findElement(phoneNo).sendKeys("8566902137");
		getDriver().findElement(privileges).click();
		getDriver().findElement(grantadmin).click();
		getDriver().findElement(saveUser).click();
	}
	
	public void deleteUser() {
		
	}


}
