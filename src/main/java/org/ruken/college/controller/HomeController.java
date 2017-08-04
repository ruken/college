package org.ruken.college.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.ruken.json.LoginPayload;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value="/authenticateUser", method = RequestMethod.POST)
    //public ResponseEntity authenticateUser(@RequestParam String username, @RequestParam String password) {
    public ResponseEntity authenticateUser(@RequestBody LoginPayload input) {
   	  ResponseEntity response = new ResponseEntity(HttpStatus.OK);
      System.out.println("username is: "+input.getUsername());
      System.out.println("password is: "+input.getPassword());


      return(response) ;
    }
}