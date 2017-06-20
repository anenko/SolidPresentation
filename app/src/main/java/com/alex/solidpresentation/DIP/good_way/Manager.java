package com.alex.solidpresentation.DIP.good_way;

/**
 * Created by Alex
 */

public class Manager {

    private IWorker worker;

    public void setDesigner(IWorker worker) {
        this.worker = worker;
    }

    public void manage() {
        worker.work();
    }

}