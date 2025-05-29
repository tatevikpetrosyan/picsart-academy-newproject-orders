package org.example.models;

public class ExpressOrder extends Order implements Deliverable {

    public ExpressOrder(String customerName, double price) {
        super(customerName, price);

    }
    @Override
    public double calculateDeliveryPrice() {
        return price * 0.1;
    }

    @Override
    public void printSummary() {
        super.printSummary();
        System.out.println("Type: Express Order. Delivery Price AMD" + calculateDeliveryPrice());
    }
}
