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

## How to run
### Backend
From the root directory of this project, set up and start the backend with:
* `cd backend`
* `mvn spring-boot:run [-Drun.arguments="--domainId=0"]` starts the backend rest webserver on http://localhost:8080

### Frontend
From the root directory of this project, set up and start the frontend with:
* `cd frontend`
* `npm install` (if `package.json` changed)
* `bower install` to install all dependencies
* `gulp serve` starts the app on [http://localhost:9000/](http://localhost:9000/)
