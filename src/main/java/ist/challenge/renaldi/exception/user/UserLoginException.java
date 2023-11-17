/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ist.challenge.renaldi.exception.user;

import lombok.Getter;

/**
 *
 * @author ryuuji
 */
@Getter
public class UserLoginException extends UserException{
    
    public static enum ExceptionType{
        EMPTY_LOGIN,
        INVALID_LOGIN;
    }
    
    private final ExceptionType exceptionType;
    
    public static UserLoginException messageOnly(String message, ExceptionType type){
        return new UserLoginException(message, type);
    }
    
    public static UserLoginException fullDetail(String message, Throwable cause, ExceptionType type){
        return new UserLoginException(message, cause, type);
    }
    
    protected UserLoginException(String message, ExceptionType type){
        super(message);
        exceptionType = type;
    }

    protected UserLoginException(String message, Throwable cause, ExceptionType type) {
        super(message, cause);
        exceptionType = type;
    }
}
