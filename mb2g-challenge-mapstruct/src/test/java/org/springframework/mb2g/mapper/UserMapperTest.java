package org.springframework.mb2g.mapper;

import org.junit.Test;
import org.springframework.mb2g.domain.User;
import org.springframework.mb2g.model.UserCommand;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserMapperTest {

    @Test
    public void mapUserToUserCommandTest() {
        //given a User Object
        User user = new User("John", "Doe", "johndoe@email.com");

        // when the mapper is called passing a User object
        UserCommand userCommand = UserMapper.INSTANCE.userToUserCommand(user);

        // then return a UserCommand object with the fields correctly mapped
        assertNotNull(userCommand);
        assertEquals(userCommand.getFirstName(), user.getFirstName());
        assertEquals(userCommand.getLastName(), user.getLastName());
        assertEquals(userCommand.getEmail(), user.getEmail());
    }

    @Test
    public void mapUserCommandToUserTest() {
        // given a UserCommand object
        UserCommand userCommand = new UserCommand("John", "Doe", "johndoe@email.com");

        // when the mapper is called passing in a UserCommand object
        User user = UserMapper.INSTANCE.userCommandToUser(userCommand);

        // then return a User object with the fields correctly mapped
        assertNotNull(user);
        assertEquals(user.getFirstName(), userCommand.getFirstName());
        assertEquals(user.getLastName(), userCommand.getLastName());
        assertEquals(user.getEmail(), userCommand.getEmail());
    }
}
