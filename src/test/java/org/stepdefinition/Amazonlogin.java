package org.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.stepdefiniton2.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Amazonlogin extends Baseclass {

	@Given("To launch the chrome brower and maximise window")
	public void to_launch_the_chrome_brower_and_maximise_window() {
		launchBrowser(); 
		windowMaximize();

	}

	@When("To launch the url of the amazon application")
	public void to_launch_the_url_of_the_amazon_application() {
		launchUrl(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26adgrpid%3D58355126069%26ext_vrnc%3Dhi%26hvadid%3D610644601173%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007809%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3De%26hvrand%3D12727666199103251993%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2316415%26ref%3Dpd_sl_7hz2t19t5c_e%26tag%3Dgooghydrabk1-21%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	}

	@When("To pass the valid email or phone number")
	public void to_pass_the_valid_email_or_phone_number(DataTable d) {
		WebElement email = driver.findElement(By.id("ap_email"));
		List<String> l = d.asList();
		passtext(l.get(2), email);
	}

	@When("click the continue button")
	public void click_the_continue_button() {
		WebElement click = driver.findElement(By.xpath("//input[@type='submit']"));
		click.click();
	}

	@Then("close the entire browser")
	public void close_the_entire_browser() {
		CloseEntireBrowser();
	}

}
