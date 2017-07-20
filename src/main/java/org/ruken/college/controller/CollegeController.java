package org.ruken.college.controller;

import org.ruken.college.jpa.model.ReservedClass;
import org.ruken.college.jpa.repository.ReservedClassJpaRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.ruken.college.jpa.repository.StudentJpaRepository;
import org.ruken.json.StudentPayload;
import org.ruken.college.jpa.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

//@RestController - ReST annotation from Spring Framework to tell it 
//that CollegeController.java class is a ReST Controller


@RestController
public class CollegeController { 
  /*------- Class variables -------*/
  //@AutoWired - Lets me instantiate a JPA Repository entity 
  @Autowired 
  StudentJpaRepository studentRepo;
  @Autowired
  ReservedClassJpaRepository reservedClassJpaRepo;
  /*------- Start of Code -------*/
  

  
  //ResponseEntity<> - Java Generic stating ResponseEntity will contain a Student object
  //@RequestMapping - Tells Spring that the method should be used when the URL is being used 
  @RequestMapping(value="/addStudent", method = RequestMethod.POST)
  ResponseEntity addStudent(@RequestBody StudentPayload input) { 
    /*------- Local variables -------*/
    ResponseEntity response = new ResponseEntity(HttpStatus.OK);
    //constructor creating a Student object (person).  
    Student person = new Student();
    /*------- Start of Code -------*/
    
    System.out.println("adding Student: " + input);
    //setting "first name", "last name", and "wallet" person properties from the studentPayLoad.json input
    person.setFirstName(input.getFirstName());
    person.setLastName(input.getLastName());
    person.setWallet(input.getWallet());

    //saves the object in the repo AKA inserts the record in the database 
    studentRepo.save(person);
    return response;
  } /* END OF method addStudent */

  @RequestMapping(value="/register", method = RequestMethod.POST)
  ResponseEntity register(@RequestBody ReservedClass input) {
    /*------- Local variables -------*/
    ResponseEntity response = new ResponseEntity(HttpStatus.OK);
    /*------- Start of Code -------*/
   
    System.out.println("registering Student: " + input);
    //constructor creating a ReservedClass object.
    ReservedClass registered = new ReservedClass();

    //setting "", "", and "wallet" person properties from the studentPayLoad.json input
    registered.setClassId(input.getClassId());
    registered.setStudentId(input.getStudentId());

    reservedClassJpaRepo.save(registered);

    return response;
  } /* END OF method register */
  
  @RequestMapping("/")
  public String index() {
    return "Greetings from Spring Boot!";
  } /* END OF method index */

} /* END OF class CollegeController */

/* END OF source file */
