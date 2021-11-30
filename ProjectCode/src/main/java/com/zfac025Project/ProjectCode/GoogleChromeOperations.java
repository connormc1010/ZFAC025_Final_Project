package com.zfac025Project.ProjectCode;

public class GoogleChromeOperations extends GoogleChrome{


	public boolean getWebsite(String url) {
		driver.get(url);
		return true;
	}

}
