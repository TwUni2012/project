mvn clean package

copy target\%1.jar %CATALINA_HOME%\apps\%1.jar

rem %CATALINA_HOME%\bin\shutdown.bat

rem %CATALINA_HOME%\bin\startup.bat