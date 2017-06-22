package com.alex.solidpresentation.DIP.violation;

/**
 * Created by Alex
 */

public class Manager {

    private Designer designer;

    public void setDesigner(Designer designer) {
        this.designer = designer;
    }

    public void manage() {
        designer.work();
    }

    // after design, need to add developer

    private Developer developer;

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public void manageDeveloper() {
        developer.work();
    }

    // ...
}