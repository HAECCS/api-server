package com.prac.demo.global.dto;

import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO<T> {
    private int status;
    private String message;
    private T data;
}
