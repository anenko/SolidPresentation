package com.alex.solidpresentation.OCP.good_way;

/**
 * Created by Alex
 */

public class PerformerModel implements IReport {

    private int id;
    private String name;
    private String position;

    public PerformerModel(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public String getData() {
        return "id: " + id
                + " \n name " + name
                + " \n position " + position;
    }
}