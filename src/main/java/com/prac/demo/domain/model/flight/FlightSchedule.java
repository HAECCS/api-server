package com.prac.demo.domain.model.flight;

import com.prac.demo.domain.model.Airline;
import com.prac.demo.domain.model.airport.Airport;
import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table(name = "flightschedule")
public class FlightSchedule {

    @Id
    @Column(name = "flightno", nullable = false, length = 8)
    private String flightNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`from`", nullable = false, foreignKey = @ForeignKey(name = "flightschedule_ibfk_1"))
    private Airport from;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`to`", nullable = false, foreignKey = @ForeignKey(name = "flightschedule_ibfk_2"))
    private Airport to;

    @Column(name = "departure", nullable = false)
    private Time departure;

    @Column(name = "arrival", nullable = false)
    private Time arrival;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "airline_id", nullable = false, foreignKey = @ForeignKey(name = "flightschedule_ibfk_3"))
    private Airline airline;

    @Column(name = "monday")
    private Boolean monday;

    @Column(name = "tuesday")
    private Boolean tuesday;

    @Column(name = "wednesday")
    private Boolean wednesday;

    @Column(name = "thursday")
    private Boolean thursday;

    @Column(name = "friday")
    private Boolean friday;

    @Column(name = "saturday")
    private Boolean saturday;

    @Column(name = "sunday")
    private Boolean sunday;

    // Getters and Setters
}
