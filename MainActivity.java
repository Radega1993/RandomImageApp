package com.example.raul.randomapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Random;

// ID de aplicación: ca-app-pub-4553067801626383~2179660140

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
            R.drawable.rand1,
            R.drawable.rand2,
            R.drawable.rand3,
            R.drawable.rand4,
            R.drawable.rand5,
            R.drawable.rand6,
            R.drawable.rand7,
            R.drawable.rand8,
            R.drawable.rand9,
            R.drawable.rand10,
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

        /**
         * adds
         */
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
