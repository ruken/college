package org.ruken.college.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.ruken.json.Student;


@RestController
public class CollegeController {

	
	
	@Autowire 
	StudentJpaRepository studentRepo;
	
	@RequestMapping(value="/addStudent", method = RequestMethod.POST)
	ResponseEntity<Student> addStudent(@RequestBody Student input) {
      System.out.println("adding Student: " + input);
      
      
      
      return null;
	}
	
	
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}