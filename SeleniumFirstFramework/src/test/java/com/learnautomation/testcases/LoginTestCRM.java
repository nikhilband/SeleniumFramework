package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ExcelDataProvider;

public class LoginTestCRM extends BaseClass{

	

	@Test
	public void loginApp() {

		
		logger = report.createTest("Login to CRM");
		
		//ExcelDataProvider excl = new ExcelDataProvider();
		//excl.getStringData("UsePass", 0, 0);
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		System.out.println("login");

		logger.info("Starting Application");
		
		loginpage.loginToCRM(exc.getStringData("UsePass", 0, 0), exc.getStringData("UsePass", 0, 1));
		//BrowserFactory.quiteBrowser(driver);

		/*
		 * LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		 * System.out.println("login");
		 * 
		 * loginpage.loginToCRM("sam2som4@gmail.com","Abcd+@123456");
		 * BrowserFactory.quiteBrowser(driver);
		 * 
		 */

		/*
		 * System.out.println("Object created  :-"+ exc.getStringData("UsePass", 0, 0));
		 * String a = exc.getStringData( "UsePass", 0, 0); String b = exc.getStringData(
		 * "UsePass", 0, 1);
		 * 
		 */
		// driver=BrowserFactory.startApplication(driver, "Chrome",
		// "https://ui.freecrm.com/");

		// System.out.println(driver.getTitle());

		// LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		// System.out.println("login");

		// logger.info("Starting Application");
		// loginpage.loginToCRM(exc.getStringData("UsePass",0,0),exc.getStringData("UsePass",0,1));

		// logger.pass("Login Success");

		// loginpage.loginToCRM(a,b);

		// Helper.captcureScreenshot(driver);

		logger.pass("Login Success");
	}

}
