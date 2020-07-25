ECHO OFF
cls

SET /P Project= Lutfen Proje Adini Giriniz :
cls

ECHO ****** Java Compiler ******
ECHO.

javac %Project%.java

java %Project%

ECHO.
ECHO Powered By MKZ

del %Project%.class
pause

