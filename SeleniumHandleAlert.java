package com.selenium.practice.ui.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumHandleAlert {
	
	
	@Test()
	public void checkAlertWindow() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
	webdriver.get("https://www.naukri.com/");
	//Thread.sleep(12000);
	//WebElement welement = webdriver.findElement(By.xpath("//div[contains(@class, 'userPrompt animate')]"));
	//System.out.println(welement.isEnabled());
	
	WebElement myDynamicElement = (new WebDriverWait(webdriver, 10))
			  .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class = 'gmail-nav__nav-link gmail-nav__nav-link__sign-in']")));
				//	  (By.xpath("//div[contains(@class, 'userPrompt animate')]")));
	
	System.out.println(myDynamicElement.isEnabled());
	}
	

}
