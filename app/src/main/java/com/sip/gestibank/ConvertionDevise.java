package com.sip.gestibank;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.sip.gestibank.model.Currency;
import com.sip.gestibank.remote.APIUtils;
import com.sip.gestibank.remote.CurrencyService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ConvertionDevise extends AppCompatActivity {
    CurrencyService currencyService;
    double cours;
    double input;
    double res;

    EditText myData;
    TextView myRes;

    RadioGroup radioGroup;
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertion_devise);
        currencyService =  APIUtils.getCurrencyService();

        myData = (EditText) findViewById(R.id.myInput);
        myRes =(TextView ) findViewById(R.id.textViewRes);
        radioGroup = (RadioGroup) findViewById(R.id.devise);

    }

    public void getCurrency(View v){

        input = Double.parseDouble(myData.getText().toString());

        int radioButtonID = radioGroup.getCheckedRadioButtonId();

        radioButton = (RadioButton) radioGroup.findViewById(radioButtonID);
        String to = (String) radioButton.getText();

        String rul = "live?access_key=c7dd6f03f1ee260993147bfc06ab9673&currencies="+to+"&format=1/";
        Call<Currency> call = currencyService.getData(rul);
        call.enqueue(new Callback<Currency>() {
            @Override
            public void onResponse(Call<Currency> call, Response<Currency> response) {
                if(response.isSuccessful()){
                    String quotes = response.body().getQuotes().toString();
                    // récupération du cours
                    String rate = quotes.substring(quotes.indexOf("=")+1,quotes.indexOf("}"));
                    cours = Double.parseDouble(rate);
                    res = cours*input;
                    res = (double)((int)(res*100))/100;
                    myRes.setText("Résultat conversion = "+Double.valueOf(res).toString());
                }
            }

            @Override
            public void onFailure(Call<Currency> call, Throwable t) {
                Log.e("Problem: ", t.getMessage());
            }
        });

    }

}



      //  "live" endpoint - request the most recent exchange rate data

      // http://api.currencylayer.com/live

   // ? access_key = c49cfe5e27386b47eebd813934568c48
     //           & source = GBP
       //         & currencies = USD,AUD,CAD,PLN,MXN
         //       & format = 1

// Olivier, click on the URL above to get the most recent exchange
// rates for USD, AUD, CAD, PLN and MXN


