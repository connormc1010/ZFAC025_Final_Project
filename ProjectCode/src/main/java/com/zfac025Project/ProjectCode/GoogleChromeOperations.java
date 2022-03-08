package com.zfac025Project.ProjectCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * This includes the basic functionality that a user might complete. 
 * Powered by Selenium functions tool
 * Operations written once and invoked multiple times by other classes
 * @author connormcnulty
 *
 */
public class GoogleChromeOperations extends GoogleChrome {

  public boolean getWebsite(String url) {
    driver.get(url);
    return true;
  }

  public boolean clickElement(String xpath) {
    driver.findElements(By.xpath(xpath)).get(0).click();
    return true;
  }
  
  
  public boolean pageLoaded(String itemID) {
	  
	  try {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement item = driver.findElement(By.id(itemID));
		wait.until(ExpectedConditions.visibilityOf(item));
		Thread.sleep(5000);
		return true;
	  } catch (Exception e) {
		e.printStackTrace();
		return false;
	}
  }

}
