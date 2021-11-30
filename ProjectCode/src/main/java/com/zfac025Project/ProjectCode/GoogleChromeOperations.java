package com.zfac025Project.ProjectCode;

import org.openqa.selenium.By;

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
