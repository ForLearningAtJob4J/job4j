package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    static class Profiles {
        static List<Address> collect(List<Profile> profiles) {
            return profiles.stream().map(Profile::getAddress).sorted(Comparator.comparing(Address::getCity))
                    .distinct().collect(Collectors.toList());
        }
    }
}