package com.rough;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baronfig_Demo {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();


		WebDriver driver= new ChromeDriver();	

		driver.manage().window().maximize();

		driver.navigate().to("https://baronfig.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 20); // Adjust the timeout as needed
		
		WebElement popup = driver.findElement(By.xpath("//*[@stroke='rgba(255,255,255,1)']"));
        
		wait.until(ExpectedConditions.elementToBeClickable(popup));
        
		pressEscKey();
		
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("(//*[@class='flex-shrink'])[3]")).click();

		driver.findElement(By.xpath("(//button[@class='btn'])[1]")).click();

		driver.findElement(By.xpath("(//*[@tabindex='-1'])[1]")).click();		
	}
	
	public static void pressEscKey() throws AWTException {
		
		 Robot robot = new Robot();
		 
		 robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
    }
}
