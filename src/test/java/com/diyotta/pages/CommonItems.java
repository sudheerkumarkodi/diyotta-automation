package com.diyotta.pages;

import org.openqa.selenium.By;

public class CommonItems {
	public By user = By.xpath("//img[@class='avator-img']");
	public By logout = By.xpath("//a[@data-ng-click='logout()']");
	public By moduleMenu = By.xpath("//img[@alt='menu']");
	public By moduleAdmin = By.xpath("//a[@title='Admin']");
	public By moduleStudio = By.xpath("//a[@title='Studio']");
	public By moduleScheduler = By.xpath("//a[@title='Scheduler']");
	public By moduleMonitor = By.xpath("//a[@title='Monitor']");

}
