	package com.stepDefinition;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import com.Manager.LoginPage_POManager;
import com.base.BaseClass_Cucumber;
import com.helper.Data_Reader_Manager;
import com.testRunner.Runner_class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass_Cucumber{

	public static WebDriver driver=Runner_class.driver;
	public static LoginPage_POManager pom = new LoginPage_POManager(driver);


	@Given("^User launches the Adactin application URL$")
	public void userLaunchesTheAdactinApplicationURL() throws Throwable {
		
		String propUrl = Data_Reader_Manager.getInstanceDRM().getInstance().getPropUrl();
		
		urlLaunch(propUrl);
	}

	@When("^User enters a valid username in the Username field$")
	public void userEntersAValidUsernameInTheUsernameField() throws Throwable {
		
		String propUsername = Data_Reader_Manager.getInstanceDRM().getInstance().getPropUsername();
			
			sendvalues(pom.getInstance().getUsername(), propUsername);
	}

	@When("^User enters a valid password in the Password field$")
	public void userEntersAValidPasswordInThePasswordField() throws Throwable {
		
		String propPassword = Data_Reader_Manager.getInstanceDRM().getInstance().getPropPassword();
		sendvalues(pom.getInstance().getPassword(), propPassword);
	}

	@Then("^User clicks the login button$")
	public void userClicksTheLoginButton() throws Throwable {
		
		clickElement(pom.getInstance().getLogin());

	}

	@Then("^User navigates to the Search Hotel Page$")
	public void userNavigatesToTheSearchHotelPage() throws Throwable {
		
	}
}
