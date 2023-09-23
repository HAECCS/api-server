package com.prac.demo.domain.model.flight;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "flight_log")
public class FlightLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_log_id", nullable = false)
    private Integer flightLogId;

    @Column(name = "log_date", nullable = false)
    private Timestamp logDate;

    @Column(name = "user", nullable = false, length = 100)
    private String user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "flight_id", nullable = false)
    private Flight flight;

    @Column(name = "flightno_old", nullable = false, length = 8)
    private String flightNoOld;

    @Column(name = "flightno_new", nullable = false, length = 8)
    private String flightNoNew;

    @Column(name = "from_old", nullable = false)
    private Integer fromOld;

    @Column(name = "to_old", nullable = false)
    private Integer toOld;

    @Column(name = "from_new", nullable = false)
    private Integer fromNew;

    @Column(name = "to_new", nullable = false)
    private Integer toNew;

    @Column(name = "departure_old", nullable = false)
    private Timestamp departureOld;

    @Column(name = "arrival_old", nullable = false)
    private Timestamp arrivalOld;

    @Column(name = "departure_new", nullable = false)
    private Timestamp departureNew;

    @Column(name = "arrival_new", nullable = false)
    private Timestamp arrivalNew;

    @Column(name = "airplane_id_old", nullable = false)
    private Integer airplaneIdOld;

    @Column(name = "airplane_id_new", nullable = false)
    private Integer airplaneIdNew;

    @Column(name = "airline_id_old", nullable = false)
    private Integer airlineIdOld;

    @Column(name = "airline_id_new", nullable = false)
    private Integer airlineIdNew;

    @Column(name = "comment", length = 200)
    private String comment;

    // Getters and Setters
}
