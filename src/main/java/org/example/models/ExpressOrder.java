package org.example.models;

import org.example.exceptions.CountryDeliverException;

public class ExpressOrder extends Order implements Deliverable {
    private static String vendor = "DHL";
    public ExpressOrder(int id, Customer customer, double price) {
        super(id, customer, price);
    }

    @Override
    public double calculateDeliveryPrice() {
        return price * 0.1;
    }

    @Override
    public void printSummary() {
        super.printSummary();
        System.out.println("Type: Express Order. Delivery Price AMD " + calculateDeliveryPrice());
    }
    public static String getVendor() {
        return vendor;
    }
    public static void setVendor(String vendor) {
        ExpressOrder.vendor = vendor;
    }
}
