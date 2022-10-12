package com.PrinceTechSolution.zakatcalculator.links;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.PrinceTechSolution.zakatcalculator.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

public class LinkActivity extends AppCompatActivity implements View.OnClickListener {

    private AdView bannerAd;
    private int banner_Ad_Click_Count = 0;


    TextView WebLinkButton1Id, WebLinkButton2Id, WebLinkButton3Id, WebLinkButton4Id, WebLinkButton5Id, WebLinkButton6Id, WebLinkButton7Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);

        bannerAdCode();

        WebLinkButton1Id = findViewById(R.id.WebLinkButton1Id);
        WebLinkButton2Id = findViewById(R.id.WebLinkButton2Id);
        WebLinkButton3Id = findViewById(R.id.WebLinkButton3Id);
        WebLinkButton4Id = findViewById(R.id.WebLinkButton4Id);
        WebLinkButton5Id = findViewById(R.id.WebLinkButton5Id);
        WebLinkButton6Id = findViewById(R.id.WebLinkButton6Id);
        WebLinkButton7Id = findViewById(R.id.WebLinkButton7Id);


        WebLinkButton1Id.setOnClickListener(LinkActivity.this);
        WebLinkButton2Id.setOnClickListener(LinkActivity.this);
        WebLinkButton3Id.setOnClickListener(LinkActivity.this);
        WebLinkButton4Id.setOnClickListener(LinkActivity.this);
        WebLinkButton5Id.setOnClickListener(LinkActivity.this);
        WebLinkButton6Id.setOnClickListener(LinkActivity.this);
        WebLinkButton7Id.setOnClickListener(LinkActivity.this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == WebLinkButton1Id.getId()) {

            setLink("https://theconversation.com/what-is-zakat-a-scholar-of-islam-explains-170756");

        } else if (v.getId() == WebLinkButton2Id.getId()) {

            setLink("https://www.upliftcharity.org/importance-of-zakat");

        } else if (v.getId() == WebLinkButton3Id.getId()) {

            setLink("https://www.islamic-relief.org/zakat/");
        } else if (v.getId() == WebLinkButton4Id.getId()) {

            setLink("https://www.zakat.org/what-is-zakat");

        } else if (v.getId() == WebLinkButton5Id.getId()) {

            setLink("https://onepathnetwork.com/the-pillar-of-zakat-abu-adnan/?gclid=Cj0KCQiA2sqOBhCGARIsAPuPK0gzEQHsCmA3-KacZqQTqnoDw53OLTiWpaEZvpWQnnKhYi4Q6siX1qsaAkKLEALw_wcB");

        } else if (v.getId() == WebLinkButton6Id.getId()) {

            setLink("https://www.ekushey-tv.com/%E0%A6%AF%E0%A6%BE%E0%A6%95%E0%A6%BE%E0%A6%A4-%E0%A6%95%E0%A7%80-%E0%A6%93-%E0%A6%95%E0%A7%87%E0%A6%A8/127417#:~:text=%E0%A6%AF%E0%A6%BE%E0%A6%95%E0%A6%BE%E0%A6%A4%20%E0%A6%B6%E0%A6%AC%E0%A7%8D%E0%A6%A6%E0%A7%87%E0%A6%B0%20%E0%A6%85%E0%A6%B0%E0%A7%8D%E0%A6%A5%20%E0%A6%AA%E0%A6%AC%E0%A6%BF%E0%A6%A4%E0%A7%8D%E0%A6%B0%20%E0%A6%95%E0%A6%B0%E0%A6%BE%2C%20%E0%A6%AA%E0%A6%B0%E0%A6%BF%E0%A6%B6%E0%A7%81%E0%A6%A6%E0%A7%8D%E0%A6%A7%20%E0%A6%95%E0%A6%B0%E0%A6%BE%20%E0%A6%AC%E0%A6%BE%20%E0%A6%AA%E0%A7%8D%E0%A6%B0%E0%A6%AC%E0%A7%83%E0%A6%A6%E0%A7%8D%E0%A6%A7%E0%A6%BF%20%E0%A6%A6%E0%A6%BE%E0%A6%A8%20%E0%A6%95%E0%A6%B0%E0%A6%BE%E0%A5%A4&text=%E0%A6%8F%E0%A6%95%20%E0%A6%95%E0%A6%A5%E0%A6%BE%E0%A6%AF%E0%A6%BC%20%E0%A6%95%E0%A7%8B%E0%A6%A8%E0%A7%8B%20%E0%A6%AE%E0%A7%81%E0%A6%B8%E0%A6%B2%E0%A6%AE%E0%A6%BE%E0%A6%A8%20%E0%A6%86%E0%A6%B2%E0%A7%8D%E0%A6%B2%E0%A6%BE%E0%A6%B9,%E0%A6%AA%E0%A7%8C%E0%A6%81%E0%A6%9B%E0%A7%87%20%E0%A6%A6%E0%A7%87%E0%A6%AF%E0%A6%BC%E0%A6%BE%E0%A6%95%E0%A7%87%20%E0%A6%AF%E0%A6%BE%E0%A6%95%E0%A6%BE%E0%A6%A4%20%E0%A6%AC%E0%A6%B2%E0%A6%BE%20%E0%A6%B9%E0%A6%AF%E0%A6%BC%E0%A5%A4");

        } else if (v.getId() == WebLinkButton7Id.getId()) {

            setLink("https://www.investopedia.com/terms/z/zakat.asp");

        }

    }

    private void setLink(String link) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(link)));

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