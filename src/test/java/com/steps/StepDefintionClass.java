package com.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintionClass extends BaseClass {
   
	
	@Given("User must be navigate to the facebook url")
	public void user_must_be_navigate_to_the_facebook_url() {
		
		browserLaunch("https://www.facebook.com/");
	    
	}
	@When("User enters the username and password")
	public void user_enters_the_username_and_password() {
		PomObjectModel pom = new PomObjectModel();
		enterText(pom.getUserName(), "mohan12");
		enterText(pom.getPassWord(),"12345");
		
	    
	}
	@And("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
		PomObjectModel pom = new PomObjectModel();
	    pom.getLogin().click();
	}
	@Then("User validates the title after login")
	public void user_validates_the_title_after_login() throws InterruptedException {
	    boolean contains = driver.getTitle().contains("Facebook");
	    Assert.assertTrue(contains);
	    Thread.sleep(3000);
	}



	
	
	
	
}
