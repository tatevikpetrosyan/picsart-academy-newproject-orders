package org.example;

import org.example.models.*;

public class Main {
    public static void main(String[] args) {

        //creating addresses
        Address address1 = new Address("5", "Azatutyun", "Yerevan", "Armenia");
        Address address2 = new Address("24/4", "Azatutyun", "Yerevan", "Armenia");

        //creating 2 customers
        Customer customer1 = new Customer("John", "Smith", "john@gmail.com", "+37488888888", address1);

        Customer customer2 = new Customer("Tatev", "Petrosyan", "tatev@gmail.com", "+3749999999", address2);

        //creating several orders for customers
        System.out.println("---------------");

        Order order1 = new ExpressOrder(customer1,15000);
        customer1.printSummary();
        // order1.getCustomer().printSummary();
        order1.printSummary();

        System.out.println("---------------");
        Order order2 = new InternationalOrder(customer2, 30000);
        customer2.printSummary();
        order2.printSummary();

        Order order3 = new ExpressOrder(customer2, 45000);

        Order order4 = new PickupOrder(customer1, 19500);

        System.out.println();
        //Grel foreach loop u mi toxov tpel bolor orderneri summarynery

        System.out.println(ExpressOrder.getVendor());

        Order[] orders = {order1, order2, order3, order4};
        for (Order order : orders) {
            order.printSummary();
            order.getCustomer().printSummary();
            System.out.println("-----------------------");
        }

        System.out.println("-----------------");
        //Stugel express ordernery ev tpel
        int totalOrders = orders.length;
        int expressOrderCount = 0;
        int internationalOrderCount = 0;
        for (Order order : orders ) {
            if (order instanceof ExpressOrder) {
                expressOrderCount++;

            } else if (order instanceof InternationalOrder) {
                internationalOrderCount++;
            }
        }
        System.out.println("Total orders: " + totalOrders);
        System.out.println("We have " + expressOrderCount + " express orders");
        System.out.println("We have " + internationalOrderCount + " international orders");

        }
    }
