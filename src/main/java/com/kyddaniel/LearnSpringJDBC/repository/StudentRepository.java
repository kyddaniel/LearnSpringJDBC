package com.kyddaniel.LearnSpringJDBC.repository;

import com.kyddaniel.LearnSpringJDBC.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    public void save(Student student) {
        System.out.println("added");
    }

    public List<Student> findAll() {

        List<Student> students = new ArrayList<>();
        return students;
    }
}
