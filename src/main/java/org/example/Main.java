package org.example;

import org.example.active.CounterHouse;
import org.example.active.DoubleAddress;
import org.example.parse.ParseXMLFile;


import java.io.File;

import static org.example.utils.AddressDb.*;

public class Main {
    public static void main(String[] args) {
        ParseXMLFile parseXMLFile = new ParseXMLFile();
        parseXMLFile.parse(new File("address.xml"));
        System.out.println("1 task");
        DoubleAddress doubleAddress = new DoubleAddress();
        doubleAddress.doubleAddressLine(addressList);
        System.out.println("2 task");
        CounterHouse counterHouse = new CounterHouse();
        counterHouse.counterHouseInCity(addressList);
    }
}