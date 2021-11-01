package org.student.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.student.repository.StudentRepository;
import org.student.entity.Student;

@ApplicationScoped
public class StudentService {

    @Inject
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.listAll();
    }

    public void addStudent(Student student) {
        studentRepository.persist(student);
    }

    public void removeStudent(Long id) {
        studentRepository.deleteById(id);
    }

}
