package org.example;

import org.example.models.ExpressOrder;

public class Main {
    public static void main(String[] args) {
        ExpressOrder order = new ExpressOrder("John Smith", 1500);
        order.printSummary();

    }
}