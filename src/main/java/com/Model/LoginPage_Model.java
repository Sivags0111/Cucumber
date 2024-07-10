package com.Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Model {

	public static WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login")
	private WebElement login;
	
	public WebElement getUsername() {
		return username;	
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	public LoginPage_Model(WebDriver abc) {
		driver=abc;
		PageFactory.initElements(driver, this);
	}
}
