package com.prac.demo.domain.repository;

import com.prac.demo.domain.model.Airline;

import java.util.List;
import java.util.Optional;

public interface AirlineRepository {

    Optional<List<Airline>> searchAll();
    Optional<Airline> searchByArilineId(int airlineId);
}
