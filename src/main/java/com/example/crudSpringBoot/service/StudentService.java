package com.example.crudSpringBoot.service;

import com.example.crudSpringBoot.model.Student;
import java.util.List;

public interface StudentService {
  List<Student> getAllStudents();
  void saveStudent(Student student);
  Student getStudentById(Long id);
  void deleteStudent(Long id);
}

