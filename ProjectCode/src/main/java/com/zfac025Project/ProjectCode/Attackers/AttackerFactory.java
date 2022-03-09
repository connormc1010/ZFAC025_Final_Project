package com.zfac025Project.ProjectCode.Attackers;

import com.zfac025Project.ProjectCode.Attackers.AttackerScripts.MitmAttacker;
<<<<<<< Updated upstream
import com.zfac025Project.ProjectCode.Attackers.AttackerScripts.XssAttacker;
=======
>>>>>>> Stashed changes


public class AttackerFactory {
	
	MitmAttacker mitm;
<<<<<<< Updated upstream
	XssAttacker xss;
=======
>>>>>>> Stashed changes
	
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
      xss = new XssAttacker();
      if (xss.verifyAttack()) {
=======
      return false;
    } else if (attack.equals("ENTER YOUR NEW PROFILE")) {
>>>>>>> Stashed changes
        return true;
      }
    return false;
  }

	
	
	

}
