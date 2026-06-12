package com.example.demo.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data               // ✅ getters + setters
@AllArgsConstructor // ✅ constructor with all fields (THIS is what fixes your error)
@NoArgsConstructor
@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="Name cannot be empty")
    private String name;

    @NotBlank(message="Email cannot be empty")
    @Email(message="Must be a valid email")
    private String email;
    
    @NotBlank(message="Course cannot be empty")
    @Size(min=2 , max =5 , message="Course should be min of 2 char and max of 5 char")
    private String course;
}
