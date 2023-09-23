package com.prac.demo.domain.model.airport;

import jakarta.persistence.*;

@Entity
@Table(name = "airport_reachable")
public class AirportReachable {

    @Id
    @OneToOne
    @JoinColumn(name = "airport_id", nullable = false, foreignKey = @ForeignKey(name = "airport_reachable_ibfk_1"))
    private Airport airport;

    @Column(name = "hops")
    private Integer hops;

    // Getters and Setters
}
