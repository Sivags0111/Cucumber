package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_Cucumber {

	public static  WebDriver driver;

	public static WebDriver browserLaunch()	 {

		WebDriverManager.chromedriver().setup();

		  driver = new ChromeDriver();
		  return driver;
	}

	public static void urlLaunch(String url) {
		driver.get(url);
	}

	public static void sendvalues(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void clickElement(WebElement element) {
		element.click();
	}
	public void pressEscKey() throws AWTException {
		
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_ESCAPE);
         robot.keyRelease(KeyEvent.VK_ESCAPE);
     }
	
	
}
