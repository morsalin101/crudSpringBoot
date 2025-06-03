package com.example.crudSpringBoot.controller;

import com.example.crudSpringBoot.model.Student;
import com.example.crudSpringBoot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String dashboard(Model model){
        List<Student> listStudents = studentService.getAllStudents();
        model.addAttribute("students", listStudents);
        model.addAttribute("student", new Student()); // for add/edit modal
        return "index";
    }

    @PostMapping("/save")
    public String saveOrUpdateStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model){
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        List<Student> listStudents = studentService.getAllStudents();
        model.addAttribute("students", listStudents);
        return "index"; // return index with data populated in modal
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return "redirect:/";
    }
}
