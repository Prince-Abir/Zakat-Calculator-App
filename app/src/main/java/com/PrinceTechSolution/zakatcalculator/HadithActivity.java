package com.PrinceTechSolution.zakatcalculator;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

public class HadithActivity extends AppCompatActivity implements View.OnClickListener {

    CardView cardView1, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, cardView8, cardView9, cardView10,
            cardView11, cardView12, cardView13, cardView14, cardView15, cardView16, cardView17, cardView18, cardView19, cardView20;


    int cardView1ID, cardView2ID, cardView3ID, cardView4ID, cardView5ID, cardView6ID, cardView7ID, cardView8ID, cardView9ID, cardView10ID,
            cardView11ID, cardView12ID, cardView13ID, cardView14ID, cardView15ID, cardView16ID, cardView17ID, cardView18ID, cardView19ID, cardView20ID;


    TextView textDetails1, textDetails2, textDetails3, textDetails4, textDetails5, textDetails6, textDetails7, textDetails8, textDetails9, textDetails10,
            textDetails11, textDetails12, textDetails13, textDetails14, textDetails15, textDetails16, textDetails17, textDetails18, textDetails19, textDetails20;


    LinearLayout layout1, layout2, layout3, layout4, layout5, layout6, layout7, layout8, layout9, layout10,
            layout11, layout12, layout13, layout14, layout15, layout16, layout17, layout18, layout19, layout20;


