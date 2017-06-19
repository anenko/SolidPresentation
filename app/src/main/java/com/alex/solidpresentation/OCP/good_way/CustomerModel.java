package com.alex.solidpresentation.OCP.good_way;

/**
 * Created by Alex
 */

public class CustomerModel implements IReport {

    private int id;
    private String name;
    private String description;

    public CustomerModel(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public String getData() {
        return "id: " + id
                + " \n name " + name
                + " \n description " + description;
    }

}