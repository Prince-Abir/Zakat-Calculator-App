package com.PrinceTechSolution.zakatcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {


    TextView appName;
    ImageView appIcon;
    LottieAnimationView animation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        appName = findViewById(R.id.SplashAppName);
        appIcon = findViewById(R.id.SplashIcon);
        animation = findViewById(R.id.lottieAnimation);


        appIcon.animate().translationX(-810).rotation(360).setDuration(3000).setStartDelay(0).start();
        appName.animate().translationY(-1500).setDuration(3000).setStartDelay(0).start();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();

            }
        }, 6000);
    }
}