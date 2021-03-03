package com.sip.gestibank;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
    }
    public void callListeDemande(View view){
        Intent i = new Intent(getApplicationContext(), ListeDemande.class);
        startActivity(i);
    }

    public void callAjouterAgent(View view){
        Intent i = new Intent(getApplicationContext(), AjouterAgent.class);
        startActivity(i);
    }
}