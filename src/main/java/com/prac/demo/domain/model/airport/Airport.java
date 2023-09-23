package com.prac.demo.domain.model.airport;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "airport")
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "airport_id", nullable = false)
    private Integer airportId;

    @Column(name = "iata", length = 3)
    private String iata;

    @Column(name = "icao", nullable = false, length = 4, unique = true)
    private String icao;

    @Column(name = "name", nullable = false, length = 50)
    private String name;
}
