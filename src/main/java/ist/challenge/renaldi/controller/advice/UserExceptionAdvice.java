/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ist.challenge.renaldi.controller.advice;

import ist.challenge.renaldi.exception.user.UserAlreadyExistException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author ryuuji
 */
@ControllerAdvice
public class UserExceptionAdvice {
    
    @ExceptionHandler
    public ResponseEntity<String> handleDataException(UserAlreadyExistException ex){
        return ResponseEntity.status(HttpStatus.CONFLICT)
                                .body(ex.getMessage());
    }
    
}
