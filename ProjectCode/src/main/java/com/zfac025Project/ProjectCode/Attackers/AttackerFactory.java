package com.zfac025Project.ProjectCode.Attackers;

import com.zfac025Project.ProjectCode.Attackers.AttackerScripts.MitmAttacker;
import com.zfac025Project.ProjectCode.Attackers.AttackerScripts.XssAttacker;


public class AttackerFactory {
	
	MitmAttacker mitm;
	XssAttacker xss;
	
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
    } else if (attack.equals("CrossSiteScripting")) {
      xss = new XssAttacker();
      if (xss.verifyAttack()) {
        return true;
      }
    }
    return true;
  }

	
	
	

}
