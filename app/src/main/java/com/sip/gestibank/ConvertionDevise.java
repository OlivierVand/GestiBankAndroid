package com.sip.gestibank;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ConvertionDevise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertion_devise);
    }




 public static final String API_URL = "http://api.currencylayer.com/live?acces_key=c49cfe5e27386b47eebd813934568c48";

      //  "live" endpoint - request the most recent exchange rate data

      // http://api.currencylayer.com/live

   // ? access_key = c49cfe5e27386b47eebd813934568c48
     //           & source = GBP
       //         & currencies = USD,AUD,CAD,PLN,MXN
         //       & format = 1

// Olivier, click on the URL above to get the most recent exchange
// rates for USD, AUD, CAD, PLN and MXN


}