package edu.ds.service.impl;

import edu.ds.model.dto.Student;
import edu.ds.model.entity.StudentEntity;
import edu.ds.repository.StudentRepository;
import edu.ds.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void add(Student student) {
        studentRepository.save(new StudentEntity(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getGender(),
                student.getGrade(),
                student.getAddress(),
                student.getMobile()
        ));
    }

    @Override
    public Student get(String id) {
        StudentEntity studentEntity = studentRepository.findById(id).get();
        return new Student(
                studentEntity.getId(),
                studentEntity.getFirstName(),
                studentEntity.getLastName(),
                studentEntity.getGender(),
                studentEntity.getGrade(),
                studentEntity.getAddress(),
                studentEntity.getMobile()
        );
    }

    @Override
    public void update(Student student) {
        studentRepository.save(new StudentEntity(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getGender(),
                student.getGrade(),
                student.getAddress(),
                student.getMobile()
        ));
    }

    @Override
    public void delete(String id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getAll() {

        List<StudentEntity> all = studentRepository.findAll();
        List<Student> allStudents = new ArrayList<>();

        for (StudentEntity studentEntity : all) {
            allStudents.add(new Student(
                    studentEntity.getId(),
                    studentEntity.getFirstName(),
                    studentEntity.getLastName(),
                    studentEntity.getGender(),
                    studentEntity.getGrade(),
                    studentEntity.getAddress(),
                    studentEntity.getMobile()
            ));
        }

        return allStudents;
    }
}
