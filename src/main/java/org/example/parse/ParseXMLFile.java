package org.example.parse;

import org.example.object.Address;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static org.example.utils.AddressDb.*;


public class ParseXMLFile implements Parse {
    @Override
    public void parse(File file) {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader parser = null;
        try {
            parser = factory.createXMLStreamReader(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            System.out.println("Check file path");
        } catch (XMLStreamException e) {
            System.out.println(e.getMessage());
        }
        try {
            while (parser != null) {
                if (!parser.hasNext()) break;
                int event = parser.next();
                if (event == XMLStreamConstants.START_ELEMENT) {
                    if (parser.getLocalName().equals("item")) {
                        Address address = new Address();
                        address.setCity(parser.getAttributeValue(0));
                        address.setStreet(parser.getAttributeValue(1));
                        address.setHouse(Integer.parseInt(parser.getAttributeValue(2)));
                        address.setFloor(Integer.parseInt(parser.getAttributeValue(3)));
                        addressList.add(address);
                    }
                }
            }
        } catch (XMLStreamException e) {
            System.out.println(e.getMessage());
        }
    }

}
