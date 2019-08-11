package com.diyotta.tests;

import com.diyotta.pagefactory.StudioMenuPageFactory;

public class StudioMenus {

	StudioMenuPageFactory studio = new StudioMenuPageFactory();

	public void shiftMenu(String menuLabel) {

		switch (menuLabel.toUpperCase()) {
		case "HOME":
			studio.studioHomeMenu();
			break;
		case "DATA POINT":
			studio.dataPointMenu();
			break;
		case "DATA OBJECT":
			studio.dataObjectMenu();
			break;
		case "DATA FLOW":
			studio.dataFlowMenu();
			break;
		case "JOB FLOW":
			studio.jobFlowMenu();
			break;
		case "SQL EDITOR":
			studio.sqlEditorMenu();
			break;
		default:
			System.out.println("Please provide valid label for menu");

		}

	}
}
