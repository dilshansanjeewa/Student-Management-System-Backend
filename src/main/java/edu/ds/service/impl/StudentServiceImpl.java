package edu.ds.service.impl;

import edu.ds.model.dto.Student;
import edu.ds.model.entity.StudentEntity;
import edu.ds.repository.StudentRepository;
import edu.ds.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void add(Student student) {

    }

    @Override
    public Student get(String id) {
        return null;
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Student> getAll() {
        return List.of();
    }
}
