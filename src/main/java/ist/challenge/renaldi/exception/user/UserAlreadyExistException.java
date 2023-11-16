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
    
    public static UserAlreadyExistException defaultException(){
        return new UserAlreadyExistException();
    }
    
    public static UserAlreadyExistException withCause(Throwable cause){
        return new UserAlreadyExistException(cause);
    }

    private static final String MESSAGE="Username already exist";
    
    protected UserAlreadyExistException() {
        super(MESSAGE);
    }

    protected UserAlreadyExistException(Throwable cause) {
        super(MESSAGE, cause);
    }
}
