package com.app.zakatcalculator.zakat;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.app.zakatcalculator.R;
import com.github.barteksc.pdfviewer.PDFView;


public class AboutZakatActivity extends AppCompatActivity {

    PDFView pdfViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_zakat);

        pdfViewer = findViewById(R.id.PdfViewer);

        pdfViewer.fromAsset("PDF/zakat.pdf").load();


    }
}