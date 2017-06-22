package com.alex.solidpresentation.OCP.violation;

import android.util.Log;

import java.util.List;

/**
 * Created by Alex
 */

public class ReportManager {

    private static final String TAG = "Report bad way";

    public void print(List<Object> objects) {
        for (int i = 0; i < objects.size(); i++) {
            if(objects.get(i) instanceof CustomerModel) {
                printCustomerData((CustomerModel) objects.get(i));
            } else if(objects.get(i) instanceof PerformerModel) {
                printPerformerData((PerformerModel) objects.get(i));
            }
            // ...
        }
    }

    private void printPerformerData(PerformerModel performerModel) {
        String data = "id: " + performerModel.getId()
                + " \n name " + performerModel.getName()
                + " \n position " + performerModel.getPosition();
        Log.d(TAG, data);
    }

    private void printCustomerData(CustomerModel customerModel) {
        String data = "id: " + customerModel.getId()
                + " \n name " + customerModel.getName()
                + " \n description " + customerModel.getDescription();
        Log.d(TAG, data);
    }

}
