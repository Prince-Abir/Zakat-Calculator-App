package com.app.zakatcalculator.calculate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.app.zakatcalculator.R;

public class ResultActivity extends AppCompatActivity {

    TextView resultTextView1, resultTextView2, resultTextView3;

    String text1, text2;
    double payableZakat = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

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
}