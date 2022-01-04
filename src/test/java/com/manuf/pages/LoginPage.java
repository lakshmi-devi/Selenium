package com.manuf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	 public WebDriver ldriver;
	 
	public LoginPage(WebDriver remoteDriver)
	{
		ldriver = remoteDriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath = "//input[@type='email']")
	private WebElement txtEmail;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement txtpassword;
	
	@FindBy(xpath = "//button[contains(text(), 'log in')]")
	private WebElement btnLogin;
	
	public void setUserName(String uName)
	{
		txtEmail.sendKeys(uName);
	}
	
	public void setPassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void Login()
	{
		btnLogin.click();
	}
	
	
}
