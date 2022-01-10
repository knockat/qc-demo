cls
@echo on

SETLOCAL
@rem Set user-defined variables.

set DIRNAME=%~dp0
@rem .\jakarta-tomcat-5.5.20\bin    D:\server\apache-maven-3.5.0
@rem  set JAVA_HOME=C:/Program Files (x86)/Java/jdk1.8.0_111
set MVN_HOME=C:/work_dev/java/maven/apache-maven-3.6.3-bin/apache-maven-3.6.3

set "basePath=%cd%"
echo  %basePath%
echo "mvn install ........"


call %MVN_HOME%/bin/mvn clean:clean
call %MVN_HOME%/bin/mvn install  -Dmaven.test.skip=true -U 

REM call  %MVN_HOME%/bin/mvn install:install-file -Dfile=../dependency/jar/log4j-over-slf4j-1.7.7.jar      -DgroupId=org.slf4j -DartifactId=log4j-over-slf4j -Dversion=1.7.7 -Dpackaging=jar 
pause





 