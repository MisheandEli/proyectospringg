package com.proyect.demo_mysql.services;

import java.util.List;
import com.proyect.demo_mysql.enity.Person;
public interface PersonService {
	
	public List<Person> findAll();
	
	public Person save(Person person);
	
	public Person findById(Long id);
	
	public void delete(Person person);

}
