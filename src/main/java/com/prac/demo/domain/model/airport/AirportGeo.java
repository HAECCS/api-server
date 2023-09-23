package com.prac.demo.domain.model.airport;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "airport_geo")
public class AirportGeo {

    @Id
    @OneToOne
    @JoinColumn(name = "airport_id", nullable = false, foreignKey = @ForeignKey(name = "airport_geo_ibfk_1"))
    private Airport airport;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "city", length = 50)
    private String city;

    @Column(name = "country", length = 50)
    private String country;

    @Column(name = "latitude", nullable = false, precision = 11, scale = 8)
    private BigDecimal latitude;

    @Column(name = "longitude", nullable = false, precision = 11, scale = 8)
    private BigDecimal longitude;

    // JPA does not currently have built-in support for MySQL's POINT type.
    // One option is to store it as binary data and convert it to/from POINT in your application code.
    // Here we're just storing it as a byte array.
    @Lob
    @Column(name = "geolocation", nullable = false)
    private byte[] geolocation;

    // Getters and Setters
}
