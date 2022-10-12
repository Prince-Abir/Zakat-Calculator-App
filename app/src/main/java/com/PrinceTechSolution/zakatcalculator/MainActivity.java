package com.PrinceTechSolution.zakatcalculator;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.PrinceTechSolution.zakatcalculator.calculate.CalculateActivity;
import com.PrinceTechSolution.zakatcalculator.links.LinkActivity;
import com.PrinceTechSolution.zakatcalculator.verses.QuranVersesActivity;
import com.PrinceTechSolution.zakatcalculator.video.VideoActivity;
import com.PrinceTechSolution.zakatcalculator.zakat.AboutZakatActivity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView cardZakat;
    CardView cardVerses;
    CardView cardLinks;
    CardView cardVideo;
    CardView cardCalculate;
    CardView cardHadith;

    int range = 10;
    int randomNumber = 0;
    private AdView bannerAd;
    private InterstitialAd mInterstitialAd;
    private int banner_Ad_Click_Count = 0;


    public boolean InternetConnectionCheck() {

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }


    public void AlertDialogShowing() {

        new AlertDialog.Builder(MainActivity.this)
                .setTitle("No Internet Connection!")
                .setMessage("Please check your internet connection")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create()
                .show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardZakat = findViewById(R.id.CardZakatId);
        cardVerses = findViewById(R.id.CardVersesId);
        cardLinks = findViewById(R.id.CardLinksId);
        cardVideo = findViewById(R.id.CardVideosId);
        cardCalculate = findViewById(R.id.CardCalculateId);
        cardHadith = findViewById(R.id.CardHadithId);


        cardZakat.setOnClickListener(this);
        cardVerses.setOnClickListener(this);
        cardLinks.setOnClickListener(this);
        cardVideo.setOnClickListener(this);
        cardCalculate.setOnClickListener(this);
        cardHadith.setOnClickListener(this);


        //Google Ad Initialization
        MobileAds.initialize(getApplicationContext(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {

            }
        });

        bannerAdCode();

    }

    @Override
    public void onClick(View v) {

        if (InternetConnectionCheck()) {


            if (v.getId() == cardZakat.getId()) {
                startActivity(new Intent(getApplicationContext(), AboutZakatActivity.class));
                interstitialAdCode();

            } else if (v.getId() == cardVerses.getId()) {

                startActivity(new Intent(getApplicationContext(), QuranVersesActivity.class));
                interstitialAdCode();
            } else if (v.getId() == cardLinks.getId()) {
                startActivity(new Intent(getApplicationContext(), LinkActivity.class));
                interstitialAdCode();
            } else if (v.getId() == cardVideo.getId()) {
                startActivity(new Intent(getApplicationContext(), VideoActivity.class));
                interstitialAdCode();
            } else if (v.getId() == cardCalculate.getId()) {
                startActivity(new Intent(getApplicationContext(), CalculateActivity.class));
                interstitialAdCode();
            } else if (v.getId() == cardHadith.getId()) {
                startActivity(new Intent(getApplicationContext(), HadithActivity.class));
                interstitialAdCode();
            }
        } else {
            AlertDialogShowing();
        }

    }


    public void interstitialAdCode() {

        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(getApplicationContext(), getString(R.string.interstatialId), adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        Random random = new Random();
                        randomNumber = random.nextInt(range);
                        if (randomNumber == 1 || randomNumber == 2 || randomNumber == 4 || randomNumber == 7 || randomNumber == 9) {
                            mInterstitialAd.show(MainActivity.this);
                        }
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.i("TAG", loadAdError.getMessage());
                        mInterstitialAd = null;
                        InterstitialAd.load(getApplicationContext(), getString(R.string.interstatialId), adRequest,
                                new InterstitialAdLoadCallback() {
                                    @Override
                                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                        // The mInterstitialAd reference will be null until
                                        // an ad is loaded.
                                        mInterstitialAd = interstitialAd;
                                        Random random = new Random();
                                        randomNumber = random.nextInt(range);
                                        if (randomNumber == 1 || randomNumber == 2 || randomNumber == 4 || randomNumber == 7 || randomNumber == 9) {
                                            mInterstitialAd.show(MainActivity.this);
                                        }
                                    }

                                    @Override
                                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                                        // Handle the error
                                        mInterstitialAd = null;
                                    }
                                });
                    }

                });

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

    @Override
    public void onBackPressed() {
//        super.onBackPressed();

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);

        alertDialog.setIcon(R.drawable.exit);
        alertDialog.setCancelable(true);
        alertDialog.setTitle("Exit");
        alertDialog.setMessage("Do you want to close Zakat Calculator?");
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finishAndRemoveTask();
            }
        });

        alertDialog.show();

    }


}

