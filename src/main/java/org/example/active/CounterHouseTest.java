package org.example.active;
import org.example.object.Address;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CounterHouseTest {

    @Test
    void counterHouseInCity() {
        Address address1 = new Address("Saransk","Serova",3,82);
        Address address2 = new Address("Saransk","Serova",3,82);
        Address address3 = new Address("Saransk","Serova",3,83);
        List<Address> addresses = new ArrayList<>();
        addresses.add(address1);
        addresses.add(address2);
        addresses.add(address3);
        CounterHouse counterHouse = new CounterHouse();
        List <Integer> c = new ArrayList<>();
        c.add(2);
        c.add(1);
        assertEquals(counterHouse.counterHouseInCity(addresses), c);
    }
}