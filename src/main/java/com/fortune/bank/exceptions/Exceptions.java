package com.fortune.bank.bank.exceptions;

import com.fortune.bank.bank.commons.UniversalResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exceptions {
    @ExceptionHandler(AccountDoesNotExist.class)
    ResponseEntity<UniversalResponse> accountIsEmpty(AccountDoesNotExist e){
        return ResponseEntity.ok().body(UniversalResponse.builder().status(404).message(e.getMessage()).build());

    }
    @ExceptionHandler(CustomerDoesNotExist.class)
    ResponseEntity<UniversalResponse> customerIsEmpty(CustomerDoesNotExist e){
        return ResponseEntity.ok().body(UniversalResponse.builder().status(404).message(e.getMessage()).build());
    }
}
