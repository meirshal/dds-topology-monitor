# dds-topology-monitor

## Prerequisite
* [Download, install and start Neo4j Server](http://neo4j.com/download).
* RTI DDS 5.2.3
* Maven 3 or higher
* JDK 8 or higher
* nodejs
* npm
* bower `npm install -g bower`
* gulp `npm install -g gulp`

## The Stack
* Application Type: Spring-Boot Java Web Application (Jetty).
* Web framework: Spring-Boot enabled Spring-Data-JDBC.
* Database: Neo4j-Server.
* Frontend: project generated by Yeoman's [generator-webapp](https://github.com/yeoman/generator-webapp/blob/master/docs/README.md), using: [bower](https://bower.io/), [gulp](http://gulpjs.com/), [d3.js](https://d3js.org/), [jquery](https://jquery.com/).

## How to Run
### Backend
From the root directory of this project, set up and start the backend with:
* add the nddsjava.jar to your local repository using `mvn install:install-file`
* `cd backend`
* `mvn spring-boot:run [-Drun.arguments="--domainId=0"]` starts the backend rest webserver on http://localhost:8080

### Frontend
From the root directory of this project, set up and start the frontend with:
* `cd frontend`
* `npm install` (if `package.json` changed)
* `bower install` to install all dependencies
* `gulp serve` starts the app on [http://localhost:9000/](http://localhost:9000/)
