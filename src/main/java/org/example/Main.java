package org.example;

import org.example.exceptions.CountryDeliverException;
import org.example.exceptions.PaymentException;
import org.example.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //creating addresses
        Address address1 = new Address("5", "Azatutyun", "Dilijan", "Armenia");
        Address address2 = new Address("24/4", "Azatutyun", "Yerevan", "Armenia");
        Address address3 = new Address("2", "Rustaveli Avenue", "Tbilisi", "Georgia");
        Address address4 = new Address("8", "Isahakyan", "Gyumri", "Armenia");

        //creating several customers
        Customer customer1 = new Customer("John", "Smith", "john@gmail.com", "+37488888888", address1);
        Customer customer2 = new Customer("Tatev", "Petrosyan", "tatev@gmail.com", "+3749999999", address2);
        Customer customer3 = new Customer("Jane", "Dow", "janedow@gmail.com", "+38587777", address3);

        //creating several orders for customers
        System.out.println("---------------");

        Order order1 = new ExpressOrder(1, customer1, 15000);
        customer1.printSummary();
        // order1.getCustomer().printSummary(); //kam senc grel
        order1.printSummary();

        System.out.println("---------------");
        InternationalOrder order2 = new InternationalOrder(2, customer2, 30000);
        customer2.printSummary();
        order2.printSummary();

        Order order3 = new ExpressOrder(3, customer2, 45000);
        Order order4 = new PickupOrder(4,customer1, 19500);

        InternationalOrder order5 = new InternationalOrder(5, customer3, 54000);
        ExpressOrder order6 = new ExpressOrder(6, customer2, 0);

        //Array full orders
        Order[] orders = {order1, order2, order3, order4, order5, order6};

        ArrayList<Order> ordersList = new ArrayList<>();
        ordersList.add(order1);
        ordersList.add(order2);
        ordersList.add(order3);
        ordersList.add(order4);
        ordersList.add(order5);
        ordersList.add(order6);
        System.out.println();
        System.out.println("Printing orders list");
        System.out.println("Before sorting");
        System.out.println(ordersList);
        System.out.println("After sorting");
        Collections.sort(ordersList);
        System.out.println(ordersList);


        System.out.println();
        System.out.println("-----------------");

        //Array of International orders
        InternationalOrder[] intOrders = {order2, order5};

        //Checking country for international orders
        for (InternationalOrder intOrder : intOrders) {
            try {
                intOrder.isCountryGeorgia();
            } catch (CountryDeliverException e) {
                System.out.println("We do not deliver to Georgia");
            }
        }

        //checking payment price
        System.out.println();
        System.out.println("------------------");
        for (Order order : orders) {
            try {
                order.shipment();
            } catch (PaymentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("----------");
        System.out.println(ExpressOrder.getVendor());

        //Grel foreach loop u mi toxov tpel bolor orderneri summarynery
        System.out.println("-----------");
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
        for (Order order : orders) {
            if (order instanceof ExpressOrder) {
                expressOrderCount++;

            } else if (order instanceof InternationalOrder) {
                internationalOrderCount++;
            }
        }
        System.out.println("Total orders: " + totalOrders);
        System.out.println("We have " + expressOrderCount + " express orders");
        System.out.println("We have " + internationalOrderCount + " international orders");

        System.out.println();
        //Discounts
        for (Order order : orders) {
            if (order.getCustomer().getAddress().getCountry().equals("Armenia")) {
                System.out.println(order.getId() + " You have 50% discount");
            }
        }
        //Customer Sortings
        System.out.println("-----------------");
        ArrayList<Customer> customerList = new ArrayList<>(
                Arrays.asList(customer1,customer3,customer2));
        Collections.sort(customerList, new CustomerComparatorUsingFirstName());
        System.out.println(customerList);

        System.out.println("-------------------");
        Collections.sort(customerList, new CustomerComparatorUsingLastName());
        System.out.println(customerList);

        //Address Sortings
        System.out.println();
        System.out.println("-------------------------");
        ArrayList<Address> addressList = new ArrayList<>(
                Arrays.asList(address3,address1,address2, address4));
        Collections.sort(addressList, new AddressComparatorUsingCity());
        System.out.println(addressList);
        Collections.sort(addressList, new AddressComparatorUsingCity().reversed());
        System.out.println(addressList);

        System.out.println();
        Collections.sort(addressList, new AddressComparatorUsingCountry());
        System.out.println(addressList);
    }
}
