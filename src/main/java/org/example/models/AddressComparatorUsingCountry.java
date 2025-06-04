package org.example.models;

import java.util.Comparator;

public class AddressComparatorUsingCountry implements Comparator<Address> {
    @Override
    public int compare(Address address1, Address address2) {
        return address1.getCountry().compareTo(address2.getCountry());
    }
}
