package org.ruken.college.controller;

import org.ruken.college.jpa.repository.WebsiteRegistrationJpaRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.ruken.college.jpa.repository.StudentJpaRepository;
import org.ruken.json.UserProfilePayload;
import org.ruken.college.service.WebsiteRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;

//@RestController - ReST annotation from Spring Framework to tell it 
//that WebsiteRegistrationController.java class is a ReST Controller


@RestController
public class WebsiteRegistrationController { 
  /*------- Class variables -------*/
  //@AutoWired - Lets me instantiate a JPA Repository entity 
  @Autowired 
  WebsiteRegistrationService websiteRegistrationService;
  /*------- Start of Code -------*/
  
  @RequestMapping(value="/register", method = RequestMethod.POST)
  ResponseEntity register(@RequestBody UserProfilePayload input) {
    /*------- Local variables -------*/
    ResponseEntity response = new ResponseEntity(HttpStatus.OK);
    /*------- Start of Code -------*/
   
    System.out.println("registering Student: " + input);
    websiteRegistrationService.registerUser(input);


    return response;
  } /* END OF method register */
  
} /* END OF class WebsiteRegistrationController */

/* END OF source file */
