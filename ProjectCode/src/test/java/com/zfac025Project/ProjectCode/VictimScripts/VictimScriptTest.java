package com.zfac025Project.ProjectCode.VictimScripts;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import com.zfac025Project.ProjectCode.GoogleChrome;
import com.zfac025Project.ProjectCode.GoogleChromeOperations;

/**
 * Unit test for simulating a victims actions on a network
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class VictimScriptTest 
{
	
	static WebDriver driver;
	static GoogleChrome browser;
	static GoogleChromeOperations operations;
	
	@BeforeAll
	public static void createChrome() {
		browser = new GoogleChromeOperations();
		operations = new GoogleChromeOperations();
		assertTrue(GoogleChrome.setUpDriver());
	}
	
	@AfterAll
	public static void closeChrome() {
		assertTrue(browser.quitDriver());
	}
	
	@Test
	@Order(1)
	public void bbcNewsWebsite() throws InterruptedException {
		assertTrue(operations.getWebsite("https://www.bbc.co.uk"));
		}
	
	@Test
	@Order(2)
	public void outlook() throws InterruptedException {
		assertTrue(operations.getWebsite("https://outlook.office.com"));
	}
	
	@Test
	@Order(3)
	public void apple() throws InterruptedException {
		assertTrue(operations.getWebsite("https://www.apple.com"));
		assertTrue(operations.clickElement("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[2]/a"));
	}
    
}
