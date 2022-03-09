package com.zfac025Project.ProjectCode.Victims;

import com.zfac025Project.ProjectCode.Victims.VictimScripts.DosVictim;

/**
 * Class that creates an the specified victim script.
 * @author connormcnulty
 *
 */
public class VictimFactory {

  DosVictim dos;

  /**
   * Method to create a victim script depending on the attacker profile.
   * @param victim String description of the attacker profile
   * @return
   */
  public boolean createVictim(String victim) {
    if (victim.equals("DDoS")) {
      dos = new DosVictim();
      if (dos.verifyVictim()) {
        return true;
      }
      return false;
    } else if (victim.equals("ENTER YOUR NEW VICTIM PROFILE")) {
      return true;
    }
    return false;
 
  }

}
