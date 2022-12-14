# 🎥 Cinema application

## - Brief
> A web application that designs the user's interaction with the theater system to purchase tickets for available movies. 
The application also implements the ability to recognize the user's role and share the range of possibilities. 
It is written with the help of Spring and Hibernate frameworks.
 
## - Features
 - ### Registration, authentication and authorization
> ###### It is possible to register a new user, log in to an existing account, and operate the service from that account depending on the role given.
 - ### Scrolling through the information
> ###### The user has the ability to view the available movies, as well as orders. The administrator can also view detailed information about cinema halls and the user database. 
 - ### Information handling
> ###### The user has an opportunity to buy tickets (selectively add it to a shopping cart with further purchase). The administrator is given the opportunity to change the hall information, availability of movies and its sessions.

## - Project structure
### The project is based on `three-tier architecture` which makes it more comfortable to use in practice.
- ### Controller 
>###### Level of software operation, interaction with the service layer, intuitive for the user.
- ### Service
> ###### Layer that organises the business logic of the programme, operating on commands from the top layer.
- ### DAO
> ###### Full interaction with the database and logical layer..

## - Technologies
- ### Java, Maven
- ### Spring Web, Spring Security
- ### Tomcat (9.0.50 version)
- ### Hibernate
- ### MySQL

## - Project launch
1. ### Copy project link
2. ### Create new Intellij IDEA project from Version Control System
3. ### Edit db.properties file to establish connection to your own DataBase
4. ### Add your own `Tomcat server` to the project configuration
5. ### Run project