package com.prac.demo.application.dto.req;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class AirlineReqDto {

    @Getter @Setter
    @NoArgsConstructor
    public static class AirlineId{
        private Integer id;
    }
}
