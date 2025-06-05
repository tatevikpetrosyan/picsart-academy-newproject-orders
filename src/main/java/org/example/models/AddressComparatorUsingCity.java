package org.example.models;

import java.util.Comparator;

public class AddressComparatorUsingCity implements Comparator<Address> {
    @Override
    public int compare(Address address1, Address address2) {
        return address1.getCity().compareTo(address2.getCity());
    }
}
