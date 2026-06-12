package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
   @Autowired
     private StudentService studentService;

   @GetMapping
     public List<Student> getAllStudents(){
        return studentService.getAllStudents();
   }

   @GetMapping("/{id}")
    public Student getStudent(@PathVariable long id){
       return studentService.getStudentById(id);
   }

   @PostMapping
    public Student addStudent(@Valid @RequestBody Student data){
       return studentService.addStudent(data);
   }

   @PutMapping("/{id}")
   public Student updateStudent(@PathVariable Long id , @Valid @RequestBody Student student){
       return studentService.updateStudent(id,student);
   }

   @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id){
       studentService.deleteStudent(id);
       return "Student Deleted Successfully";
   }
}
