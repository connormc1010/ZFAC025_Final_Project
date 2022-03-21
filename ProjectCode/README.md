# ZFAC025_Final_Project
ZFAC025 Repository of code and documentation concerning the final year project.
Directory Structure:
A diagram of the ProjectCode folder structure can be found in ZFAC025_Final.pdf.
For information on how to run the program please see ZFAC025.Final.pdf

ProjectCode
- src 
    - main
	- java>com>zfac025Project>ProjectCode
	    - GoogleChrome.java (abstract class which launches/quits chromedriver.exe)
	    - GoogleChromeOperations.java (operations that control the chromedriver operations)
	    - Victims
		- Victim.java (class which holds operations of all child scripts)
		- VictimFactory.java (class which creates specific victim script)
		- VictimScripts
		    - DosVicim.java (child of Victim.class which defines the type of victim script)
		    - MITMVictim.java (child of Victim.class which defines the type of victim script)
		    - SsVictim.java (child of Victim.class which defines the type of victim script)
		    - SniffVictim.java (child of Victim.class which defines the type of victim script)
    - test
        - java>com>zfac025Project>ProjectCode
	    - VictimScriptTest
		- DDoSVictimTest.java (Junit Test Case which creates and tests DDoS victim script)
		- MITMVictimTest.java (Junit Test Case which creates and tests MITM victim script)
		- SniffVictimTest.java (Junit Test Case which creates and tests Sniffing victim script)
		- SSHBruteFoceVictimTest.java (JUnit Test Case which creates and tests SSH Brute Force victim script)
- target (contains maven classes which help run the plugins)
- DDoSvictimExecutable.bat (batch file to run DDoS victim script)
- MITMVictimExecutable.bat (batch file to run MITM victim script)
- README.md (this file)
- SSHVictimExecutable.bat (batch file to run SSH Brute Force script)
- SniffingVictimExecutable.bat (batch file to run sniffing victim script)
- VictimScriptUML.draw.io (UML diagram of Victim script code creation)
- pom.xml (dependencies and plugins to run the automated scripts. DO NOT CHANGE)
