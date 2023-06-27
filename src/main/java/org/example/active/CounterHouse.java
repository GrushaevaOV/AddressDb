package org.example.active;

import org.example.object.Address;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CounterHouse {

    public List<Integer> counterHouseInCity(List<Address> addresses) {
        Map<String, Map<Integer, List<Address>>> map1 = addresses.stream()
                .collect(Collectors.groupingBy(Address::getCity, Collectors.groupingBy(Address::getFloor)));
        List<Integer>  c = new ArrayList<>();
        for (Map.Entry<String, Map<Integer, List<Address>>> entry : map1.entrySet()) {
            System.out.println(entry.getKey());
            for (Map.Entry<Integer, List<Address>> mapValue : entry.getValue().entrySet()){
                c.add(mapValue.getValue().size());
                System.out.println("Floor " + mapValue.getKey() + ": " + mapValue.getValue().size());
            }

        }
        return c;
    }
}

