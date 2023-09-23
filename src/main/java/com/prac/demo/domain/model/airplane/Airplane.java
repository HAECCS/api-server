package com.prac.demo.domain.model.airplane;

import jakarta.persistence.*;

@Entity
@Table(name = "airplane")
public class Airplane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "airplane_id", nullable = false)
    private Integer airplaneId;

    @Column(name = "capacity", nullable = false)
    private Integer capacity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id", nullable = false, foreignKey = @ForeignKey(name = "airplane_ibfk_1"))
    private AirplaneType type;

    @Column(name = "airline_id", nullable = false)
    private Integer airlineId;

    // Getters and Setters
}
