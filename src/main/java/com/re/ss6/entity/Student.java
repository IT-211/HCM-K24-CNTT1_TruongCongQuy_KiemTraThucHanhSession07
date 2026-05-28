package com.re.ss6.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String email;
    private Double gpa;

    public Student() {}

    public Student(Long id, String fullName, String email, Double gpa) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.gpa = gpa;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }
    public Double getGpa() {
        return gpa;
    }
}
