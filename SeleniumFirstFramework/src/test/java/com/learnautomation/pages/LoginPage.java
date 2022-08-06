package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver ldriver) {

		this.driver = ldriver;

	}

	@FindBy(xpath = "//a/span[contains(text( ),'Log In')]")
	WebElement login;

	@FindBy(name = "email")
	WebElement username;

	@FindBy(name = "password")
	WebElement pass;
	@FindBy(xpath = "//div[contains(text(),'Login')]")
	WebElement loginButton;

	public void loginToCRM(String usnameApplication, String passApplication) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("login element" + login);
		WebElement ele = login;
		ele.click();

		username.sendKeys(usnameApplication);
		pass.sendKeys(passApplication);
		loginButton.click();

	}

}
