# scala-sonar-demo
This project is created to demonstrate the sonarqube integration with Scala and Gradle using Scoverage

1. Run sonarQube either locally or run via docker image (https://hub.docker.com/_/sonarqube)
2. build.gradle file has "sonarqube" task, update the url, username, password accordingly
3. gradle clean build reportScoverage sonarqube
