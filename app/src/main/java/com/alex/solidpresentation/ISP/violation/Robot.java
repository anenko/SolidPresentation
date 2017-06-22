package com.alex.solidpresentation.ISP.violation;

/**
 * Created by Alex
 */

public class Robot implements IWorker {

    @Override
    public void work() {
        // have work
    }

    @Override
    public void eating() {
        // no need to eat
    }

    @Override
    public void payment() {
        // doesn't have payment
    }

    @Override
    public void repair() {
        // sometimes need to repair
    }

}