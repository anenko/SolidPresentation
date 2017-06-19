package com.alex.solidpresentation.OCP.bad_way;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alex.solidpresentation.R;

import java.util.ArrayList;
import java.util.List;

public class BadOCPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bad_ocp);
        print();
    }

    private void print() {
        List<Object> objects = new ArrayList<>();
        objects.add(new CustomerModel(0, "User Test 1", "..."));
        objects.add(new PerformerModel(0, "Performer 1", "dev"));
        objects.add(new PerformerModel(1, "Performer 2", "dev"));
        objects.add(new CustomerModel(1, "User Test 2", "..."));
        objects.add(new CustomerModel(2, "User Test 3", "..."));
        objects.add(new PerformerModel(2, "Performer 3", "qa"));

        ReportManager reportManager = new ReportManager();
        reportManager.print(objects);
    }

}