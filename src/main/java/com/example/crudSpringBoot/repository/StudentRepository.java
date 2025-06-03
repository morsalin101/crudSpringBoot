package com.example.crudSpringBoot.repository;

import com.example.crudSpringBoot.model.Student;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
