package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class ExitFrame extends BaseClass
{
	public static void exitFrame() {
		driver.switchTo().defaultContent();
		Reporter.log("Exit Frame");
		Log.info("Exit Frame");
	}
}
