package com.prac.demo.domain.model.flight;

import com.prac.demo.domain.model.Airline;
import com.prac.demo.domain.model.airport.Airport;
import com.prac.demo.domain.model.airplane.Airplane;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_id", nullable = false)
    private Integer flightId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "flightno", nullable = false)
    private FlightSchedule flightNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`from`", nullable = false)
    private Airport from;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`to`", nullable = false)
    private Airport to;

    @Column(name = "departure", nullable = false)
    private Timestamp departure;

    @Column(name = "arrival", nullable = false)
    private Timestamp arrival;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "airline_id", nullable = false)
    private Airline airline;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "airplane_id", nullable = false)
    private Airplane airplane;

    // Getters and Setters
}
