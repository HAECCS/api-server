package com.prac.demo.domain.model.passenger;

import jakarta.persistence.*;

@Entity
@Table(name = "passenger")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passenger_id", nullable = false)
    private Integer passengerId;

    @Column(name = "passportno", nullable = false, length = 9, unique = true)
    private String passportNo;

    @Column(name = "firstname", nullable = false, length = 100)
    private String firstName;

    @Column(name = "lastname", nullable = false, length = 100)
    private String lastName;

    // Getters and Setters
}