    private AdView bannerAd;
    private int banner_Ad_Click_Count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadith);

        bannerAdCode();

        layout1 = findViewById(R.id.linearLayoutId1);
        layout2 = findViewById(R.id.linearLayoutId2);
        layout3 = findViewById(R.id.linearLayoutId3);
        layout4 = findViewById(R.id.linearLayoutId4);
        layout5 = findViewById(R.id.linearLayoutId5);
        layout6 = findViewById(R.id.linearLayoutId6);
        layout7 = findViewById(R.id.linearLayoutId7);
        layout8 = findViewById(R.id.linearLayoutId8);
        layout9 = findViewById(R.id.linearLayoutId9);
        layout10 = findViewById(R.id.linearLayoutId10);
        layout11 = findViewById(R.id.linearLayoutId11);
        layout12 = findViewById(R.id.linearLayoutId12);
        layout13 = findViewById(R.id.linearLayoutId13);
        layout14 = findViewById(R.id.linearLayoutId14);
        layout15 = findViewById(R.id.linearLayoutId15);
        layout16 = findViewById(R.id.linearLayoutId16);
        layout17 = findViewById(R.id.linearLayoutId17);
        layout18 = findViewById(R.id.linearLayoutId18);
        layout19 = findViewById(R.id.linearLayoutId19);
        layout20 = findViewById(R.id.linearLayoutId20);


        textDetails1 = findViewById(R.id.textDetails1);
        textDetails2 = findViewById(R.id.textDetails2);
        textDetails3 = findViewById(R.id.textDetails3);
        textDetails4 = findViewById(R.id.textDetails4);
        textDetails5 = findViewById(R.id.textDetails5);
        textDetails6 = findViewById(R.id.textDetails6);
        textDetails7 = findViewById(R.id.textDetails7);
        textDetails8 = findViewById(R.id.textDetails8);
        textDetails9 = findViewById(R.id.textDetails9);
        textDetails10 = findViewById(R.id.textDetails10);
        textDetails11 = findViewById(R.id.textDetails11);
        textDetails12 = findViewById(R.id.textDetails12);
        textDetails13 = findViewById(R.id.textDetails13);
        textDetails14 = findViewById(R.id.textDetails14);
        textDetails15 = findViewById(R.id.textDetails15);
        textDetails16 = findViewById(R.id.textDetails16);
        textDetails17 = findViewById(R.id.textDetails17);
        textDetails18 = findViewById(R.id.textDetails18);
        textDetails19 = findViewById(R.id.textDetails19);
        textDetails20 = findViewById(R.id.textDetails20);


        cardView1 = findViewById(R.id.cardView1);
        cardView1ID = cardView1.getId();

        cardView2 = findViewById(R.id.cardView2);
        cardView2ID = cardView2.getId();

        cardView3 = findViewById(R.id.cardView3);
        cardView3ID = cardView3.getId();

        cardView4 = findViewById(R.id.cardView4);
        cardView4ID = cardView4.getId();

        cardView5 = findViewById(R.id.cardView5);
        cardView5ID = cardView5.getId();

        cardView6 = findViewById(R.id.cardView6);
        cardView6ID = cardView6.getId();

        cardView7 = findViewById(R.id.cardView7);
        cardView7ID = cardView7.getId();

        cardView8 = findViewById(R.id.cardView8);
        cardView8ID = cardView8.getId();

        cardView9 = findViewById(R.id.cardView9);
        cardView9ID = cardView9.getId();

        cardView10 = findViewById(R.id.cardView10);
        cardView10ID = cardView10.getId();

        cardView11 = findViewById(R.id.cardView11);
        cardView11ID = cardView11.getId();

        cardView12 = findViewById(R.id.cardView12);
        cardView12ID = cardView12.getId();

        cardView13 = findViewById(R.id.cardView13);
        cardView13ID = cardView13.getId();

        cardView14 = findViewById(R.id.cardView14);
        cardView14ID = cardView14.getId();

        cardView15 = findViewById(R.id.cardView15);
        cardView15ID = cardView15.getId();

        cardView16 = findViewById(R.id.cardView16);
        cardView16ID = cardView16.getId();

        cardView17 = findViewById(R.id.cardView17);
        cardView17ID = cardView17.getId();

        cardView18 = findViewById(R.id.cardView18);
        cardView18ID = cardView18.getId();

        cardView19 = findViewById(R.id.cardView19);
        cardView19ID = cardView19.getId();

        cardView20 = findViewById(R.id.cardView20);
        cardView20ID = cardView20.getId();


        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        cardView5.setOnClickListener(this);
        cardView6.setOnClickListener(this);
        cardView7.setOnClickListener(this);
        cardView8.setOnClickListener(this);
        cardView9.setOnClickListener(this);
        cardView10.setOnClickListener(this);
        cardView11.setOnClickListener(this);
        cardView12.setOnClickListener(this);
        cardView13.setOnClickListener(this);
        cardView14.setOnClickListener(this);
        cardView15.setOnClickListener(this);
        cardView16.setOnClickListener(this);
        cardView17.setOnClickListener(this);
        cardView18.setOnClickListener(this);
        cardView19.setOnClickListener(this);
        cardView20.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        int[] cardID = {cardView1ID, cardView2ID, cardView3ID, cardView4ID, cardView5ID, cardView6ID, cardView7ID, cardView8ID, cardView9ID, cardView10ID,
                cardView11ID, cardView12ID, cardView13ID, cardView14ID, cardView15ID, cardView16ID, cardView17ID, cardView18ID, cardView19ID, cardView20ID};

        TextView[] textDetails = {textDetails1, textDetails2, textDetails3, textDetails4, textDetails5, textDetails6, textDetails7, textDetails8, textDetails9, textDetails10,
                textDetails11, textDetails12, textDetails13, textDetails14, textDetails15, textDetails16, textDetails17, textDetails18, textDetails19, textDetails20};

        LinearLayout[] allLayout = {layout1, layout2, layout3, layout4, layout5, layout6, layout7, layout8, layout9, layout10,
                layout11, layout12, layout13, layout14, layout15, layout16, layout17, layout18, layout19, layout20};


        for (int i = 0; i < cardID.length; i++) {
            if (v.getId() == cardID[i]) {
                if (textDetails[i].getVisibility() == View.GONE) {
                    allLayout[i].getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
                    TransitionManager.beginDelayedTransition(allLayout[i], new AutoTransition());
                    textDetails[i].setVisibility(View.VISIBLE);

                } else {
                    allLayout[i].getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
                    TransitionManager.beginDelayedTransition(allLayout[i], new AutoTransition());
                    textDetails[i].setVisibility(View.GONE);
                }
            }
        }

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