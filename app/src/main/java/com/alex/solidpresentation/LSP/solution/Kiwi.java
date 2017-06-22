package com.alex.solidpresentation.LSP.solution;

/**
 * Created by Alex
 */

public class Kiwi extends NonFlightBird {

    public Kiwi(int age, float weight, String habitats) {
        super(age, weight, habitats);
    }

    public void fly() {
        throw new UnsupportedOperationException();
    }

}