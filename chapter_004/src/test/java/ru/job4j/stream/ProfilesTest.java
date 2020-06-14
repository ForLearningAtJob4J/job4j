package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collectTest() {
        List<Profile> profiles = new ArrayList<>() { {
            add(new Profile(new Address("Town", "Street", 10, 1)));
            add(new Profile(new Address("City", "Street", 11, 10)));
            add(new Profile(new Address("City", "Avenue", 1, 11)));
        } };
        List<Address> expected = new ArrayList<>() { {
            add(new Address("Town", "Street", 10, 1));
            add(new Address("City", "Street", 11, 10));
            add(new Address("City", "Avenue", 1, 11));
        } };
        assertThat(Profile.Profiles.collect(profiles), is(expected));
    }
}