package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sam.Baseclass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Sampleprogram  extends Baseclass{

	
	@BeforeClass
	private void launchTheBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(retryAnalyzer = Failed.class)
	private void tc1() {
		driver.get("https://en-gb.facebook.com/");
		String title = driver.getTitle();
		
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("dineinmfc29@gmail.com");
		
		WebElement element2 = driver.findElement(By.name("pass"));
		element2.sendKeys("dinie");
		

	}
	
}
