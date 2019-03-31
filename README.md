# Description

This project contains the answer to the following question.

Write a web app with using Spring Boot,there will be User registration with fields
"name" , "surname" and "address" and you will display these informantions in a
grid. Also we could do UPDATE,DELETE,CREATE,READ operations in grid.

# Which Technologies We Will Use?

Crud operations were performed using Spring Boot, H2 (Memory Based) Database and JSP.

Spring Boot was developed to be the fastest and easiest way to develop Spring based applications
a framework. Thanks to Spring Boot, we can get rid of boilerplate code
We can write the code. The Spring Boot web server comes with embedded Tomcat and many other additional features.
By running the Application class in the project, it is getting up to speed. Embedded Tomcat
there is no need to create additional servers for the server.

H2 Database is an "Open Source" SQL database written in Java. Therefore it is a memory-based database, it disappears when the application is finished.

# Maven Project

After cloning the project you can import it to your IDE then run the "mvn clean install" command. By running the Application class in the project, it is getting up to run.

* OR

you can go to project directory, then run the following command;

      mvn clean install 

      java -jar target/myapp-1.0-SNAPSHOT.jar

`myapp will be the name of your project.

If everything works correctly, you can start the CRUD operations with following URL.

      http://localhost:8080/index 


If the project does not start with Application.class, please try the following command at Terminal.
```
mvn spring-boot:run
```