# IETI-Spring-Boot-Rest-Part-1

## Spring Boot Rest API

**Learning Objectives**

- Explain what needs to be donde to achieve the Level 2 on a  RESTFUL API on the Richardson Maturity Model.
- Implement a Level 2 Users RESTFUL API Microservice.
-  User dependencies injections to create a decoupled architecture.


## Growth Mindset 🤹🏽

"Individuals who believe their talents can be developed (through hard work, good strategies, and input from others) have a growth mindset. They tend to achieve more than those with a more fixed mindset (those who believe their talents are innate gifts)" [What Having a "Growth Mindset" Actually means - Harvard Business Review](https://hbr.org/2016/01/what-having-a-growth-mindset-actually-means)  


**Main Topics**
 * Microservices.
 * RESTFUL API.
 * Richardson Maturity Model.
 * Dependencies Injection.

## Codelab 🧪

🗣️ "I hear and I forget I see and I remember I do and I understand." Confucius

### Part 1: Implementing the Users Microservice RESTFUL API

1. Create a new project using the [Spring Initializr](https://start.spring.io/)
  * Use either *Java* as programming language.
  * Use Gradle as project option(if your computer is slow then use  Maven)
  * Add Spring Web dependency before generating the project.
2. Create a new repository on Github and commit the files generated in 1.
3. Create a new package called *dto* and inside define your *UserDto* object with at least the following fields:
    * name.
    * email.
    * lastName.
    * createdAt.
4. Create a new package called *data* and inside define your *User* data object with at least the following fields:
    * id.
    * name.
    * email.
    * lastName.
    * createdAt.
5. Create a new package called *service* an inside create the following interface:

**Java:**
 ```java
     public interface UserService
     {
         User create( User user );

         User findById( String id );
         
         List<User> all();

         void deleteById( String id );

         User update( User user, String userId );
     }
  ```
6. Create an implementation of the UserService using a HashMap data structure inside.
7. Make your service implementation *UserServiceHashMap* injectable using the *@Service* annotation.
8. Create a new package called *controller* and create a new class *UserController* inside.
9. Annotate your *UserController* so it becomes a REST Controller:

**Java:**
 ```java
   @RestController
   @RequestMapping( "/v1/user" )
   public class UserController
   {
   }
  ```
10. Inject your *UserService* implementation inside the *UserController* via the constructor:

**Java:**
 ```java
   @RestController
   @RequestMapping( "/v1/user" )
   public class UserController
   {
       private final UserService userService;

       public UserController(@Autowired UserService userService )
       {
           this.userService = userService;
       }   
   }
  ```
  
11. Implement all the endpoints needed to interact with you *UserService*. Use the following method signatures to help you achieve the Level 2 RESTFUL Maturity:

**Java:**
 ```java
   @RestController
   @RequestMapping( "/v1/user" )
   public class UserController
   {
      private final UserService userService;

      public UserController( UserService userService )
      {
          this.userService = userService;
      }

   
      @GetMapping
      public ResponseEntity<List<User>> all()
      {
          //TODO implement this method using UserService
          return null;
      }
      
      @GetMapping( "/{id}" )
      public ResponseEntity<User> findById( @PathVariable String id )
      {
         //TODO implement this method using UserService
         return null;
      }
      
      
      @PostMapping
      public ResponseEntity<User> create( @RequestBody UserDto userDto )
      {
           //TODO implement this method using UserService
          return null;
      }
      
      @PutMapping( "/{id}" )
      public ResponseEntity<User> update( @RequestBody UserDto userDto, @PathVariable String id )
      {
           //TODO implement this method using UserService
          return null;
      }

      @DeleteMapping( "/{id}" )
      public ResponseEntity<Boolean> delete( @PathVariable String id )
      {
           //TODO implement this method using UserService
          return null;      
      }
   }      
  ```
12. Download and install [Postman](https://www.postman.com/) and test ALL the endpoints of your API.

## Construido con 🛠️

* Java 13
* JUnit
* [Maven](https://maven.apache.org/) - Manejador de dependencias


## Autor ✒️

* Paula Andrea Guevara Sánchez

## Licencia 📄

Este proyecto está bajo la Licencia GNU General Public License - [LICENSE](https://github.com/PaulaSanchez810/AREP-2021-1-Lab1-Calculadora/blob/main/LICENSE.txt) 
