package com.mph.dao;

import java.util.List;

import com.mph.entities.Person;

public interface PersonDaoInterface {

	public List<Person> findAll();
	public void addPerson(Person person);
	public Person findById(Long id);
	public Person findByPersonIdWithPassportDetails(Long id);
}
