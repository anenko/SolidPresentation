package com.alex.solidpresentation.SRP.violation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Alex
 */

public class CustomerModel {

    private String name;
    private List<Integer> ordersOfPrices;

    public CustomerModel saveCustomer(int i) {
        // saving customer to the DB
        CustomerModel customer = new CustomerModel();
        customer.setName("Guest " + i);
        List<Integer> ordersOfPrices = new ArrayList<>();
        Random random = new Random();
        for (int j = 0; j < 5; j++) {
            ordersOfPrices.add(random.nextInt(1000));
        }
        customer.setOrdersOfPrices(ordersOfPrices);
        return customer;
    }

    public List<CustomerModel> getAllCustomers() {
        // restoring all customers from the DB
        List<CustomerModel> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(saveCustomer(i));
        }
        return list;
    }

    public void printReport() {
        // making report by all customers
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getOrdersOfPrices() {
        return ordersOfPrices;
    }

    public void setOrdersOfPrices(List<Integer> ordersOfPrices) {
        this.ordersOfPrices = ordersOfPrices;
    }

}
