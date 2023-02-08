package com.example.shop.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Map;

@Setter
@Getter
@AllArgsConstructor
public class ErrorResponse {
    private HttpStatus error;
    private Integer status;
    private String message;
    private LocalDateTime timestamp;
}
