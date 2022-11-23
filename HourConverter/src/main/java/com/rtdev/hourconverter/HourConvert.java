package com.rtdev.hourconverter;

import android.annotation.SuppressLint;

public class HourConvert {

    @SuppressLint("NotConstructor")
    public String ConvertTo(String times, Boolean with_AMPM ) {

        String set = "am";
        String[] time1 = times.split(":");
        String hh1 = time1[0].trim();
        String mm1 = time1[1].trim();

        if (hh1.contains("13")) {
            hh1= hh1.replace("13", "1");
            set = "pm";
        } else if (hh1.contains("14")) {
            hh1= hh1.replace("14", "2");
            set = "pm";
        } else if (hh1.contains("15")) {
            hh1= hh1.replace("15", "3");
            set = "pm";
        } else if (hh1.contains("16")) {
            hh1= hh1.replace("16", "4");
            set = "pm";
        } else if (hh1.contains("17")) {
            hh1= hh1.replace("17", "5");
            set = "pm";
        } else if (hh1.contains("18")) {
            hh1= hh1.replace("18", "6");
            set = "pm";
        } else if (hh1.contains("19")) {
            hh1= hh1.replace("19", "7");
            set = "pm";
        } else if (hh1.contains("20")) {
            hh1= hh1.replace("20", "8");
            set = "pm";
        } else if (hh1.contains("21")) {
            hh1= hh1.replace("21", "9");
            set = "pm";
        } else if (hh1.contains("22")) {
            hh1= hh1.replace("22", "10");
            set = "pm";
        } else if (hh1.contains("23")) {
            hh1= hh1.replace("23", "11");
            set = "pm";
        } else if (hh1.contains("24")) {
            hh1= hh1.replace("24", "12");
            set = "pm";
        }
//        Log.e("TAG", "HourConvert: "+hh1+":"+mm1+ "" +set );
        if (with_AMPM){
            return hh1+":"+mm1+"";
        }else{
            return hh1+":"+mm1+ "" +set;
        }

    }
}
