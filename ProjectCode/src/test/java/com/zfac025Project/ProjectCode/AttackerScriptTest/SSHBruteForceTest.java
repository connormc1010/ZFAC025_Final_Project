package com.zfac025Project.ProjectCode.AttackerScriptTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.zfac025Project.ProjectCode.AttackerScripts.SSHBruteForce;

class SSHBruteForceTest {
	
	SSHBruteForce ssh;

	@Test
	void scanTest() {
		assertNotNull(ssh.scan());
	}
	
	@Test
	void bruteForceTEst() {
		assertTrue(ssh.bruteForce());
	}
	
	@Test
	void dieOffTest() {
		assertTrue(ssh.dieOff());
	}

}
