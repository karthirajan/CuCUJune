package com.telecom.resources;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonaction {
	
	public static WebDriver driver;
	
	public static WebDriver launch(String url){
		
		System.out.println("Before Scenario");
		WebDriverManager.chromedriver().setup();
		
		DesiredCapabilities chrome = DesiredCapabilities.chrome();
		chrome.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("disable-infobars");
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("headless");
		
		chrome.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		
		 driver = new ChromeDriver(chrome);
		driver.get(url);
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	public void insertText(WebElement ele,String value) {
		
		ele.sendKeys(value);

	}
	
	public void button(WebElement ele) {
		
		ele.click();

	}

}
