package com.alex.solidpresentation.LSP.violation;

/**
 * Created by Alex
 */

public class Kiwi extends Bird {

    public Kiwi(int age, float weight, String habitats) {
        super(age, weight, habitats);
    }

    public void fly() {
        throw new UnsupportedOperationException();
    }

}