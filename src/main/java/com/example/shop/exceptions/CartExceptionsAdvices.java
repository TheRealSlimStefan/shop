package com.example.shop.exceptions;

import com.itextpdf.text.DocumentException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;

@ControllerAdvice
public class CartExceptionsAdvices {
    @ExceptionHandler(CartNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleCartNotFoundException(CartNotFoundException e) {
        ErrorResponse error = new ErrorResponse(HttpStatus.NOT_FOUND, HttpStatus.NOT_FOUND.value(), e.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(CartDoesNotHaveProductException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<Object> handleCartDoesNotHaveProductException(CartDoesNotHaveProductException e) {
        ErrorResponse error = new ErrorResponse(HttpStatus.BAD_REQUEST, HttpStatus.BAD_REQUEST.value(), e.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(DocumentException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Object> handleCartGeneratePdfException(DocumentException e) {
        String errorMessage = "Oops, something went wrong! Try again later :(";

        ErrorResponse error = new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.INTERNAL_SERVER_ERROR.value(), errorMessage, LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
