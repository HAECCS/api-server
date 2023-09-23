package com.prac.demo.application.service;

import com.prac.demo.domain.repository.AirportRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class AirportAppService {

    private final AirportRepository airportRepository;

}
