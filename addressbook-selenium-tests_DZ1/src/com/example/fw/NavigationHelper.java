package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.GroupData;
import com.example.tests.TestBase;

public class NavigationHelper extends HelperBase {

	

	public NavigationHelper(ApplicationManager manager) {
		super(manager);
	}

	public void openMainPage() {
		driver.get(manager.baseUrl + "/addressbookv4.1.4/");
	}

	public void gotoGroupsPage() {
		driver.findElement(By.linkText("groups")).click();
	}

	

	public void initContactCreation() {
		driver.findElement(By.linkText("add new")).click();
	}

}
