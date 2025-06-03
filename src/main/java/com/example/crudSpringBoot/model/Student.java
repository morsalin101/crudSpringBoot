package com.example.crudSpringBoot.model;


import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="s_name",nullable = false)
    private  String s_name;

    @Column(name="email",nullable = false ,unique = true)
    private  String email;

    @Column(name = "phone",nullable = false)
    private  String phone;

    @Column(name = "address",nullable = false)
    private String address;

    public Student() {
    }
    public Student(Long id,String s_name,String email,String phone,String address){
        this.id  = id;
        this.s_name = s_name;
        this.email = email;
        this.phone  =phone;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
