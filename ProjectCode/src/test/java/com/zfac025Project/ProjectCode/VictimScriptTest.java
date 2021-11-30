package com.zfac025Project.ProjectCode;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simulating a users actions on a network
 */
public class VictimScriptTest 
{
	@Test
	public void createChrome() {
		System.setProperty("webdriver.chrome.driver", "/Users/connormcnulty/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.close();
	}
    
}
