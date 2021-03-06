package com.sip.gestibank;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

public class MesComptes extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private AppBarConfiguration mAppBarConfiguration;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mes_comptes);
      Toolbar toolbar = findViewById(R.id.toolbar);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



      setSupportActionBar(toolbar);
   //  FloatingActionButton fab = findViewById(R.id.fab);
  //    fab.setOnClickListener(new View.OnClickListener() {
  //        @Override
  //        public void onClick(View view) {
  //            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
  //                    .setAction("Action", null).show();
  //        }
  //    });
       DrawerLayout drawer = findViewById(R.id.drawer_layout);
     //  NavigationView navigationView = findViewById(R.id.nav_view);
//
       // Passing each menu ID as a set of Ids because each
       // menu should be considered as top level destinations.
       mAppBarConfiguration = new AppBarConfiguration.Builder(
               R.id.nav_home, R.id.nav_virements, R.id.nav_carte, R.id.nav_cheque,R.id.nav_iban, R.id.nav_document, R.id.nav_credit, R.id.nav_contact, R.id.nav_assurance, R.id.nav_reglage)
               .setDrawerLayout(drawer)
               .build();
       NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
       NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
       NavigationUI.setupWithNavController(navigationView, navController);


   }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mes_comptes, menu);

        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        switch (item.getItemId()) {

            case R.id.nav_virements: {
              //  Intent i = new Intent(MesComptes.this, Virement.class);
             //   startActivity(i);
               Toast.makeText(MesComptes.this, "Virement cliquer", Toast.LENGTH_SHORT).show();

                break;
            }
        }
        //close navigation drawer
       // this.DrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    public void callDeco(View view){
        Intent i = new Intent(getApplicationContext(), Login.class);
        startActivity(i);
    }

}