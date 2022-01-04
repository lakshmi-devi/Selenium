package com.manuf.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.manuf.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_LoginTest_001 {
	 
	public String URL = "https://ui.manufacton.com/#/";
	public String userName = "qa@lakshmi.comp";
	public String password = "12345678";
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		 driver = new ChromeDriver(options);
		 driver.get("https://expired.badssl.com/");
		
	}
    
	@Test
	public void login()
	{
		driver.get(URL);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(userName);
		lp.setPassword(password);
		lp.Login();
	}


}
