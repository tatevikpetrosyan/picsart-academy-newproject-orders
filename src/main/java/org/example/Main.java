package org.example;

import org.example.models.Customer;
import org.example.models.ExpressOrder;
import org.example.models.InternationalOrder;
import org.example.models.Order;

public class Main {
    public static void main(String[] args) {

        //creating 2 customers
        Customer customer1 = new Customer();
        customer1.setName("Tatev");
        customer1.setMobile("095-54477");
        customer1.setAddress("Yerevan, Azatutyan 24");
        System.out.println("Customer is successfully created " + customer1.getName());
        System.out.println();

        Customer customer2 = new Customer();
        customer2.setName("Anna");
        customer2.setAddress("Yerevan, Aharonyan 8");
        customer2.setMobile("094-55587");
        System.out.println("Customer is successfully created " + customer1.getName());
        System.out.println();

        //creating several orders for customers
        System.out.println("---------------");
        ExpressOrder order1 = new ExpressOrder(customer1,15000);
        order1.printSummary();

        InternationalOrder order2 = new InternationalOrder(customer2, 30000);
        order2.printSummary();

        ExpressOrder order3 = new ExpressOrder(customer2, 45000);

        System.out.println();
        //Grel foreach loop u mi toxov tpel bolor orderneri summarynery

        Order[] orders = {order1, order2, order3};
        for ( Order order : orders) {
            order.printSummary();
        }

        //Stugel express ordernery ev tpel
        int count = 0;
        for ( Order order : orders ) {
            if (order instanceof ExpressOrder) {
                count++;
            }

        }
        System.out.println("We have " + count + " express orders");
    }
}