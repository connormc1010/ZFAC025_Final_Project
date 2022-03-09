package com.zfac025Project.ProjectCode.Attackers;

import com.zfac025Project.ProjectCode.Attackers.AttackerScripts.MitmAttacker;
import com.zfac025Project.ProjectCode.Attackers.AttackerScripts.PhishingAttacker;
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes


public class AttackerFactory {
	
	MitmAttacker mitm;
	PhishingAttacker phishing;
	
	/**
   * Method to create a attacker script
   * @param attack String description of the attacker profile
   * @return
   */
  public boolean createAttacker(String attack) {
    if (attack.equals("ManInTheMiddle")) {
      mitm = new MitmAttacker();
      if (mitm.verifyAttack()) {
        return true;
      }
<<<<<<< Updated upstream
    } else if (attack.equals("CrossSiteScripting")) {
      phishing = new PhishingAttacker();
      if (phishing.verifyAttack()) {
=======
      return false;
    } if (attack.equals("Phishing")) {
        phishing = new PhishingAttacker();
        if (phishing.verifyAttack()) {
          return true;
        }
        return false;
    }else if (attack.equals("ENTER YOUR NEW PROFILE")) {
>>>>>>> Stashed changes
        return true;
      }
    }
    return true;
  }

	
	
	

}
