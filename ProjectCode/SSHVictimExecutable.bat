@echo off
title This is batch script to run the SSH Brute Force Victim script
echo Running SSH Brute Force victim script
CALL mvn -Dtest=SSHBruteForceVictimTest test
pause