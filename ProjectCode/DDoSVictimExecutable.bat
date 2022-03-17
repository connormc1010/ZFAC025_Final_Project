@echo off
title This is batch script to run the DDoS Victim script
echo Running DDoS victim script
CALL mvn compile
CALL mvn -Dtest=DDoSVictimTest test
pause