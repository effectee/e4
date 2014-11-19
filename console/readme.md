##Console说明##

Console是平台的控制台，对平台提供的功能和服务进行维护。

##Console各工程创建脚本##
###Console总工程###
mvn archetype:create -DgroupId=com.git.e4 -DartifactId=console
修改pom.xml文件：
<packaging>jar</packaging>
--->
<packaging>pom</packaging>

###console-core工程###
mvn archetype:create -DgroupId=com.git.e4 -DartifactId=console-core


###Console-web总工程###
mvn archetype:create -DgroupId=com.git.e4 -DartifactId=console-web -DarchetypeArtifactId=maven-archetype-webapp
