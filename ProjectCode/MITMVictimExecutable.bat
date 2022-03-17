@echo off
title This is batch script to run the MITM Victim script
echo Running MITM victim script
CALL mvn compile
CALL mvn -Dtest=MITMVictimTest test
pause