package com.diyotta.actions;

import org.openqa.selenium.WebElement;

public class WebActions {

	public void setValue(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	public void click(WebElement element) {
		element.click();
	}

}
