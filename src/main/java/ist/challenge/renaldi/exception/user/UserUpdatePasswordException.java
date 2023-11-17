/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ist.challenge.renaldi.exception.user;

/**
 *
 * @author ryuuji
 */
public class UserUpdatePasswordException extends UserException{
    
    public static UserUpdatePasswordException messageOnly(String message){
        return new UserUpdatePasswordException(message);
    }
    
    public static UserUpdatePasswordException fullDetail(String message, Throwable cause){
        return new UserUpdatePasswordException(message, cause);
    }
    
    protected UserUpdatePasswordException(String message){
        super(message);
    }

    protected UserUpdatePasswordException(String message, Throwable cause) {
        super(message, cause);
    }
}
