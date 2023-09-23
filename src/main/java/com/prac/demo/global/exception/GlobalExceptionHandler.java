package com.prac.demo.global.exception;

import com.prac.demo.global.exception.DataNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> handleException(Exception e) {
        return new ResponseEntity<>("Error occurred: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = DataNotFoundException.class)
    public ResponseEntity<Object> dataNotFoundException(Exception e) {
        return new ResponseEntity<>("Try Search, But No Any Data", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = IllegalArgumentException.class)
    public ResponseEntity<Object> illegalArgumentException(Exception e) {
        log.info("IllegalArgumentException Error : {}",e.getMessage());
        return new ResponseEntity<>("Check Parameter", HttpStatus.BAD_REQUEST);
    }
}
