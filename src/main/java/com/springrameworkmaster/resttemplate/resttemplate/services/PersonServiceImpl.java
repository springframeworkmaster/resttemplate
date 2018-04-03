package com.springrameworkmaster.resttemplate.resttemplate.services;

import com.springrameworkmaster.resttemplate.resttemplate.domains.Person;
import com.springrameworkmaster.resttemplate.resttemplate.domains.PersonList;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PersonServiceImpl  implements PersonService{

    RestTemplate restTemplate;

    public PersonServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Person> getAllPersons() {
        PersonList personList = restTemplate.getForObject("http://localhost:8080/api/persons", PersonList.class);

        System.out.println(personList.toString());
        return personList.getPersons();
    }
}
