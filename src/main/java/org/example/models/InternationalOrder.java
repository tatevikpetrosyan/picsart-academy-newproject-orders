package org.example.models;

import org.example.exceptions.CountryDeliverException;

public class InternationalOrder extends Order implements Deliverable {
    private static String vendor = "Fedex";
    public InternationalOrder(int id, Customer customer, double price) {
        super(id, customer, price);
    }

    @Override
    public double calculateDeliveryPrice() {
        return price * 0.2;
    }
    //checking country
    public boolean isCountryGeorgia() {
        if (customer.getAddress().getCountry().equals("Georgia")) {
            throw new CountryDeliverException("We don't deliver to Georgia");
        } else {
            return false;
        }
    }

    public void printSummary(){
        super.printSummary();
        System.out.println("Type: International Order. Delivery Price AMD " + calculateDeliveryPrice());
    }
    public static String getVendor() {
        return vendor;
    }
}
