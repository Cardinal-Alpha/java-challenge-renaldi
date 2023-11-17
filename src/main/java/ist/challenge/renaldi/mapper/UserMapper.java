/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ist.challenge.renaldi.mapper;

import ist.challenge.renaldi.entity.User;
import ist.challenge.renaldi.pojo.UserDataInput;
import ist.challenge.renaldi.pojo.UserDataOutput;
import org.mapstruct.Mapper;

/**
 *
 * @author ryuuji
 */
@Mapper(componentModel = "spring")
public interface UserMapper {
    
    User mapInput(UserDataInput registration);
    
    UserDataOutput mapOutput(User user);
    
}
