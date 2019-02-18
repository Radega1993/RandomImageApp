package com.example.raul.randomapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.util.Random;

/**
 * clase principal donde se hace el random de las imagenes.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * tags para imagenes.
     */
    private static final String TAG = "MainActivity";

    /**
     * variable para guardar las imagenes.
     */
    private ImageView imageView;

    /**
     * variable para hacer el random.
     */
    private Random r;

    /**
     * array de imagenes.
     */
    private Integer[] images = {
      R.drawable.mano,
      R.drawable.paloma,
      R.drawable.perro,
    };

    /**
     * funcion para mostar imagen random
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "OnCreate: started.");

        imageView = (ImageView) findViewById(R.id.imageTest);

        r = new Random();
        //show image
        imageView.setImageResource(images[r.nextInt(images.length)]);
    }
}
