package com.rtdev.hourconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hourText;
    ConvertTo convertTo = new ConvertTo();
   @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hourText = findViewById(R.id.hourText);

        String time = convertTo.ConvertTo("16:17",true);
        hourText.setText(String.valueOf("16:17 to: "+time));


    }
}