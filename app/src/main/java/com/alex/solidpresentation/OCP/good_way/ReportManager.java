package com.alex.solidpresentation.OCP.good_way;

import android.util.Log;

import com.alex.solidpresentation.OCP.bad_way.CustomerModel;
import com.alex.solidpresentation.OCP.bad_way.PerformerModel;

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
