package com.learnautomation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseWithoutFramework {

	@Test
	public void test1() {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium-new-batch\\JavaWorkSpace\\chromeDriver-104\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.get("https://freecrm.com/");
		driver.get("https://freecrm.com/");
		
		//driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//a/span[contains(text( ),'Log In')]")).click();
		driver.findElement(By.name("email")).sendKeys("sam2som4@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Abcd+@123456");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		//driver.quit();
		
	}
	

}
