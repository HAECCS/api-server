package com.prac.demo.domain.model.airplane;

import jakarta.persistence.*;

@Entity
@Table(name = "airplane_type")
public class AirplaneType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id", nullable = false)
    private Integer typeId;

    @Column(name = "identifier", length = 50)
    private String identifier;

    @Column(name = "description", columnDefinition="TEXT")
    private String description;

    // Getters and Setters
}
