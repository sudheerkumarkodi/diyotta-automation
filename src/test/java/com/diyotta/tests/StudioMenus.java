package com.diyotta.tests;

import com.diyotta.pagefactory.StudioMenuPageFactory;

public class StudioMenus extends StudioMenuPageFactory {

	public void shiftMenu(String menuLabel) {

		switch (menuLabel.toUpperCase()) {
		case "HOME":
			studioHomeMenu();
		case "DATA POINT":
			dataPointMenu();
		case "DATA OBJECT":
			dataObjectMenu();
		case "DATA FLOW":
			dataFlowMenu();
		case "JOB FLOW":
			jobFlowMenu();
		case "SQL EDITOR":
			sqlEditorMenu();
		default:
			System.out.println("Please provide valid label for menu");

		}

	}
}
