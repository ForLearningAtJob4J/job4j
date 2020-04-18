package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserStoreTest {

    @Test(expected = UserNotFoundException.class)
    public void findUserNotFound() throws UserNotFoundException {
        UserStore.findUser(new User[]{new User("Superhero", true)}, "Naturwissenshaften");
    }

    @Test(expected = UserInvalidException.class)
    public void validateNotValidCauseOfProperty() throws UserInvalidException {
        UserStore.validate(new User("Barbara", false));
    }

    @Test(expected = UserInvalidException.class)
    public void validateNotValidCauseOfShortLogin() throws UserInvalidException {
        UserStore.validate(new User("RT", true));
    }
}