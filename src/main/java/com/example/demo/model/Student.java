package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data               // ✅ getters + setters
@AllArgsConstructor // ✅ constructor with all fields (THIS is what fixes your error)
@NoArgsConstructor
public class Student {
    private Long id;
    private String name;
    private String email;
    private String course;
}
