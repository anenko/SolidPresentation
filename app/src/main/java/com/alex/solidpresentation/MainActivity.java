package com.alex.solidpresentation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alex.solidpresentation.OCP.bad_way.BadOCPActivity;
import com.alex.solidpresentation.OCP.good_way.GoodOCPActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, GoodOCPActivity.class);
        startActivity(intent);
    }

}
