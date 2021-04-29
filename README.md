# SpringCRUD
Creating a RESTful API with Spring boot, MySQL, JPA, Hibernate and implementing the basic crud operations.  
The project demonstrates how to create REST API with spring boot. The purpose is to understand the core concepts. The application allows to create, update, reterive and delete different products. 
# Application Features
Each product has four properties id ,name, quantity, price. You can search products based on id and name. 
Delete product   
Update product  
List or display products individually and as a list  
# Steps to create a spring boot application
Made use of the eclipse IDE. Install the spring tool suite(sts) plugin in eclipse. You can also use the spring intiliser to create a spring boot app and download the zip file into your local machine. https://start.spring.io/  
Select maven project and language as java, version 11.
# Dependencies
Spring web: for rest services  
Mysql driver for database connectivity  
Spring data Jpa for data persistence.  
# Source Files
You can find the source files inside the src folder under the java folder  
We have four important folders  
Entity folder: holds all the entitites needed for our project. These classes specify the tables that need to be created. We annotate the class as @Entity and @Table. @Entity is a JPA annotation to make this object ready for storage in a JPA-based data store. id is marked with @ID and @GeneratedValue to specify the primary key and to autogenerate the id.  
Repository folder: Here we define the Spring Data JPA repository interfaces. The spring data JPA are interfaces with methods supporting creating, reading, updating, and deleting records against a back end data store. MySQL is the backend in this project.  
Controller folder: holds the controller class. We use the controller to specify what action needs to be taken when a specific request is made using the REST API. We annotate the class with @Controller this indicates that the data returned by each method will be written straight into the response body instead of rendering a template. HTTP methods get, post,update and delete are used.  
Service folder: holds the service class. Here methods are defined for diffeent request. Based on the HTTP requests we call different methods to perform create,delete,update and reterive operations.  
# Configuring the Database
We specify the database configuration details in application.properties file.  

![image](https://user-images.githubusercontent.com/47956342/116579663-f3a62b80-a955-11eb-807a-b1a7be2f209b.png)  

Also make sure to create a schema for the application in MySQL.  
# Running Application
Run the SpringCurdApplication.java file. Here the class is annotated with @SpringBootApplication. This will fire up a servlet container and serve up our service.  
To test the application use postman to send requests to the spring boot application.  
Or if using spring initialiser then run the following in the project root directory in terminal  
$ ./mvnw clean spring-boot:run  
$ mvn clean spring-boot:run  
Once this is done your application should be up and running on the port specified in the application properties file.  


![image](https://user-images.githubusercontent.com/47956342/116580732-ffdeb880-a956-11eb-934e-451fe8e966ef.png)  

The image shows how we can make an request to the application once it is running on a server.   
You can then check if the request was processed in the backend.  

![image](https://user-images.githubusercontent.com/47956342/116581164-6532a980-a957-11eb-893e-fbcb19334b84.png)




  

