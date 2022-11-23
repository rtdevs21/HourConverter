package com.rtdev.hourconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hourText;
    String time;

   @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hourText = findViewById(R.id.hourText);

//       HourConvert hourConvert = new HourConvert();
//
//       time = hourConvert.ConvertTo("16:17",true);
        hourText.setText(String.valueOf("16:17 to: "+time));


    }
}