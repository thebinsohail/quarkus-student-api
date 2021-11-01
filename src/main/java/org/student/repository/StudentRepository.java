package org.student.repository;

import javax.enterprise.context.ApplicationScoped;

import org.student.entity.Student;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class StudentRepository implements PanacheRepository<Student> {

 
    
}
