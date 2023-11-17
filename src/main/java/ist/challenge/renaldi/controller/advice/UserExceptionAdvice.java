/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ist.challenge.renaldi.controller.advice;

import ist.challenge.renaldi.exception.user.UserAlreadyExistException;
import ist.challenge.renaldi.exception.user.UserLoginException;
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
    public ResponseEntity<String> handleDuplicateUserException(UserAlreadyExistException ex){
        return ResponseEntity.status(HttpStatus.CONFLICT)
                                .body(ex.getMessage());
    }
    
    @ExceptionHandler
    public ResponseEntity<String> handleLoginUserException(UserLoginException ex){
        if(ex.getExceptionType() == UserLoginException.ExceptionType.EMPTY_LOGIN)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                                .body(ex.getMessage());
        if(ex.getExceptionType() == UserLoginException.ExceptionType.INVALID_LOGIN)
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                                .body(ex.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                .body("Unexpected error occur");
    }
    
}
