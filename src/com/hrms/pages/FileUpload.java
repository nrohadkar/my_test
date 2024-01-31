package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class FileUpload extends BaseClass
{
	static By file_upload = By.name("photofile");
	
	public static void fileupload() {
		WebElement wb = driver.findElement(file_upload);
		wb.sendKeys("A:\\rose.webp");
		Reporter.log("File Uploaded Successfully");
		Log.info("File Uploaded Successfully");
	}
}
