package com.zfac025Project.ProjectCode.VictimScriptTest;

import static org.junit.Assert.assertTrue;

import com.zfac025Project.ProjectCode.GoogleChrome;
import com.zfac025Project.ProjectCode.GoogleChromeOperations;
import com.zfac025Project.ProjectCode.Victims.VictimFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * Unit test for simulating a victims actions on a network.
 * The victim actions 
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ddosVictimTest {

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
    assertTrue(GoogleChrome.setUpDriver());
  }

  /**
  * Quits the ChromeDriver which closes the Google Chrome window.
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
    assertTrue(operations.pageLoaded("header-content"));
  }

  @Test
  @Order(3)
  public void outlook() {
    assertTrue(operations.getWebsite("https://outlook.office.com"));
    assertTrue(operations.pageLoaded("i0281"));
   
  }

  @Test
  @Order(4)
  public void apple() {
    assertTrue(operations.getWebsite("https://www.apple.com"));
    assertTrue(operations.pageLoaded("ac-globalnav"));
  }
  
  @Test
  @Order(5)
  public void cnn() {
	  assertTrue(operations.getWebsite("https://edition.cnn.com"));
	  assertTrue(operations.pageLoaded("nav__plain-header"));
  }
  
  @Test
  @Order(6)
  public void youTube() {
	  assertTrue(operations.getWebsite("https://www.youtube.com"));
	  assertTrue(operations.pageLoaded("guide-service"));
  }
  
  @Test
  @Order(7)
  public void facebook() {
    assertTrue(operations.getWebsite("https://en-gb.facebook.com/"));
    assertTrue(operations.pageLoaded("content"));
  }
  
  @Test
  @Order(8)
  public void wikipedia() {
	  assertTrue(operations.getWebsite("https://en.wikipedia.org/wiki/Main_Page"));
	  assertTrue(operations.pageLoaded("mw-page-base"));
  }
}
