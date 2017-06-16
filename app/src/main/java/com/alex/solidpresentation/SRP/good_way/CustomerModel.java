package com.alex.solidpresentation.SRP.good_way;

import java.util.List;

/**
 * Created by Alex
 */

public class CustomerModel {

    private String name;
    private List<Integer> ordersOfPrices;

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
