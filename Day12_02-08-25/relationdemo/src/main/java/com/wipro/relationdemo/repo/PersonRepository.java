package com.wipro.relationdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.relationdemo.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	
}

