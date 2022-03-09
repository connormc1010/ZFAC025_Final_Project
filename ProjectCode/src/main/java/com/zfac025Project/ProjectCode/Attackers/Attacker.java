package com.zfac025Project.ProjectCode.Attackers;

import com.zfac025Project.ProjectCode.GoogleChrome;

public class Attacker extends GoogleChrome{

	public boolean verifyAttack() {
<<<<<<< Updated upstream
	    // TODO Auto-generated method stub
	    return true;
=======
		if (setUpDriver()){
			System.out.print("Successfully started: "+ attack+" attack");
			System.out.println("This attack type is: "+ profile);
			return true;
		} 
		System.out.print("Failed to start: "+ attack+" attack");
		return false;
>>>>>>> Stashed changes
	  }
}
