package com.springrameworkmaster.resttemplate.resttemplate.Controllers;

import com.springrameworkmaster.resttemplate.resttemplate.domains.Person;
import com.springrameworkmaster.resttemplate.resttemplate.services.PersonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @RequestMapping("/api")
    public List<Person> getAllPersons(){
     return personService.getAllPersons();
    }


}

