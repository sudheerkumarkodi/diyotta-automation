package com.diyotta.drivers;

import static com.diyotta.constants.TestConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.diyotta.constants.TestConstants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverCreation {

	private WebDriver driver;

	public WebDriver createDriver() {

		switch (TestConstants.TEST_BROWSER.toUpperCase()) {
		case "CHROME":
			// System.setProperty(CHROME_DRIVER_KEY, DRIVER_BINARY_PATH +
			// "chromedriver.exe");
			WebDriverManager.chromedriver().version(CHROME_VERSION).setup();
			driver = new ChromeDriver();
			break;
		case "FIREFOX":
			// System.setProperty(FIREFOX_DRIVER_KEY, DRIVER_BINARY_PATH +
			// "geckodriver.exe");
			WebDriverManager.firefoxdriver().version(FIREFOX_VERSION).setup();
			driver = new FirefoxDriver();
			break;
		case "IE":
			// System.setProperty("", "");
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("INFO: Enter correct browser name and rerun the script....");
			System.exit(0);
			break;
		}

		return driver;

	}

	public WebDriver createDriverNew(String browser) {

		switch (browser.toUpperCase()) {
		case "CHROME":
			// System.setProperty(CHROME_DRIVER_KEY, DRIVER_BINARY_PATH +
			// "chromedriver.exe");
			WebDriverManager.chromedriver().version(CHROME_VERSION).setup();
			driver = new ChromeDriver();
			break;
		case "FIREFOX":
			// System.setProperty(FIREFOX_DRIVER_KEY, DRIVER_BINARY_PATH +
			// "geckodriver.exe");
			WebDriverManager.firefoxdriver().version(FIREFOX_VERSION).setup();
			driver = new FirefoxDriver();
			break;
		case "IE":
			// System.setProperty("", "");
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("INFO: Enter correct browser name and rerun the script....");
			System.exit(0);
			break;
		}

		return driver;
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public void destroyDriver() {
		driver.quit();
	}

}
