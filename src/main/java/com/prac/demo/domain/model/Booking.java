package com.prac.demo.domain.model;

import com.prac.demo.domain.model.flight.Flight;
import com.prac.demo.domain.model.passenger.Passenger;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id", nullable = false)
    private Integer bookingId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "flight_id", nullable = false)
    private Flight flight;

    @Column(name = "seat", length = 4)
    private String seat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "passenger_id", nullable = false)
    private Passenger passenger;


    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    // Getters and Setters
}
