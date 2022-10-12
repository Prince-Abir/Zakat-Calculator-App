package com.PrinceTechSolution.zakatcalculator.zakat;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.PrinceTechSolution.zakatcalculator.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;


public class AboutZakatActivity extends AppCompatActivity {

    PDFView pdfViewer;
    private AdView bannerAd;
    private int banner_Ad_Click_Count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_zakat);

        bannerAdCode();

        pdfViewer = findViewById(R.id.PdfViewer);

        pdfViewer.fromAsset("PDF/zakat.pdf").load();


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