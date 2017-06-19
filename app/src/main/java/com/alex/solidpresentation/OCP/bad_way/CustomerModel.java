package com.alex.solidpresentation.OCP.bad_way;

/**
 * Created by Alex
 */

public class CustomerModel {

    private int id;
    private String name;
    private String description;

    public CustomerModel(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}