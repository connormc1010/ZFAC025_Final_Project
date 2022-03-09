package com.zfac025Project.ProjectCode.Attackers;

import com.zfac025Project.ProjectCode.GoogleChrome;

public class Attacker extends GoogleChrome{
	protected String attack;
	protected String profile;

	public boolean verifyAttack() {
		if (setUpDriver()){
			System.out.print("Successfully started: "+ attack+" attack");
			System.out.println("This attack type is: "+ profile);
			return true;
		} 
		System.out.print("Failed to start: "+ attack+" attack");
		return false;
	  }
}
