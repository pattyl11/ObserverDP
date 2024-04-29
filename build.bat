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