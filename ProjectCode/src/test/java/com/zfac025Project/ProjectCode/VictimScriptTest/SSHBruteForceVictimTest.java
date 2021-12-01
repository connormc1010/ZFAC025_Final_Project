package com.zfac025Project.ProjectCode.VictimScriptTest;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import com.zfac025Project.ProjectCode.GoogleChrome;
import com.zfac025Project.ProjectCode.GoogleChromeOperations;
import com.zfac025Project.ProjectCode.Victims.VictimFactory;

/**
 * Unit test for simulating a victims actions on a network
 * The victim actions 
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SSHBruteForceVictimTest 
{
	
	static GoogleChrome browser;
	static GoogleChromeOperations operations;
	static VictimFactory victim;
	
	/**
	 * Before the test starts an instance of ChromeDriver is created
	 * Verifies the object was created properly
	 */
	@BeforeAll
	public static void createChrome() {
		browser = new GoogleChromeOperations();
		operations = new GoogleChromeOperations();
		victim = new VictimFactory();
		assertTrue(GoogleChrome.setUpDriver());
	}
	
	/**
	 * Quits the ChromeDriver which closes the Google Chrome window
	 */
	@AfterAll
	public static void closeChrome() {
		assertTrue(browser.quitDriver());
	}
	
	
	@Test
	@Order(1)
	public void creationTest() {
		assertTrue(victim.createVictim("SSHBruteFoce"));
	}
	
	@Test
	@Order(2)
	public void bbcNewsWebsite() {
		assertTrue(operations.getWebsite("https://www.bbc.co.uk"));
		}
	
	@Test
	@Order(3)
	public void outlook() {
		assertTrue(operations.getWebsite("https://outlook.office.com"));
	}
	
	@Test
	@Order(4)
	public void apple() {
		assertTrue(operations.getWebsite("https://www.apple.com"));
		assertTrue(operations.clickElement("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[2]/a"));
	}
    
}
