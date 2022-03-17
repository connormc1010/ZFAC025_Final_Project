package com.zfac025Project.ProjectCode.VictimScriptTest;

import static org.junit.jupiter.api.Assertions.*;
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
* Unit test for simulating a victims actions on a network.
* The victim actions 
*/
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MITMVictimTest {

 static GoogleChrome browser;
 static GoogleChromeOperations operations;
 static VictimFactory victim;

 /**
   * Before the test starts an instance of ChromeDriver is created.
   * Verifies the object was created properly
   */
 @BeforeAll
 public static void createChrome() {
   browser = new GoogleChromeOperations();
   operations = new GoogleChromeOperations();
   victim = new VictimFactory();
 }

 /**
 * Quits the ChromeDriver which closes the Google Chrome window.
 */
 @AfterAll
 public static void closeChrome() {
   assertTrue(browser.quitDriver());
   System.out.print("Finished victim script");
   
 }


 @Test
 @Order(1)
 public void creationTest() {
   assertTrue(victim.createVictim("MITM"));
 }

 @Test
 @Order(2)
 public void goCompareTest() throws InterruptedException {
   assertTrue(operations.getWebsite("https://www.gocompare.com/loans/"));
   assertTrue(operations.pageLoaded("/html/body/div[2]/header"));
 }
 
 
 @Test
 @Order(3)
 public void indeedTest() {
	 assertTrue(operations.getWebsite("https://uk.indeed.com"));
	 assertTrue(operations.pageLoaded("/html/body/div[1]/div[1]/nav/div/div"));
 }
 
 @Test
 @Order(4)
 public void wongaTest() {
	 assertTrue(operations.getWebsite("https://www.wonga.com/"));
	 assertTrue(operations.pageLoaded("/html/body/header"));
 }
 
 @Test
 @Order(5)
 public void wongaLoanTest() throws InterruptedException {
	 assertTrue(operations.clickElement("/html/body/div/div[1]/div/div/div[1]/div/wn-category-nav/nav/wn-category-list/div/div[6]/a/i"));
 }
}
