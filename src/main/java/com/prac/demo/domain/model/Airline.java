package com.prac.demo.domain.model;

import com.prac.demo.domain.model.airport.Airport;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
@Table(name = "airline")
public class Airline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "airline_id", nullable = false)
    private Integer airlineId;

    @Column(name = "iata", nullable = false, length = 2, unique = true)
    private String iata;

    @Column(name = "airlinename", length = 30)
    private String airlineName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "base_airport", nullable = false)
    private Airport baseAirport;
}
