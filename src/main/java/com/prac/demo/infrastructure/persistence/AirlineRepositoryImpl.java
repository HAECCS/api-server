package com.prac.demo.infrastructure.persistence;

import com.prac.demo.domain.model.Airline;
import com.prac.demo.domain.repository.AirlineRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import static com.prac.demo.domain.model.QAirline.airline;
import static com.prac.demo.domain.model.airport.QAirport.airport;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
@Slf4j
public class AirlineRepositoryImpl implements AirlineRepository {
    private final JPAQueryFactory queryFactory;

    @Override
    public Optional<List<Airline>> searchAll() {
        Optional<List<Airline>> result = Optional.ofNullable(queryFactory
                .selectFrom(airline)
                .fetch());
        log.info("{}", result.stream().findFirst());
        return result;
    }

    @Override
    public Optional<Airline> searchByArilineId(int airlineId) {
        Optional<Airline> result = Optional.ofNullable(queryFactory
                .selectFrom(airline)
                        .leftJoin(airline.baseAirport, airport).fetchJoin()
                        .where(airline.airlineId.eq(airlineId))

                .fetchOne());
        return result;
    }
}
