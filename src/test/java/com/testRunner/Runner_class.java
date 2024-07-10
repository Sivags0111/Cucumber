package com.testRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.base.BaseClass_Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Siva\\eclipse-workspace\\Cucumber\\src\\test\\java\\featurefile\\TestRunner.feature",
	glue = "com.stepDefinition",
	snippets= SnippetType.CAMELCASE,
	dryRun=!true,
	monochrome=true,
	plugin= {"html:HtmlReport/AdactinLogin",
			"pretty",
			"json:JsonReport/AdactinLogin.json",
			"com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/"+"AdactinLogin.html"}
	)
	
  public class Runner_class extends BaseClass_Cucumber {
		
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		 driver = browserLaunch();
	}
	
	@AfterClass
	
	public static void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	}

	


 