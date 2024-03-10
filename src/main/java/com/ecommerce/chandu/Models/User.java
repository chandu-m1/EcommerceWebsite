package com.ecommerce.chandu.Models;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name="name")
    public String name;
    @Column(name="deptName")
    public String deptName;
    @Column(name="salary")
    public double salary;
}
