package org.ruken.college.service;

import org.ruken.college.jpa.repository.WebsiteRegistrationJpaRepository;

import org.ruken.college.jpa.model.UserProfile;

import org.ruken.college.utility.Validator;

import org.springframework.web.bind.annotation.RestController;

import org.ruken.college.jpa.repository.StudentJpaRepository;

import org.ruken.json.UserProfilePayload;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.apache.log4j.Logger;


@Service
public class WebsiteRegistrationService { 
  /*------- Class variables -------*/
  private static final Logger C_log = Logger.getLogger(WebsiteRegistrationService.class);
  //@AutoWired - Lets me instantiate a JPA Repository entity 
  @Autowired 
  WebsiteRegistrationJpaRepository websiteRegistrationRepo;
  /*-------- Start of Code --------*/
  
  public boolean registerUser(UserProfilePayload input) {
    /*------- Local variables -------*/
    boolean Trc        = true;

    UserProfile user = new UserProfile();
  
    /*-------- Start of Code --------*/
    MB: {

      user.setFirstName(input.getFirstName());
      user.setLastName(input.getLastName());
      user.setEmail(input.getEmail());
      user.setPassword(input.getPassword());



      websiteRegistrationRepo.save(user);

    } /*endMB*/
    return(Trc) ;
  } /* END OF method register */
  
} /* END OF class WebsiteRegistrationService */

/* END OF source file */
