package com.prac.demo.domain.model.passenger;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "passengerdetails")
public class PassengerDetail {

    @Id
    @OneToOne
    @JoinColumn(name = "passenger_id", nullable = false)
    private Passenger passenger;

    @Column(name = "birthdate", nullable = false)
    private Date birthdate;

    @Column(name = "sex", length = 1)
    private String sex;

    @Column(name = "street", nullable = false, length = 100)
    private String street;

    @Column(name = "city", nullable = false, length = 100)
    private String city;

    @Column(name = "zip", nullable = false)
    private Short zip;

    @Column(name = "country", nullable = false, length = 100)
    private String country;

    @Column(name = "emailaddress", length = 120)
    private String emailAddress;

    @Column(name = "telephoneno", length = 30)
    private String telephoneNo;

    // Getters and Setters
}

