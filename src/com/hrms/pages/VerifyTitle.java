package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class VerifyTitle extends BaseClass 
{
	public static void title(String title) {
		if(driver.getTitle().equals(title)) {
			Reporter.log("Title Matched");
			Log.info("Title Matched");
		}
		else {
			Reporter.log("Title Not Matched");
			System.out.println(driver.getTitle());
			Log.info("Title Not Matched");
		}
	}
}
