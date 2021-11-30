package com.zfac025Project.ProjectCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class GoogleChrome {
	
	public static WebDriver driver;

	public static Boolean setUpDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/connormcnulty/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return true;
	}

	public boolean quitDriver() {
		driver.close();
		return true;
	}

}
