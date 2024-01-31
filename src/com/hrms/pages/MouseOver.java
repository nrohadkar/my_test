package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class MouseOver extends BaseClass
{
	static By click_pim = By.linkText("PIM");
	static By click_addEmp = By.linkText("Add Employee");
	static By txt_firstname = By.xpath("//input[@name='txtEmpFirstName']");
	static By txt_lastname = By.xpath("//input[@name='txtEmpLastName']");
	public static void clickonpim() {
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(click_pim)).perform();
		Reporter.log("MouseOver on PIM");
		Log.info("MouseOver On PIM");
	}
	public static void addEpmployee() {
		driver.findElement(click_addEmp).click();
		Reporter.log("Click on AddEmployee Button");
		Log.info("Click on AddEmployee Button");
	}
	public static void addEmpDetails(String fname,String lname)
	{
		driver.findElement(txt_firstname).sendKeys(fname);
		driver.findElement(txt_lastname).sendKeys(lname);
		
	}
	
}
