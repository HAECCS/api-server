package com.prac.demo.domain.model.employee;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private Integer employeeId;

    @Column(name = "firstname", nullable = false, length = 100)
    private String firstName;

    @Column(name = "lastname", nullable = false, length = 100)
    private String lastName;

    @Column(name = "birthdate", nullable = false)
    private Date birthdate;

    @Column(name = "sex", length = 1)
    private String sex;

    @Column(name = "street", nullable = false, length = 100)
    private String street;

    @Column(name = "city", nullable = false, length = 100)
    private String city;

    @Column(name = "zip", nullable = false)
    private Short zip;

    @Column(name = "country", nullable = false, length = 100)
    private String country;

    @Column(name = "emailaddress", length = 120)
    private String emailAddress;

    @Column(name = "telephoneno", length = 30)
    private String telephoneNo;

    @Column(name = "salary", precision = 8, scale = 2)
    private BigDecimal salary;

    @Enumerated(EnumType.STRING)
    @Column(name = "department", columnDefinition = "enum('Marketing','Buchhaltung','Management','Logistik','Flugfeld')")
    private DepartmentEnum department;

    @Column(name = "username", length = 20, unique = true)
    private String username;

    @Column(name = "password", length = 32)
    private String password;

    // Getters and Setters
}

