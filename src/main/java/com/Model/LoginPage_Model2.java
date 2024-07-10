package com.Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage_Model2 {

	public static WebDriver driver;

	@FindBy(xpath = "//*[@id=\"location\"]/option[6]")
	private WebElement selectLocation;
	@FindBy(xpath = "//*[@id=\"hotels\"]/option[3]")
	private WebElement selectHotel;
	@FindBy(xpath = "//*[@id=\"room_type\"]/option[4]")
	private WebElement selectRoomType;
	@FindBy(xpath = "//*[@id=\"room_nos\"]/option[3]")
	private WebElement selectnNoOfRoom;
	
	public LoginPage_Model2(WebDriver abc) {
		driver=abc;
		PageFactory.initElements(driver, this);
	}
}
