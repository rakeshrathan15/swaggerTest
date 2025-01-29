package com.neoteric.swaggerTest.exception;


import com.neoteric.swaggerTest.model.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.stream.Collectors;

@ControllerAdvice
public class ExceptionHandlerConfig {


    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> handleException(Exception e) {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setStatus("Error");
        errorDetails.setDetails(e.getMessage());
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDetails> handleException(MethodArgumentNotValidException ex) {
        // Collect all validation error messages
        String errorMessages = ex.getBindingResult().getFieldErrors().stream()
                .map(fieldError -> fieldError.getDefaultMessage()).collect(Collectors.toList()).toString();
               // .collect(Collectors.joining(", "));  // Join messages with commas

        // Construct the response
        ErrorDetails response = new ErrorDetails();
        response.setStatus("Validation Error");
        response.setDetails(errorMessages);

        // Return the response with BAD_REQUEST status
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }



}
