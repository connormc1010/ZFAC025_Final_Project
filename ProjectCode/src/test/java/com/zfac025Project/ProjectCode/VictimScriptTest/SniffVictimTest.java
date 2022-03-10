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
 * Unit test for simulating a victims actions on a network.
 * The victim actions 
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SniffVictimTest {

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
    assertTrue(victim.createVictim("sniff"));
  }
  
  @Test
  @Order(2)
  public void financialTimesTest() {
    assertTrue(operations.getWebsite("https://www.ft.com"));
    assertTrue(operations.pageLoaded("//*[@id=\"site-navigation\"]/div[2]/div/div/div[2]"));
  }

  @Test
  @Order(3)
  public void skyNewsTest() {
    assertTrue(operations.getWebsite("https://news.sky.com"));
    assertTrue(operations.pageLoaded("/html/body/div[1]"));
    
  }
  @Test
  @Order(4)
  public void guardianTest() {
    assertTrue(operations.getWebsite("https://theguardian.com"));
    assertTrue(operations.pageLoaded("/html/body/div[1]/header/nav"));
  }
  
  @Test
  @Order(5)
  public void bbcNewsWebsite() {
    assertTrue(operations.getWebsite("https://www.bbc.co.uk"));
    assertTrue(operations.pageLoaded("/html/body"));
  }

}
