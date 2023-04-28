package org.stepdefinition1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.stepdefiniton2.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Gmailloginpage1 extends Baseclass{

@Given("to launch the browser and maximise the window")
public void to_launch_the_browser_and_maximise_the_window() {
    launchBrowser();
    windowMaximize();
}

@When("to launch the gmail url")
public void to_launch_the_gmail_url() {
	launchUrl("https://accounts.google.com/v3/signin/identifier?dsh=S503643228%3A1681395255228146&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AQMjQ7RhQ1Axp_CuE-918CV-PCYJo6ijeEdigNGHagANOHZ7tJI6gY2_142Dw8BylXBwPfGxocJK&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

    
}

@When("to pass the mail id in email field")
public void to_pass_the_mail_id_in_email_field(String datas) {
WebElement element = driver.findElement(By.id("identifierId"));
passtext(datas, element);
   
}

@When("to click the next button")
public void to_click_the_next_button() {
	WebElement element1 = driver.findElement(By.className("VfPpkd-RLmnJb"));
   clickbtn(element1);
}

@Then("to close the entire window")
public void to_close_the_entire_window() {
   CloseEntireBrowser();
   
}




}
