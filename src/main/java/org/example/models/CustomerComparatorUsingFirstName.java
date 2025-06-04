package org.example.models;

import java.util.Comparator;

public class CustomerComparatorUsingFirstName  implements Comparator<Customer> {
    @Override
    public int compare(Customer customer1, Customer customer2) {
        return customer1.getFirstName().compareTo(customer2.getFirstName());
    }
}
