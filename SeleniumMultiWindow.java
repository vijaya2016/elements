package com.selenium.practice.ui.elements;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumMultiWindow {
@Test
public void TestPopUp() throws IOException, InterruptedException 
{
//WebDriver webdriver = new FirefoxDriver();
System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
WebDriver webdriver = new FirefoxDriver();

webdriver.get("http://www.naukri.com");
webdriver.manage().window().maximize();
String parent = webdriver.getWindowHandle();
System.out.println(webdriver.switchTo().window(parent).getTitle()+ "parent window naaame");
System.out.println(parent);
Set<String> total = webdriver.getWindowHandles();
Iterator<String> itr = total.iterator();
while(itr.hasNext())
{
	String child_window = itr.next();
	//System.out.println(child_window+ "child_window name");
	//System.out.println(webdriver.getWindowHandle());

	if(!parent.equals(child_window))
	{
	WebDriver d = 	webdriver.switchTo().window(child_window);
	System.out.println(d.getTitle() + "child title");
	//d.getTitle();
		//System.out.println(webdriver.switchTo().window(child_window).getTitle());
		 try{
		        File scrFile= ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);

		        FileUtils.copyFile(scrFile, new File("C:/selenium/loginerror_" + System.currentTimeMillis()+".png") );
		       

		    }
		    catch (Exception e){
		        System.out.println("Failed to capture screenshot");
		    }

d.close();
		}
			System.out.println("took a scrren shot ");
			
			

}




}
	
}
