package com.zfac025Project.ProjectCode.Victims;

import com.zfac025Project.ProjectCode.GoogleChrome;

public class Victim extends GoogleChrome {

  protected String attack;
  protected String profile;

  public boolean verifyVictim() {
	  if (GoogleChrome.setUpDriver()){
<<<<<<< HEAD
			System.out.println("Successfully started: "+ attack+" attack");
=======
			System.out.println("Successfully started: "+ attack+" attack \n");
>>>>>>> restructureFiles
			System.out.println("This attack type is: "+ profile);
			return true;
		} 
		System.out.print("Failed to start: "+ attack+" attack");
		return false;
  }

}
