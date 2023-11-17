/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ist.challenge.renaldi.exception.user;

/**
 *
 * @author ryuuji
 */
public class UserAlreadyExistException extends UserException{
    
    public static UserAlreadyExistException messageOnly(String message){
        return new UserAlreadyExistException(message);
    }
    
    public static UserAlreadyExistException fullDetail(String message, Throwable cause){
        return new UserAlreadyExistException(message, cause);
    }
    
    protected UserAlreadyExistException(String message){
        super(message);
    }

    protected UserAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
