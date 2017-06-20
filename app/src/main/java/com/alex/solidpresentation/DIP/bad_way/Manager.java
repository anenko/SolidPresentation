package com.alex.solidpresentation.DIP.bad_way;

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

    // after design, need to add developers

    private Developer developer;

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public void manageDeveloper() {
        developer.work();
    }

    // ...
}