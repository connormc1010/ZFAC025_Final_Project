package com.zfac025Project.ProjectCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Abstract class which creates ChromeDriver instance.
 * 
 * @author connormcnulty
 *
 */
public abstract class GoogleChrome {

  public static WebDriver driver;

  /**
  * Creates ChromeDriver instance. 
  * Opens Google Chrome and maximises the window
  * @return True if driver was created successfully
  */
  public static Boolean setUpDriver() {
    System.setProperty("webdriver.chrome.driver", "/Users/connormcnulty/Downloads/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    return true;
  }

  /**
  * Closes the instance of Google Chrome.
  * @return true if chrome quit successfully
  */
  public boolean quitDriver() {
    driver.close();
    return true;
  }

}
