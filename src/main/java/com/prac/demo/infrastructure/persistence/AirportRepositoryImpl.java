package com.prac.demo.infrastructure.persistence;

import com.prac.demo.domain.model.Airline;
import com.prac.demo.domain.model.airport.Airport;
import com.prac.demo.domain.repository.AirportRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static com.prac.demo.domain.model.QAirline.airline;
import static com.prac.demo.domain.model.airport.QAirport.airport;

@Repository
@RequiredArgsConstructor
@Slf4j
public class AirportRepositoryImpl implements AirportRepository {
    private final JPAQueryFactory queryFactory;


    @Override
    public Optional<Airport> countCountryHasAirlines(int airlineId) {
        return Optional.empty();
    }
}
