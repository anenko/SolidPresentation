package com.alex.solidpresentation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alex.solidpresentation.SRP.bad_way.BadActivity;
import com.alex.solidpresentation.SRP.good_way.GoodActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, GoodActivity.class);
        startActivity(intent);
    }

}
