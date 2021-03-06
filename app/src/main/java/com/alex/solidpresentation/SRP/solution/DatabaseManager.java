package com.alex.solidpresentation.SRP.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Alex
 */

public class DatabaseManager implements IDatabaseManager {

    @Override
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

    @Override
    public List<CustomerModel> getAllCustomers() {
        // restoring all customers from the DB
        List<CustomerModel> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            // for mock data
            list.add(saveCustomer(i));
        }
        return list;
    }

}
