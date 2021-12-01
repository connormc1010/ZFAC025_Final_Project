package com.zfac025Project.ProjectCode.Victims;

import com.zfac025Project.ProjectCode.Victims.VictimScripts.DOSVictim;
import com.zfac025Project.ProjectCode.Victims.VictimScripts.MITMVictim;
import com.zfac025Project.ProjectCode.Victims.VictimScripts.SSHBruteForceVictim;
import com.zfac025Project.ProjectCode.Victims.VictimScripts.XSSVictim;

/**
 * Class that creates an the specified victim script
 * @author connormcnulty
 *
 */
public class VictimFactory {

	SSHBruteForceVictim ssh;
	MITMVictim mitm;
	DOSVictim dos;
	XSSVictim xss;
	
	public boolean createVictim(String victim) {
		if (victim.equals("SSHBruteFoce")) {
			ssh = new SSHBruteForceVictim();
			if (ssh.verifyVictim()) {
				return true;
			}
		} else if (victim.equals("ManInTheMiddle")) {
			mitm = new MITMVictim();
			if(mitm.verifyVictim()) {
				return true;
			}
		} else if (victim.equals("DenailOfService")) {
			dos = new DOSVictim();
			if(dos.verifyVictim()) {
				return true;
			}
		}else if (victim.equals("CrossSiteScripting")) {
			xss = new XSSVictim();
			if(xss.verifyVictim()) {
				return true;
			}
		}
		
		return true;
	}

}
