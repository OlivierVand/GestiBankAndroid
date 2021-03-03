package com.sip.gestibank;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        }
    public void callSAccueil(View view){
        Intent i = new Intent(getApplicationContext(), Accueil.class);
        startActivity(i);
    }
    public void callSDevise(View view){
        Intent i = new Intent(getApplicationContext(), ConvertionDevise.class);
        startActivity(i);
    }

    public void callSCreationCompte(View view){
        Intent i = new Intent(getApplicationContext(), creationCompte.class);
        startActivity(i);
    }

    public void callAdmin(View view){
        Intent i = new Intent(getApplicationContext(), Admin.class);
        startActivity(i);
    }

}