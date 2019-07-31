package com.diyotta.drivers;

import static com.diyotta.constants.TestConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.diyotta.constants.TestConstants;

public class DriverCreation {

	public WebDriver driver;

	public void createDriver() {

		switch (TestConstants.TEST_BROWSER.toUpperCase()) {
		case "CHROME":
			System.setProperty(CHROME_DRIVER_KEY, DRIVER_BINARY_PATH + "chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "FIREFOX":
			System.setProperty(FIREFOX_DRIVER_KEY, DRIVER_BINARY_PATH + "geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "IE":
			System.setProperty("", "");
			driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("INFO: Enter correct browser name and rerun the script....");
			System.exit(0);
			break;
		}

	}

	public void destroyDriver() {
		driver.quit();
	}

}
