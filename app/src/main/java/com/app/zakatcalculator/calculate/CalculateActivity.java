package com.app.zakatcalculator.calculate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.app.zakatcalculator.R;

public class CalculateActivity extends AppCompatActivity {

    EditText editText1, editText2, editText3, editText4, editText5, editText6, editText7, editText8, editText9, editText10;
    Button calculateButton;
    private double valueOne = 0;
    private double valueTwo = 0;
    private double valueThree = 0;
    private double valueFour = 0;
    private double valueFive = 0;
    private double valueSix = 0;
    private double valueSeven = 0;
    private double valueEight = 0;
    private double valueNine = 0;
    private double valueTen = 0;
    private double zakatAmount = 0;
    private double payableZakat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        editText1 = findViewById(R.id.editText1Id);
        editText2 = findViewById(R.id.editText2Id);
        editText3 = findViewById(R.id.editText3Id);
        editText4 = findViewById(R.id.editText4Id);
        editText5 = findViewById(R.id.editText5Id);
        editText6 = findViewById(R.id.editText6Id);
        editText7 = findViewById(R.id.editText7Id);
        editText8 = findViewById(R.id.editText8Id);
        editText9 = findViewById(R.id.editText9Id);
        editText10 = findViewById(R.id.editText10Id);

        calculateButton = findViewById(R.id.CalculateButtonId);

        editText1.setText("0");
        editText2.setText("0");
        editText3.setText("0");
        editText4.setText("0");
        editText5.setText("0");
        editText6.setText("0");
        editText7.setText("0");
        editText8.setText("0");
        editText9.setText("0");
        editText10.setText("0");


        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText1.getText().toString().isEmpty() | editText2.getText().toString().isEmpty() | editText3.getText().toString().isEmpty()
                        | editText4.getText().toString().isEmpty() | editText5.getText().toString().isEmpty() | editText6.getText().toString().isEmpty() | editText7.getText().toString().isEmpty() |
                        editText8.getText().toString().isEmpty() | editText9.getText().toString().isEmpty() | editText10.getText().toString().isEmpty()) {

                    Toast.makeText(getApplicationContext(), "Please fill all the fields", Toast.LENGTH_SHORT).show();

                } else {


                    valueOne = Integer.parseInt(editText1.getText().toString());
                    valueTwo = Integer.parseInt(editText2.getText().toString());
                    valueThree = Integer.parseInt(editText3.getText().toString());
                    valueFour = Integer.parseInt(editText4.getText().toString());
                    valueFive = Integer.parseInt(editText5.getText().toString());
                    valueSix = Integer.parseInt(editText6.getText().toString());
                    valueSeven = Integer.parseInt(editText7.getText().toString());
                    valueEight = Integer.parseInt(editText8.getText().toString());
                    valueNine = Integer.parseInt(editText9.getText().toString());
                    valueTen = Integer.parseInt(editText10.getText().toString());


                    zakatAmount = (valueOne + valueTwo + valueThree + valueFour + valueFive + valueSix + valueSeven) - (valueEight + valueNine + valueTen);


                    if (zakatAmount >= 41250 && zakatAmount < 433990) {


                        payableZakat = (zakatAmount * 2.5) / 100;


                        Intent intent = new Intent(CalculateActivity.this, ResultActivity.class);
                        intent.putExtra("ResultTextView1", "Your payable zakat based on silver Nisab");
                        intent.putExtra("ResultTextView2", "Your Payable Zakat");
                        intent.putExtra("PayableZakat", payableZakat);
                        startActivity(intent);


                    } else if (zakatAmount >= 433990) {


                        payableZakat = (zakatAmount * 2.5) / 100;


                        Intent intent = new Intent(CalculateActivity.this, ResultActivity.class);
                        intent.putExtra("ResultTextView1", "Your payable zakat based on Gold Nisab");
                        intent.putExtra("ResultTextView2", "Your Payable Zakat");
                        intent.putExtra("PayableZakat", payableZakat);
                        startActivity(intent);

                    } else {

                        Intent intent = new Intent(CalculateActivity.this, ResultActivity.class);
                        intent.putExtra("ResultTextView1", "");
                        intent.putExtra("ResultTextView2", "Your Payable Zakat");
                        intent.putExtra("PayableZakat", 0);
                        startActivity(intent);

                    }

                }


            }
        });


    }
}