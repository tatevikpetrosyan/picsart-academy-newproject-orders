package org.example.models;

import org.example.exceptions.PaymentException;

public abstract class Order {
    protected int id;
    protected Customer customer;
    protected double price;

    public Order (int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.price = 0;
    }

    public Order (int id, Customer customer, double price) {
        this.id = id;
        this.customer = customer;
        this.price = price;
    }

    public void printSummary() {
        System.out.println("Order Price: AMD" + price);
    }

    public void shipment(){
        if (price <= 0) {
            throw new PaymentException("Please make a payment for " + getId());
        }
        System.out.println("Shipment started for " + getId());
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
