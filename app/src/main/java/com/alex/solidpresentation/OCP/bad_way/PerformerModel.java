package com.alex.solidpresentation.OCP.bad_way;

/**
 * Created by Alex
 */

public class PerformerModel {

    private int id;
    private String name;
    private String position;

    public PerformerModel(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

}