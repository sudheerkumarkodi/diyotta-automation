package com.diyotta.selenium;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnSelenium {

	public static long maxWaitTimeout = 60;

	public static void main(String[] args) throws InterruptedException {

		// Step-1 Register Chrome driver binary key in system

		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");

		// Step 2 : Open Chrome Browser
		WebDriver driver = new ChromeDriver();

		// Step 3 : Navigate to application URL
		driver.get("http://172.40.4.4:9900/");

		// pageLoad timeout
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// maximize window
		driver.manage().window().maximize();

		// Enter Username
		driver.findElement(By.id("inputControl_1")).sendKeys("leela");
		driver.findElement(By.id("inputControl_2")).sendKeys("P2wd_4321");

		// Explicity Wait

		WebDriverWait wait = new WebDriverWait(driver, 30);

		// using by class
		wait.until(ExpectedConditions.elementToBeClickable(By.id("inputControl_5")));

		// using WebElement class
		WebElement loginButton = driver.findElement(By.id("inputControl_5"));
		wait.until(ExpectedConditions.visibilityOf(loginButton));

		wait.until(ExpectedConditions.visibilityOf(loginButton));

		waitForElementVisibilty(driver, loginButton);

		loginButton.click();

		Thread.sleep(10000);

		// Click on Datapoint link
		driver.findElement(By.xpath("//div[@title='Data Points']")).click();

		Thread.sleep(8000);

		// Click on New Data point linkch
		driver.findElement(By.xpath("(//a[@title='New Data Point'])[1]")).click();
		Thread.sleep(5000);

		// click on Netezza link
		driver.findElement(By.xpath("//p[text()='Netezza']")).click();
		Thread.sleep(5000);

		// Click on cancel button
		driver.findElement(By.xpath("//div[@class='button-group']/button[contains(@class,'cancel')]")).click();
		
		
		//Select class
		WebElement element = driver.findElement(By.xpath(""));
		Select select = new Select(element);
		
		select.selectByIndex(0);
		select.selectByVisibleText("India");
		select.selectByValue("domvalue");
		

		// Close Chrome browser instance
		driver.quit();

	}

	public static void waitForElementVisibilty(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, maxWaitTimeout);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public static void fluentWait(WebDriver driver, final WebElement element) {

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(maxWaitTimeout, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(Exception.class);

		WebElement element1 = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return element;
			}
		});

	}

}
