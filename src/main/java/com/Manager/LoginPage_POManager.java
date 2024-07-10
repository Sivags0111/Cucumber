package com.Manager;

import org.openqa.selenium.WebDriver;

import com.Model.LoginPage_Model;

public class LoginPage_POManager {

	public static WebDriver driver;
	
	private LoginPage_Model lp;
	
	public LoginPage_Model getInstance() {
		lp= new LoginPage_Model(driver);
		return lp;
	}
	
	public LoginPage_POManager(WebDriver abc) {
		
		driver= abc;

	}
}
