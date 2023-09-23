package com.prac.demo.infrastructure.ui;

import com.prac.demo.application.dto.req.AirlineReqDto;
import com.prac.demo.domain.model.Airline;
import com.prac.demo.application.service.AirlineAppService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.prac.demo.global.dto.*;

import static com.prac.demo.global.code.ResponseStatusCode.*;

@Slf4j
@Controller
@RequiredArgsConstructor
public class AirlineController {

    private final AirlineAppService airlineAppService;

    @GetMapping("/airline/search/all")
    public ResponseEntity<ResponseDTO<Object>> searchAirlineAll(){
        return ResponseEntity.ok(
                ResponseDTO.builder()
                        .data(airlineAppService.searchAll())
                        .status(OK_INT)
                        .message(OK_STR)
                        .build());
    }

    @GetMapping("/airline/search")
    public ResponseEntity<ResponseDTO<Airline>> searchAirlineById(
            @RequestBody AirlineReqDto.AirlineId id){

        Integer airlineId = id.getId();
        if(airlineId == null) {
            log.info("airlineId is null");
            throw new IllegalArgumentException("airlineId is null");
        }

        Airline result = airlineAppService.searchById(airlineId);

        ResponseDTO response = ResponseDTO.builder()
                .data(result)
                .status(OK_INT)
                .message(OK_STR)
                .build();

        return ResponseEntity.ok(response);
    }

}
