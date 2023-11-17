/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ist.challenge.renaldi.repository;

import ist.challenge.renaldi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ryuuji
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
    boolean existsByUsername(String username);
    
    User findByUsername(String username);
    
}
