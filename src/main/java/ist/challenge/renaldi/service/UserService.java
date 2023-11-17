/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ist.challenge.renaldi.service;

import ist.challenge.renaldi.entity.User;
import ist.challenge.renaldi.exception.user.UserAlreadyExistException;
import ist.challenge.renaldi.exception.user.UserLoginException;
import ist.challenge.renaldi.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ryuuji
 */
@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;
    
    public void registerUser(User newUser) throws UserAlreadyExistException{
        if(repository.existsByUsername(newUser.getUsername()))
            throw UserAlreadyExistException.messageOnly("Username sudah terpakai");
       repository.save(newUser);
    }
    
    private void throwEmptyLogin(){
        throw UserLoginException.messageOnly("Username dan / atau password kosong", UserLoginException.ExceptionType.EMPTY_LOGIN);
    }
    
    private void throwInvalidLogin(){
        throw UserLoginException.messageOnly("Login tidak valid", UserLoginException.ExceptionType.INVALID_LOGIN);
    }
    
    public void loginUser(User login) throws UserLoginException{
        if(login.getUsername() == null || login.getPassword() == null)
            throwEmptyLogin();
        if(login.getUsername().length() == 0 || login.getPassword().length() == 0)
            throwEmptyLogin();
        if(!repository.existsByUsername(login.getUsername()))
            throwInvalidLogin();
        User user = repository.findByUsername(login.getUsername());
        if(!user.getPassword().contentEquals(login.getPassword()))
            throwInvalidLogin();
    }
    
    public List<User> listAllUser(){
        return repository.findAll();
    }
    
}
