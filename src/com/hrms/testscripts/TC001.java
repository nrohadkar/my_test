package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.EnterFrame;
import com.hrms.pages.ExitFrame;
import com.hrms.pages.FileUpload;
import com.hrms.pages.LoginPage;
import com.hrms.pages.Logout;
import com.hrms.pages.MouseOver;
import com.hrms.pages.SaveButton;
import com.hrms.pages.VerifyTitle;
import com.hrms.utility.BaseClass;

public class TC001
{
	@Test
	public static void tc001()throws Exception {
		BaseClass.openApplication();
		VerifyTitle.title("HRMS");
		LoginPage.login("nareshit","nareshit");
		Thread.sleep(3000);
		MouseOver.clickonpim();
		Thread.sleep(3000);
		MouseOver.addEpmployee();
		Thread.sleep(3000);
		EnterFrame.enterFrame();
		MouseOver.addEmpDetails("SURESH", "BABU");
		VerifyTitle.title("OrangeHRM");
		Thread.sleep(3000);
		FileUpload.fileupload();
		Thread.sleep(3000);
		SaveButton.save();
		ExitFrame.exitFrame();
		Thread.sleep(7000);
		Logout.logout();
		Thread.sleep(3000);
		BaseClass.closeApplication();
	
	}
}
