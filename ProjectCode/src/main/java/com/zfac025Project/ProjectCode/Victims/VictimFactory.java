package com.zfac025Project.ProjectCode.Victims;

import com.zfac025Project.ProjectCode.Victims.VictimScripts.DosVictim;
import com.zfac025Project.ProjectCode.Victims.VictimScripts.MITMVictim;
import com.zfac025Project.ProjectCode.Victims.VictimScripts.SniffVictim;
import com.zfac025Project.ProjectCode.Victims.VictimScripts.SshVictim;

/**
 * Class that creates an the specified victim script.
 * @author connormcnulty
 *
 */
public class VictimFactory {

  SniffVictim sniff;
  SshVictim ssh;
  DosVictim dos;
  MITMVictim mitm;
 
  
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
    } else if (victim.equals("DDoS")) {
        dos = new DosVictim();
        if (dos.verifyVictim()) {
          return true;
        }
        return false;
    } else if (victim.equals("SSHB")) {
          ssh = new SshVictim();
          if (ssh.verifyVictim()) {
            return true;
          }
          return false;
    } else if (victim.equals("MITM")) {
        mitm = new MITMVictim();
        if (mitm.verifyVictim()) {
          return true;
        }
        return false;
    } else if (victim.equals("ENTER YOUR NEW VICTIM PROFILE")) {
      return true;
    }
    return false;
 
  }

}
