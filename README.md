## Spring Notes

![GitHub](https://img.shields.io/github/license/aashishksahu/Spring-Works)
![GitHub last commit](https://img.shields.io/github/last-commit/aashishksahu/Spring-Works)
![GitHub top language](https://img.shields.io/github/languages/top/aashishksahu/Spring-Works)
### Table of Contents

- [Spring Notes](#spring-notes)
    + [Basic Definitions](#basic-definitions)
    + [Build Tool](#build-tool)
    + [Commonly Used Annotations](#commonly-used-annotations)
    + [Examples](#examples)

### Basic Definitions
* **Application context** is a container that is used by spring to store all the beans.
* **Beans** are just java classes that have an instance in the Spring application context.
* **Dependency Injection** is the technique of achieving loose coupling of modules or classes. According to this, a programmer doesn't need to hard code a class instantiation
if another class depends on it, instead, use constructor or setter injection to pass a dependency as an abstract type (interface or abstract class) while the implementation of 
the abstract type can be multiple. eg:- If Car is a dependency that needs to be injected,
then, instead of defining an implementation of Car such as Audi or Maserati inside the class that needs it as a dependency, we can pass a Car abstract type parameter to the constructor or setter and pass the implementation as we desire. This way if there's a new type of car added in the future (such as Porsche) then refactoring the code would be much easier since we only need to change the @Qualifier name. 
* **Inversion of Control** means reversing the flow of control of the application. Instead of the programmer controlling everything from business logic to runtime environment, the application controls how the runtime works while the programmer works on the important parts and add those parts to the existing application. In simple words, 

> Don't build an application just to run your business logic, build the business logic and let the application run it for you

* **JPA** - Java Persistence API is a Java EE specification which is implemented by Hibernate.It provides an abstraction over the JDBC API and hides the inner workings of JDBC such as Connection establishment, PreparedStatement calls, ResultSet creation etc. It implements Object-Relational Mapping (ORM) which in basic terms means mapping records from a relation to a POJO. **Spring Data JPA** is an JPA data access abstraction that provides the means to define custom methods inside the Repository interface which can be parsed and used accordingly. Eg:- `public Iterable<Dummy> findAllByName(String name);` is a method and `findAllByName` will be parsed by JPA to create a SQL query that'll search the relation by name.

### Build Tool
* A **build tool** or build automation tool is a software that automates the process of compiling and running an application. A build tool can be used for building, testing, generating documentation and managing dependencies for the project. 

* **Gradle** is a java build tool that runs on Groovy scripting language which is a JVM based scripting language. Gradle is less verbose than Maven, does not depend on XML, can run Groovy tasks and is highly configurable.

* **Maven** is another build tool that uses a POM.xml to manage all the dependencies and project metadata. It is older and more mature build automation tool than gradle and has better community support and IDE integration.

### Commonly Used Annotations
#### Core
* `@Component` - used to define a java class as a basic spring bean
* `@Service` - used to define a java class as a stand-alone business spring bean with the business logic or algorithm
* `@Repository` - used to define a java class as spring bean that performs persistence and CRUD operations on objects
* `@Autowired` - Whatever goes below this annotation (Constructor or Setter preferably) is the point where a dependency is to be injected
* `@Qualifier` - When there are multiple implementations of an interface and spring can't decide which one to use then we can use the `@Qualifier([bean name])` to specify which bean to use
* `@Primary` - this annotation marks a bean as a default bean to be injected, If no Qualifier is assigned then this'll run by default

#### Web
* `@Controller` - used to define a java class as a servlet spring bean
* `@RequestMapping("/demo")` - used to mark a class where a specific request is to be send. Here all the requests from `http://<address>:<port>/demo` will go to this class
* `@GetMapping(path = "/all")` - map a get request to a method 
* `@PostMapping(path = "/add")` - map a post request to a method
* `@RequestParam("queryTerm")` - `http://<domain-name>.com?queryTerm=<searchTerm>` this annotation sends a query parameter (here, `searchTerm`) with the request which can be used to search the database.
* `@ResponseBody` - Annotation that indicates a method return value should be bound to the response body

#### Data
* `@Entity` - Entity is a JPA POJO class which is used to map a relation to an object. In ELI5 words, entity should be a POJO class that exactly resembles the relation (entity = `desc <table-name>`).
* `@Repository` - A repository is an interface which extends the `CrudRepository` interface. A repository contains methods for performing CRUD operations, sorting and paginating data.

### Examples
* [Dependency Injection](https://github.com/aashishksahu/Spring-Works/tree/master/Spring-Core-DI/src/main/java/com/andromeda/basicDI)
* [Spring Data JPA using Oracle 11g Express Edition](https://github.com/aashishksahu/Spring-Works/tree/master/Spring-Data-Demo/src/main/java/com/workGroup) 

### Useful Articles
* [What is Object-Relational Mapping](http://hibernate.org/orm/what-is-an-orm/)
* [Should I Or Should I Not Use ORM ?](https://medium.com/@mithunsasidharan/should-i-or-should-i-not-use-orm-4c3742a639ce)
