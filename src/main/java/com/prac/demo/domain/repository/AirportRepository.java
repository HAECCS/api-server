package com.prac.demo.domain.repository;


import com.prac.demo.domain.model.airport.Airport;

import java.util.List;
import java.util.Optional;

public interface AirportRepository {

    Optional<Airport> countCountryHasAirlines(int airlineId);
}
