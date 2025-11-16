package edu.ds.service;

import edu.ds.model.dto.Student;

import java.util.List;

public interface StudentService {
    void add(Student student);
    Student get(String id);
    void update(Student student);
    void delete(String id);
    List<Student> getAll();
}
