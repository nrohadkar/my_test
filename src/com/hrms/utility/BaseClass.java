package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass
{
	public static WebDriver driver;
	public static void openApplication() {
		 driver = new ChromeDriver();
		 driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		 Reporter.log("Application Opened");
		 Log.info("Application Opened");
	}
	public static void closeApplication() {
		driver.quit();
		Reporter.log("Application Closed");
		Log.info("Application Closed");
	}
}
