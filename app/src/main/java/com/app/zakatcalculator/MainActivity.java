package com.app.zakatcalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.app.zakatcalculator.calculate.CalculateActivity;
import com.app.zakatcalculator.links.LinkActivity;
import com.app.zakatcalculator.verses.QuranVersesActivity;
import com.app.zakatcalculator.video.VideoActivity;
import com.app.zakatcalculator.zakat.AboutZakatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView cardZakat;
    CardView cardVerses;
    CardView cardLinks;
    CardView cardVideo;
    CardView cardCalculate;
    CardView cardHadith;


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

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == cardZakat.getId()) {
            startActivity(new Intent(getApplicationContext(), AboutZakatActivity.class));
        } else if (v.getId() == cardVerses.getId()) {
            startActivity(new Intent(getApplicationContext(), QuranVersesActivity.class));
        } else if (v.getId() == cardLinks.getId()) {
            startActivity(new Intent(getApplicationContext(), LinkActivity.class));
        } else if (v.getId() == cardVideo.getId()) {
            startActivity(new Intent(getApplicationContext(), VideoActivity.class));
        } else if (v.getId() == cardCalculate.getId()) {
            startActivity(new Intent(getApplicationContext(), CalculateActivity.class));
        }
        else if (v.getId() == cardHadith.getId()){
            startActivity(new Intent(getApplicationContext(), HadithActivity.class));
        }

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