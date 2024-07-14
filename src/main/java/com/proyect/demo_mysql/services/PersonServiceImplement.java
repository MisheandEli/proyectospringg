package com.proyect.demo_mysql.services;

import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyect.demo_mysql.dao.PersonDao;
import com.proyect.demo_mysql.enity.Person;

import jakarta.transaction.Transactional;

@Service
public class PersonServiceImplement implements PersonService{

	
	
	@Autowired
	private PersonDao personDao;
	
	@Override
	@Transactional
	public List<Person> findAll() {
		return (List<Person>) personDao.findAll();
	}

	@Override
	@Transactional
	public Person save(Person person) {
		// TODO Auto-generated method stub
		return personDao.save(person);
	}

	@Override
	public Person findById(Long id) {
		// TODO Auto-generated method stub
		return personDao.findById(id).orElse(null);
	}

	@Override	
	@Transactional
	public void delete(Person person) {
		personDao.delete(person);
		
		
	}

}
