package com.example.raul.randomapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "OnCreate: started.");
        ImageView imageTest = (ImageView) findViewById(R.id.imageTest);

        //show image
        int imageResource = getResources().getIdentifier("@drawable/mano", null, this.getPackageName());
        imageTest.setImageResource(imageResource);
    }
}
