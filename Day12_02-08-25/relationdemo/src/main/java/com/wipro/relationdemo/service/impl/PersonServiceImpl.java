package com.wipro.relationdemo.service.impl;

import org.springframework.stereotype.Service;

import com.wipro.relationdemo.entity.Person;
import com.wipro.relationdemo.repo.PersonRepository;
import com.wipro.relationdemo.service.PersonService;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @Override
    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElse(null);
    }
}

