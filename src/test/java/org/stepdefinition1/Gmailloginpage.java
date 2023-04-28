package org.stepdefinition1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.stepdefiniton2.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Gmailloginpage extends Baseclass {




	@Given("user has to launch the browser and maximise the window")
	public void user_has_to_launch_the_browser_and_maximise_the_window() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("user has to hit gmail url")
	public void user_has_to_hit_gmail_url() {
		launchUrl("https://accounts.google.com/v3/signin/identifier?dsh=S503643228%3A1681395255228146&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AQMjQ7RhQ1Axp_CuE-918CV-PCYJo6ijeEdigNGHagANOHZ7tJI6gY2_142Dw8BylXBwPfGxocJK&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	   
	}

	@When("user has to pass the data in email{string} field")
	public void user_has_to_pass_the_data_in_email_field(String email) {
		WebElement email1 = driver.findElement(By.id("identifierId"));
	  passtext(email, email1);
	}

	@When("click the next button")
	public void click_the_next_button() {
		WebElement element = driver.findElement(By.className("VfPpkd-RLmnJb"));
		clickbtn(element);
		
	}

	@Then("user has to close the window")
	public void user_has_to_close_the_window() {
		CloseEntireBrowser();
	  
	}



}
