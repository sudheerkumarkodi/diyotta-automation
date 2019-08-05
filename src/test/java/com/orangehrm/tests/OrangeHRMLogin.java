package com.orangehrm.tests;

/**
 * @author : Sanjay
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {
	WebDriver driver;

	public void launchBrowser() throws Exception {
		String driverpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", driverpath + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://172.40.4.4:9900/#/login");
		// driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	public void enterCredentials() throws Exception {
		driver.findElement(By.id("inputControl_1")).sendKeys("avinash");
		driver.findElement(By.id("inputControl_2")).sendKeys("P2wd_1234");
		driver.findElement(By.id("inputControl_5")).click();
		Thread.sleep(4000);
	}

	public void clickLinks() throws Exception {
		driver.findElement(By.xpath("//li[@title='Data Point']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//li[@title='Data Object']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//li[@title='Data Flow']")).click();
	}

	public static void main(String[] args) throws Exception {

		OrangeHRMLogin login = new OrangeHRMLogin();
		login.launchBrowser();
		login.enterCredentials();
		login.clickLinks();

	}

}
