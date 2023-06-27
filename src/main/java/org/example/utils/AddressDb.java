package org.example.utils;

import org.example.object.Address;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AddressDb {
    public static List<Address> addressList = new ArrayList<>();
    public static List<String> cityList (){
        Set<String> cities = new HashSet<>();
        for (Address address:addressList) cities.add(address.getCity());
        return new ArrayList<String>(cities);
    }
}
