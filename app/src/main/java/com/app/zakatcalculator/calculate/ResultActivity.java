package com.app.zakatcalculator.calculate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.app.zakatcalculator.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

public class ResultActivity extends AppCompatActivity {

    TextView resultTextView1, resultTextView2, resultTextView3;

    String text1, text2;
    double payableZakat = 0;

    private AdView bannerAd;
    private int banner_Ad_Click_Count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        bannerAdCode();

        resultTextView1 = findViewById(R.id.resultTextView1);
        resultTextView2 = findViewById(R.id.resultTextView2);
        resultTextView3 = findViewById(R.id.resultTextView3);


        Intent intent = getIntent();
        text1 = intent.getStringExtra("ResultTextView1");
        text2 = intent.getStringExtra("ResultTextView2");
        payableZakat = intent.getExtras().getDouble("PayableZakat");


        String text3 = payableZakat + " /= BDT ";


        resultTextView1.setText(text1);
        resultTextView2.setText(text2);
        resultTextView3.setText(text3);

    }

    public void bannerAdCode() {

        //BannerAD
        bannerAd = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        bannerAd.loadAd(adRequest);

        bannerAd.setAdListener(new AdListener() {
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);
                AdRequest adRequest = new AdRequest.Builder().build();
                bannerAd.loadAd(adRequest);
            }

            @Override
            public void onAdClicked() {
                super.onAdClicked();
                banner_Ad_Click_Count++;
                if (banner_Ad_Click_Count >= 3) {
                    if (bannerAd != null) bannerAd.setVisibility(View.GONE);
                }
            }

        });
    }
}