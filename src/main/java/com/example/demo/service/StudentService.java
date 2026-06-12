package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<>(List.of(

            new Student(1L, "Alice", "alice@email.com", "Java"),
            new Student(2L, "Bob", "bob@email.com", "Python")
    ));

    public List<Student> getAllStudents(){
        return students;
    }

    public Student getStudentById(Long id){
        return students.stream()
                .filter(s->s.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Student addStudent(Student student){
       students.add(student);
       return student;
    }

    public Student updateStudent(Long id , Student updated) {
        for (Student s : students){
            if(s.getId().equals(id)){
                s.setName(updated.getName());
                s.setEmail(updated.getEmail());
                s.setCourse(updated.getCourse());
                return s;
            }
        }
        return null;
    }

    public void deleteStudent(Long id){
       students.removeIf(s->s.getId().equals(id));
    }

}
