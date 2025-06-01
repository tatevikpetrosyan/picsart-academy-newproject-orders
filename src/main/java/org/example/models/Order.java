package org.example.models;

public abstract class Order {
    protected Customer customer;
    protected double price;

    public Order (Customer customer) {
        this.customer = customer;
        this.price = 0;
    }

    public Order (Customer customer, double price) {
        this.customer = customer;
        this.price = price;
    }

    public void printSummary() {
        System.out.println("Order Price: AMD" + price);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
