package com.wipro.relationdemo.service;

import java.util.List;

import com.wipro.relationdemo.entity.Person;

public interface PersonService {
    Person savePerson(Person person);
    List<Person> getAllPersons();
    Person getPersonById(Long id);
}
