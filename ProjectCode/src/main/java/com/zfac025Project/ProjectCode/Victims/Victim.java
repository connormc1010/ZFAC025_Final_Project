package com.zfac025Project.ProjectCode.Victims;

import com.zfac025Project.ProjectCode.GoogleChrome;

public class Victim extends GoogleChrome {

  protected String attack;
  protected String profile;

  public boolean verifyVictim() {
	  if (GoogleChrome.setUpDriver()){
			System.out.println("Successfully started: "+ attack+" attack \n");
			System.out.println("This attack type is: "+ profile);
			return true;
		} 
		System.out.print("Failed to start: "+ attack+" attack");
		return false;
  }

}
