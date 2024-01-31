package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class SaveButton extends BaseClass
{
	static By btn_save =By.xpath("//input[@id='btnEdit']");
	public static void save() {
		driver.findElement(btn_save).click();
		Reporter.log("Clicked on Save Button");
		Log.info("Clicked on Save Button");
	}
}
