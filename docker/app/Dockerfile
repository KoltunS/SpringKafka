FROM tomcat:jre11-slim

MAINTAINER skoltun

RUN apt-get update && apt-get -y upgrade

#Remove defualt ROOT.war and replace it with app
RUN rm -rf /usr/local/tomcat/webapps/*
COPY App.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh", "run"]

EXPOSE 8080