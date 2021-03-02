package com.sip.gestibank;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Accueil extends AppCompatActivity {

    List<String> region = new ArrayList<String>();
    Spinner spinner;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_accueil);

        //Récupération du Spinner déclaré dans le fichier main.xml de res/layout
        spinner = (Spinner) findViewById(R.id.spinnerRegion);
        //Création d'une liste d'élément à mettre dans le Spinner(pour l'exemple)


      region.add("Ile de France");
      region.add("Bretagne");
      region.add("Occitanie");
      region.add("Auvergne-Rhône-Alpes");





        /*Le Spinner a besoin d'un adapter pour sa presentation alors on lui passe le context(this) et
                un fichier de presentation par défaut( android.R.layout.simple_spinner_item)
        Avec la liste des elements (exemple) */
      ArrayAdapter adapter = new ArrayAdapter(
              this,
              android.R.layout.simple_spinner_item,
              region
      );


      /* On definit une présentation du spinner quand il est déroulé         (android.R.layout.simple_spinner_dropdown_item) */
      adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       // //Enfin on passe l'adapter au Spinner et c'est tout
        spinner.setAdapter(adapter);

    }

    public void callSChargement(View view){
        Intent i = new Intent(getApplicationContext(), Chargement.class);
        startActivity(i);
    }
}