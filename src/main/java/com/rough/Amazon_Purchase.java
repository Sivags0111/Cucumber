package com.rough;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Purchase {


	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Siva\\Downloads\\SeleniumPractice\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();	
//		driver.manage().window().maximize();

		driver.navigate().to("https://www.google.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		driver.findElement(By.id("APjFqb")).sendKeys("amazon");

		driver.findElement(By.xpath("//div[@class='sbic vYOkbe']")).click();

		driver.findElement(By.xpath("(//*[text()='Amazon.in'])[1]")).click();

		driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[1]")).sendKeys("mobiles");

		driver.findElement(By.xpath("(//*[text()='mobiles'])[1]")).click();

		driver.findElement(By.xpath("//span[text()='Samsung']")).click();

		driver.findElement(By.xpath("//*[@class='a-button-text a-declarative']")).click();

		driver.findElement(By.xpath("(//a[@class='a-dropdown-link'])[1]")).click();

		String parentWindow = driver.getWindowHandle();

		driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base')])[2]")).click();	

			Set<String> s = driver.getWindowHandles();
			for (String windowHandle : s) {
	
				driver.switchTo().window(windowHandle);
	
				if(driver.getTitle().equals("(Refurbished) Samsung Galaxy A03 Core (Copper Bronze, 2GB RAM, 32GB Storage) : Amazon.in: Electronics")) {

				driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();

				driver.findElement(By.xpath("//*[@class='a-button a-spacing-top-base a-button-span12 a-button-base celwidget']")).click();

				driver.findElement(By.xpath("//*[@class='a-button-text a-declarative']")).click();	

				driver.findElement(By.xpath("//*[@id='quantity_0']")).click();

			}


		}

	}
}
