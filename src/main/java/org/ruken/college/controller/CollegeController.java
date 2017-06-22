package org.ruken.college.controller;

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

/*------------------------------------------------------------------------------------------------------------------------------+
|   @RestController - ReST annotation from Spring Framework to tell it that CollegeController.java class is a ReST Controller | 
+-------------------------------------------------------------------------------------------------------------------------------*/

@RestController
public class CollegeController { 

	

/*------------------------------------------------------------------------------------------------------------------------------+
|   @AutoWired -  | Lets me instantiate a JPA Repository entity 
+-------------------------------------------------------------------------------------------------------------------------------*/
	@Autowired 
	StudentJpaRepository studentRepo;
	
	
	/*------------------------------------------------------------------------------------------------------------------------------+
	|   @RequestMapping -  | Tells Spring that the method should be used when the URL is being used 
	+-------------------------------------------------------------------------------------------------------------------------------*/
	@RequestMapping(value="/addStudent", method = RequestMethod.POST)
	
	/*------------------------------------------------------------------------------------------------------------------------------+
	|   ResponseEntity<> -  | Java Generic stating ResponseEntity will contain a Student object
	+-------------------------------------------------------------------------------------------------------------------------------*/
	ResponseEntity addStudent(@RequestBody StudentPayload input) { 
		
		ResponseEntity response = new ResponseEntity(HttpStatus.OK);
		
      System.out.println("adding Student: " + input);
      
      /*------------------------------------------------------------------------------------------------------------------------------+
      |   constructor creating a Student object (person).  
      +-------------------------------------------------------------------------------------------------------------------------------*/
      Student person = new Student();
      
      /*------------------------------------------------------------------------------------------------------------------------------+
      |   setting "first name", "last name", and "wallet" person properties from the studentPayLoad.json input
      +-------------------------------------------------------------------------------------------------------------------------------*/
      person.setFirstName(input.getFirstName());
      person.setLastName(input.getLastName());
      person.setWallet(input.getWallet());
      
      studentRepo.save(person);
      
      return response;
	}
	
	
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}