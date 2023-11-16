/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ist.challenge.renaldi.service;

import ist.challenge.renaldi.entity.User;
import ist.challenge.renaldi.repository.UserRepository;
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
    
    public void registerUser(User newUser){
        repository.save(newUser);
    }
    
}
