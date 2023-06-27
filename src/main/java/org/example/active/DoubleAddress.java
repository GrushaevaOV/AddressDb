package org.example.active;

import org.example.object.Address;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoubleAddress {
    public Map<String,Integer> doubleAddressLine(List<Address> addresses) {
        List<String> addressLine = new ArrayList<>();
        for (Address address : addresses) {
            addressLine.add(address.getCity() + " " + address.getStreet() + " " + address.getHouse() + " " + address.getFloor());
        }
        HashMap<String, Integer> addreeDublicate = new HashMap<>();
        for (String line : addressLine) {
            if (!addreeDublicate.containsKey(line)) {
                addreeDublicate.put(line, 1);
            } else {
                addreeDublicate.put(line, addreeDublicate.get(line) + 1);
            }
        }
        HashMap <String,Integer> dublicates = new HashMap<>();
        for (Map.Entry<String, Integer> entryMap : addreeDublicate.entrySet()) {
            if (entryMap.getValue() > 1) {
                System.out.println("Address " + entryMap.getKey() + " kol-vo " + entryMap.getValue());
                dublicates.put(entryMap.getKey(),entryMap.getValue());
            }
        }
        return dublicates;
    }
}
