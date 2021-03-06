package com.sip.gestibank;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.sip.gestibank.model.Client;
import com.sip.gestibank.remote.APIUtils;
import com.sip.gestibank.remote.ClientService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class creationCompte extends AppCompatActivity {
    ClientService clientService;
    List<Client>list;

    EditText name;
    EditText email;
    EditText tel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation_compte);
        clientService = APIUtils.getClientService();

        name = (EditText) findViewById(R.id.editName);
        email = (EditText) findViewById(R.id.editEmail);
        tel = (EditText) findViewById(R.id.editTel);

    }


    public void addNewClient(View v){


        Client client= new Client(name.getText().toString(),email.getText().toString(),tel.getText().toString());
        Call<Client> call = clientService.addClient(client);
        call.enqueue(new Callback<Client>() {
            @Override
            public void onResponse(Call<Client> call, Response<Client> response) {
                if(response.isSuccessful()){
                    Toast.makeText(creationCompte.this, "Compte Client crée avec Succès", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Accueil.class);
                    startActivity(i);
                }
            }

            @Override
            public void onFailure(Call<Client> call, Throwable t) {
                Log.e("ERROR: ", t.getMessage());
            }
        });

    }





    public void showMessage(String title,String message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }

    public void callMain(View view){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }

}