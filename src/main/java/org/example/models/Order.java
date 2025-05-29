package org.example.models;

public class Order {
    protected String customerName;
    protected double price;

    public Order (String customerName) {
        this.customerName = customerName;
        this.price = 0;

    }
    public Order (String customerName, double price) {
        this.customerName = customerName;
        this.price = price;
    }
    public void printSummary() {
        System.out.println("Customer: " + customerName + " Price: AMD" + price);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
