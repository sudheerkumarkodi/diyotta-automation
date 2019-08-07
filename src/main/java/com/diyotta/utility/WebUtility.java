package com.diyotta.utility;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.diyotta.drivers.DriverCreation;

public class WebUtility extends DriverCreation {

	Actions actions = new Actions(getDriver());

	// left click
	public void clickOnElement(WebElement element) {
		actions.click(element).build().perform();
	}

	// Right Click
	public void contextClickOnElement(WebElement element) {
		actions.contextClick(element).build().perform();
	}

	// hover and click on element
	public void hoverAndClickOnElement(WebElement element) {
		actions.moveToElement(element).click().build().perform();
	}

	// drag and drop an element
	public void dragAndDropAnElement(WebElement sourceElement, WebElement targetElement) {
		actions.dragAndDrop(sourceElement, targetElement);
	}

	public void javaRobot() {
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CAPS_LOCK);
			robot.keyPress(KeyEvent.VK_TAB);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// document.getElementById("inputControl_5").click()
	public void javaScriptExecutor(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("document.getElementById(" + element + ").click()");
	}

	// Alerts Interface

	public void handleAlerts() {

		getDriver().switchTo().alert().accept();
		getDriver().switchTo().alert().dismiss();
		getDriver().switchTo().alert().getText();

		Alert alert = getDriver().switchTo().alert();

		alert.accept();
		alert.dismiss();
		alert.getText();
	}

	// Switch window
	public void switchWindow(String windowTitle) {
		String parentWinodwID = getDriver().getWindowHandle();

		Set<String> handles = getDriver().getWindowHandles();

		for (String handle : handles) {
			if (!handle.equals(parentWinodwID)) {
				// move focus to child window
				getDriver().switchTo().window(handle);
				break;
			}
		}
		// move focus back to parent window id
		getDriver().switchTo().window(parentWinodwID);

		for (String handle : handles) {
			if (!handle.equals(parentWinodwID)) {
				// move focus to child window
				if (getDriver().getTitle().contains(windowTitle)) {
					getDriver().switchTo().window(handle);
					break;
				}
			}
		}

		// move focus back to parent window id
		getDriver().switchTo().window(parentWinodwID);

	}

}
