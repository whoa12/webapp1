package com.example.springdemo.sbr_demo.service;

import java.util.List;

import com.example.springdemo.sbr_demo.model.Student;
import com.example.springdemo.sbr_demo.service.exception.StudentAlreadyExistsException;

public interface IStudentService {
    Student addStudent(Student student);
    List<Student> getStudents();
    Student updateStudent(Student student, Integer id);
    Student getStudentById(Integer id);
    void deleteStudent(Integer id);
}
