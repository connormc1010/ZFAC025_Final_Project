package com.zfac025Project.ProjectCode.Victims;

import com.zfac025Project.ProjectCode.Victims.VictimScripts.DosVictim;
import com.zfac025Project.ProjectCode.Victims.VictimScripts.SniffVictim;

/**
 * Class that creates an the specified victim script.
 * @author connormcnulty
 *
 */
public class VictimFactory {

  
  DosVictim dos;
  SniffVictim sniff;
  /**
   * Method to create a victim script depending on the attacker profile.
   * @param victim String description of the attacker profile
   * @return
   */
  public boolean createVictim(String victim) {
    if (victim.equals("sniff")) {
      sniff = new SniffVictim();
      if (sniff.verifyVictim()) {
        return true;
      }
      return false;
    } if (victim.equals("DDoS")) {
        dos = new DosVictim();
        if (dos.verifyVictim()) {
          return true;
        }
        return false;
      }else if (victim.equals("ENTER YOUR NEW VICTIM PROFILE")) {
      return true;
    }
    return false;
 
  }

}
