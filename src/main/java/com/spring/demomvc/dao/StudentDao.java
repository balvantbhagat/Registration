package com.spring.demomvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demomvc.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

}
