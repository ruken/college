package org.ruken.college.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class CollegeController {

	//@RequestMapping(method = RequestMethod.POST)
	//ResponseEntity<?> add(@PathVariable String userId, @RequestBody Bookmark input) {

	//}
	
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}