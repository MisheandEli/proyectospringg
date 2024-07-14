package com.proyect.demo_mysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo_mysql.enity.Person;


@Repository
public interface PersonDao extends JpaRepository<Person, Long> {

}
