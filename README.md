# ObserverDP
Observer Design Pattern from https://www.newthinktank.com/2012/08/observer-design-pattern-tutorial/

I used a very basic Windows .bat file to build the code:

@echo off
echo Compiling Java files...

javac -cp *.java
if errorlevel 1 goto buildFailed

echo Running application...

java -cp . GrabStocks
goto end

:buildFailed
echo Build failed!

:end
