package com.zfac025Project.ProjectCode;

import org.openqa.selenium.By;

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

}
