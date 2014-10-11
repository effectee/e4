##E4平台说明##

E4平台分成：pf(平台框架),pt(平台技术层),(ps)平台服务层三层。

##E4平台各工程创建脚本##
###e4平台总工程###
mvn archetype:create -DgroupId=com.git.e4 -DartifactId=e4
修改e4\pom.xml文件：
<packaging>jar</packaging>
--->
<packaging>pom</packaging>

###pf根工程###
mvn archetype:create -DgroupId=com.git.e4 -DartifactId=pf
pf-core项目
mvn archetype:create -DgroupId=com.git.e4 -DartifactId=pf-core

pf-util项目
mvn archetype:create -DgroupId=com.git.e4 -DartifactId=pf-util

###pt根工程###
mvn archetype:create -DgroupId=com.git.e4 -DartifactId=pt

pt-da项目
mvn archetype:create -DgroupId=com.git.e4 -DartifactId=pt-da

pt-web项目
mvn archetype:create -DgroupId=com.git.e4 -DartifactId=pt-web

###ps根工程###
mvn archetype:create -DgroupId=com.git.e4 -DartifactId=ps

ps-sv项目
mvn archetype:create -DgroupId=com.git.e4 -DartifactId=ps-sv

ps-msg项目
mvn archetype:create -DgroupId=com.git.e4 -DartifactId=ps-msg








fw项目
1. fw根项目
mvn archetype:create -DgroupId=com.git.effectee -DartifactId=e4-fw
修改e4-fw\pom.xml文件：
<packaging>jar</packaging>
--->
<packaging>pom</packaging>

2. fw-core项目
mvn archetype:create -DgroupId=com.git.effectee -DartifactId=fw-core


3. fw-da项目
mvn archetype:create -DgroupId=com.git.effectee -DartifactId=fw-da

4. fw-web项目
mvn archetype:create -DgroupId=com.git.effectee -DartifactId=fw-web


ip项目
ps
mvn archetype:create -DgroupId=com.git.effectee -DartifactId=ip-ps

ps-rest
mvn archetype:create -DgroupId=com.git.effectee -DartifactId=ip-ps-rest

gv
mvn archetype:create -DgroupId=com.git.effectee -DartifactId=ip-gv

gv-rest
mvn archetype:create -DgroupId=com.git.effectee -DartifactId=ip-gv-rest




appconsole项目






demo项目
