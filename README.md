# RestuarantApi_fs11

Framework and Language Used :
Framework : SpringBoot
Language : Java

Data Flow
1. Controller :-
@GetMapping :- getAllResturant(), getRestroByRestroId()
@PostMapping :- addRestro()
@PutMapping :- updateRstro()
@DeleteMapping :- deleteRestroById()
Others Annotaion Used :- @RestController, @Autowired, @PathVariable, @RequestBody

2. Services :-
Method Used :- getAllRestro(),addRestro(), getRestroByRestroId(), updateRestro(), deleteRestroByRestroId()
Others Annotaion Used :- @Service, @Autowired

3. Repository :-
Method Used :- getRestro(),deleteRestro()
Others Annotaion Used :- @Repository, @Autowired

4. DataBase Design/Bean Factory :-
Method Used :- getInitializedList()
Others Annotaion Used :- @Configuration, @Bean

Data Structure used in my Project
Used :- Lists --> But Mostly used Java Concept, oops, collection

Project Summary
This is basically good project for learning purpose springboot basics, annotaion, api, spring mvc and CRUD Operation. In this project i just add users, get users, remove user data, update userInformation, get user by id , a lot of things i learned from this project.
