package com.example.springdemo.sbr_demo.repository;

import com.example.springdemo.sbr_demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // Optional method to find a student by their email
    Optional<Student> findByEmail(String email);
}
