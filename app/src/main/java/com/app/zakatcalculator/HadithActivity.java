package com.app.zakatcalculator;

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
import com.google.android.gms.ads.interstitial.InterstitialAd;

public class HadithActivity extends AppCompatActivity implements View.OnClickListener {

    CardView cardView1, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, cardView8, cardView9, cardView10,
            cardView11, cardView12, cardView13, cardView14, cardView15, cardView16, cardView17, cardView18, cardView19, cardView20,
            cardView21, cardView22, cardView23, cardView24, cardView25, cardView26, cardView27, cardView28, cardView29, cardView30,
            cardView31, cardView32, cardView33, cardView34, cardView35, cardView36, cardView37, cardView38, cardView39, cardView40,
            cardView41, cardView42, cardView43, cardView44, cardView45, cardView46, cardView47, cardView48, cardView49, cardView50;

    int cardView1ID, cardView2ID, cardView3ID, cardView4ID, cardView5ID, cardView6ID, cardView7ID, cardView8ID, cardView9ID, cardView10ID,
            cardView11ID, cardView12ID, cardView13ID, cardView14ID, cardView15ID, cardView16ID, cardView17ID, cardView18ID, cardView19ID, cardView20ID,
            cardView21ID, cardView22ID, cardView23ID, cardView24ID, cardView25ID, cardView26ID, cardView27ID, cardView28ID, cardView29ID, cardView30ID,
            cardView31ID, cardView32ID, cardView33ID, cardView34ID, cardView35ID, cardView36ID, cardView37ID, cardView38ID, cardView39ID, cardView40ID,
            cardView41ID, cardView42ID, cardView43ID, cardView44ID, cardView45ID, cardView46ID, cardView47ID, cardView48ID, cardView49ID, cardView50ID;

    TextView textDetails1, textDetails2, textDetails3, textDetails4, textDetails5, textDetails6, textDetails7, textDetails8, textDetails9, textDetails10,
            textDetails11, textDetails12, textDetails13, textDetails14, textDetails15, textDetails16, textDetails17, textDetails18, textDetails19, textDetails20,
            textDetails21, textDetails22, textDetails23, textDetails24, textDetails25, textDetails26, textDetails27, textDetails28, textDetails29, textDetails30,
            textDetails31, textDetails32, textDetails33, textDetails34, textDetails35, textDetails36, textDetails37, textDetails38, textDetails39, textDetails40,
            textDetails41, textDetails42, textDetails43, textDetails44, textDetails45, textDetails46, textDetails47, textDetails48, textDetails49, textDetails50;


    LinearLayout layout1, layout2, layout3, layout4, layout5, layout6, layout7, layout8, layout9, layout10,
            layout11, layout12, layout13, layout14, layout15, layout16, layout17, layout18, layout19, layout20,
            layout21, layout22, layout23, layout24, layout25, layout26, layout27, layout28, layout29, layout30,
            layout31, layout32, layout33, layout34, layout35, layout36, layout37, layout38, layout39, layout40,
            layout41, layout42, layout43, layout44, layout45, layout46, layout47, layout48, layout49, layout50;



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
        layout21 = findViewById(R.id.linearLayoutId21);
        layout22 = findViewById(R.id.linearLayoutId22);
        layout23 = findViewById(R.id.linearLayoutId23);
        layout24 = findViewById(R.id.linearLayoutId24);
        layout25 = findViewById(R.id.linearLayoutId25);
        layout26 = findViewById(R.id.linearLayoutId26);
        layout27 = findViewById(R.id.linearLayoutId27);
        layout28 = findViewById(R.id.linearLayoutId28);
        layout29 = findViewById(R.id.linearLayoutId29);
        layout30 = findViewById(R.id.linearLayoutId30);
        layout31 = findViewById(R.id.linearLayoutId31);
        layout32 = findViewById(R.id.linearLayoutId32);
        layout33 = findViewById(R.id.linearLayoutId33);
        layout34 = findViewById(R.id.linearLayoutId34);
        layout35 = findViewById(R.id.linearLayoutId35);
        layout36 = findViewById(R.id.linearLayoutId36);
        layout37 = findViewById(R.id.linearLayoutId37);
        layout38 = findViewById(R.id.linearLayoutId38);
        layout39 = findViewById(R.id.linearLayoutId39);
        layout40 = findViewById(R.id.linearLayoutId40);
        layout41 = findViewById(R.id.linearLayoutId41);
        layout42 = findViewById(R.id.linearLayoutId42);
        layout43 = findViewById(R.id.linearLayoutId43);
        layout44 = findViewById(R.id.linearLayoutId44);
        layout45 = findViewById(R.id.linearLayoutId45);
        layout46 = findViewById(R.id.linearLayoutId46);
        layout47 = findViewById(R.id.linearLayoutId47);
        layout48 = findViewById(R.id.linearLayoutId48);
        layout49 = findViewById(R.id.linearLayoutId49);
        layout50 = findViewById(R.id.linearLayoutId50);


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
        textDetails21 = findViewById(R.id.textDetails21);
        textDetails22 = findViewById(R.id.textDetails22);
        textDetails23 = findViewById(R.id.textDetails23);
        textDetails24 = findViewById(R.id.textDetails24);
        textDetails25 = findViewById(R.id.textDetails25);
        textDetails26 = findViewById(R.id.textDetails26);
        textDetails27 = findViewById(R.id.textDetails27);
        textDetails28 = findViewById(R.id.textDetails28);
        textDetails29 = findViewById(R.id.textDetails29);
        textDetails30 = findViewById(R.id.textDetails30);
        textDetails31 = findViewById(R.id.textDetails31);
        textDetails32 = findViewById(R.id.textDetails32);
        textDetails33 = findViewById(R.id.textDetails33);
        textDetails34 = findViewById(R.id.textDetails34);
        textDetails35 = findViewById(R.id.textDetails35);
        textDetails36 = findViewById(R.id.textDetails36);
        textDetails37 = findViewById(R.id.textDetails37);
        textDetails38 = findViewById(R.id.textDetails38);
        textDetails39 = findViewById(R.id.textDetails39);
        textDetails40 = findViewById(R.id.textDetails40);
        textDetails41 = findViewById(R.id.textDetails41);
        textDetails42 = findViewById(R.id.textDetails42);
        textDetails43 = findViewById(R.id.textDetails43);
        textDetails44 = findViewById(R.id.textDetails44);
        textDetails45 = findViewById(R.id.textDetails45);
        textDetails46 = findViewById(R.id.textDetails46);
        textDetails47 = findViewById(R.id.textDetails47);
        textDetails48 = findViewById(R.id.textDetails48);
        textDetails49 = findViewById(R.id.textDetails49);
        textDetails50 = findViewById(R.id.textDetails50);


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