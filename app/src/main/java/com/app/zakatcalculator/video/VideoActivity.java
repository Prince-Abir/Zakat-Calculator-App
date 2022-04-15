package com.app.zakatcalculator.video;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.app.zakatcalculator.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

public class VideoActivity extends AppCompatActivity {

//    YouTubePlayerView videoView1,videoView2,videoView3,videoView4,videoView5,videoView6;

    private AdView bannerAd;
    private int banner_Ad_Click_Count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        bannerAdCode();


//        videoView1 = findViewById(R.id.VideoView1);
//        videoView2 = findViewById(R.id.VideoView2);
//        videoView3 = findViewById(R.id.VideoView3);
//        videoView4 = findViewById(R.id.videoView4);
//        videoView5 = findViewById(R.id.VideoView5);
//        videoView6 = findViewById(R.id.VideoView6);
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