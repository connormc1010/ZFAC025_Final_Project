package com.zfac025Project.ProjectCode.Victims;

import com.zfac025Project.ProjectCode.Victims.VictimScripts.DosVictim;
import com.zfac025Project.ProjectCode.Victims.VictimScripts.MitmVictim;
import com.zfac025Project.ProjectCode.Victims.VictimScripts.SsHBruteForceVictim;
import com.zfac025Project.ProjectCode.Victims.VictimScripts.XssVictim;

/**
 * Class that creates an the specified victim script.
 * @author connormcnulty
 *
 */
public class VictimFactory {

  SsHBruteForceVictim ssh;
  MitmVictim mitm;
  DosVictim dos;
  XssVictim xss;

  /**
   * Method to create a victim script depending on the attacker profile.
   * @param victim String description of the attacker profile
   * @return
   */
  public boolean createVictim(String victim) {
    if (victim.equals("SSHBruteFoce")) {
      ssh = new SsHBruteForceVictim();
      if (ssh.verifyVictim()) {
        return true;
      }
    } else if (victim.equals("ManInTheMiddle")) {
      mitm = new MitmVictim();
      if (mitm.verifyVictim()) {
        return true;
      }
    } else if (victim.equals("DenailOfService")) {
      dos = new DosVictim();
      if (dos.verifyVictim()) {
        return true;
      }
    } else if (victim.equals("CrossSiteScripting")) {
      xss = new XssVictim();
      if (xss.verifyVictim()) {
        return true;
      }
    }
    return true;
  }

}
