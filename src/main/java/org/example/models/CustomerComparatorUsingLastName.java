package org.example.models;

import java.util.Comparator;

public class CustomerComparatorUsingLastName implements Comparator<Customer> {
    @Override
    public int compare(Customer customer1, Customer customer2) {
        return customer1.getLastName().compareTo(customer2.getLastName());
    }
}
