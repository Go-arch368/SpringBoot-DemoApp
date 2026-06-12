package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElse(null);
    }

    public Student addStudent(Student student){
      return studentRepository.save(student);
    }

    public Student updateStudent(Long id , Student updated) {
        Student existing = studentRepository.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(updated.getName());
            existing.setEmail(updated.getEmail());
            existing.setCourse(updated.getCourse());
            return existing;
        }
        return null;
    }



    public void deleteStudent(Long id){
       studentRepository.deleteById(id);
    }

}
