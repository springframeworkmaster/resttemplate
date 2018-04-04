package com.springrameworkmaster.resttemplate.resttemplate.services;

import com.springrameworkmaster.resttemplate.resttemplate.domains.Person;
import com.springrameworkmaster.resttemplate.resttemplate.domains.PersonList;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class
PersonServiceImpl  implements PersonService{

    RestTemplate restTemplate;

    public PersonServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Person> getAllPersons() {


        Person[] people = restTemplate.getForObject("http://localhost:8080/api/persons", Person[].class);

        List<Person> personList = Arrays.asList(people);
        return personList;
    }
}
