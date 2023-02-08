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
public class ErrorsResponse {
    private HttpStatus error;
    private Integer status;
    private Map<String, String> messages;
    private LocalDateTime timestamp;
}
