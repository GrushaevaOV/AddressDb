package org.example.active;

import org.example.object.Address;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoubleAddressTest {

    @Test
    void doubleAddressLine() {
        Address address1 = new Address("Saransk","Serova",3,82);
        Address address2 = new Address("Saransk","Serova",3,82);
        Address address3 = new Address("Saransk","Serova",3,83);
        Map<String,Integer> testAddress = new HashMap<>();
        testAddress.put(address1.getCity()+" "+address1.getStreet()+" "+address1.getHouse()+" "+address1.getFloor(),2);
        List <Address> addresses= new ArrayList<>();
        addresses.add(address1);
        addresses.add(address2);
        addresses.add(address3);
        DoubleAddress doubleAddress= new DoubleAddress();
        assertEquals(doubleAddress.doubleAddressLine(addresses),testAddress);
    }
}