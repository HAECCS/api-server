package com.prac.demo.application.service;

import com.prac.demo.domain.model.Airline;
import com.prac.demo.global.exception.DataNotFoundException;
import com.prac.demo.domain.repository.AirlineRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class AirlineAppService {
    private final AirlineRepository airlineRepository;

    @Transactional(readOnly = true)
    public List<Airline> searchAll() {
        return airlineRepository.searchAll().orElseThrow(() -> new DataNotFoundException("Not found"));
    }

    @Transactional(readOnly = true)
    public Airline searchById(int id) {
        return airlineRepository.searchByArilineId(id).orElseThrow(() -> new DataNotFoundException("Not found"));
    }

}
