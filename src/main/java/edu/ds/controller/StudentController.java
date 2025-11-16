package edu.ds.controller;

import edu.ds.model.dto.Student;
import edu.ds.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("test")
    public String test() {
        return "Test success";
    }

    @PostMapping("add")
    public void add(@RequestBody Student student){
        studentService.add(student);
    }

    @GetMapping("get/{id}")
    public Student get(@PathVariable String id){
        return studentService.get(id);
    }

    @GetMapping("all")
    public List<Student> getAll(){
        return studentService.getAll();
    }

    @PutMapping("update")
    public void update(@RequestBody Student student){
        studentService.update(student);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable String id){
        studentService.delete(id);
    }
}
