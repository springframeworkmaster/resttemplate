package com.springrameworkmaster.resttemplate.resttemplate.services;

import com.springrameworkmaster.resttemplate.resttemplate.domains.Person;
import com.springrameworkmaster.resttemplate.resttemplate.domains.PersonList;

import java.util.List;

public interface PersonService {

    List<Person> getAllPersons();
}
