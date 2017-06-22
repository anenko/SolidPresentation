package com.alex.solidpresentation.OCP.solution;

import android.util.Log;

import java.util.List;

/**
 * Created by Alex
 */

public class ReportManager {

    private static final String TAG = "Report good way";

    public void print(List<IReport> objects) {
        for (int i = 0; i < objects.size(); i++) {
            printData(objects.get(i));
        }
    }

    private void printData(IReport iReport) {
        Log.d(TAG, iReport.getData());
    }

}
