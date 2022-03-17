@echo off
title This is batch script to run the Sniffing Victim script
echo Running Sniffing victim script
CALL mvn compile
CALL mvn -Dtest=SniffingVictimTest test
pause