FROM tomcat:8.5-jdk17

RUN rm -rf /usr/local/tomcat/webapps/*

COPY quiz.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

CMD ["catalina.sh", "run"]
