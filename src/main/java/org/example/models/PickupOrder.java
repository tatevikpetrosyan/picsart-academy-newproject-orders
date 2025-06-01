package org.example.models;

public class PickupOrder extends Order{

    public PickupOrder(Customer customer, double price) {
        super(customer, price);
    }

    public void printSummary() {
        super.printSummary();
        System.out.println("It is Pickup order without delivery");
    }

}
