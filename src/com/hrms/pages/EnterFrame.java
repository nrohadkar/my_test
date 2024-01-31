package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class EnterFrame extends BaseClass
{
	public static void enterFrame() {
		driver.switchTo().frame("rightMenu");
		Reporter.log("Enter Frame");
		Log.info("Enter Frame");
	}
}
