package com.zfac025Project.ProjectCode.Victims;

import com.zfac025Project.ProjectCode.Victims.VictimScripts.SSHBruteForceVictim;

public class VictimFactory {

	SSHBruteForceVictim ssh;
	
	public boolean verifyStarted(String victim) {
		if (victim.equals("SSHBruteFoce"))
			ssh = new SSHBruteForceVictim();
			if (ssh.verifyVictim()) {
				return true;
			}
		return true;
	}

}
