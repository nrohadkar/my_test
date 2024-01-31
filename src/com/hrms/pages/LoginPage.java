package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class LoginPage extends BaseClass
{
	static By txt_loginname = By.name("txtUserName");
	static By txt_password 	= By.name("txtPassword");
	static By btn_login 	= By.name("Submit");
	public static void login(String username,String password) {
		driver.findElement(txt_loginname).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
		Reporter.log("Click on Login Button");
		Log.info("Click on Login Button");
	}
}
