package com.sip.gestibank;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.sip.gestibank.model.User;
import com.sip.gestibank.remote.APIUtils;
import com.sip.gestibank.remote.AuthService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity {

    AuthService authService;

   EditText email;
   EditText password;
   String myemail="";
   String mypassword="";
   String role="";
   User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //affectaion des attributs aux vie

        email = (EditText) findViewById(R.id.editEmail);
        password = (EditText) findViewById(R.id.editMdp);
        authService = APIUtils.getAuthService();




    }


public void dashboardUser(View v) {
        //récupération du user et de son role





    myemail = email.getText().toString();
    mypassword = password.getText().toString();
    //redirection vers le dashbpard en cquesiton : Amin, client ou agent


    Call<User> call = authService.getUserByEmail(myemail);

    call.enqueue(new Callback<User>() {
        @Override
        public void onResponse(Call<User> call, Response<User> response) {

            if(response.isSuccessful()){
                user = response.body();
                if(user.getEmail().equals(myemail) && user.getPassword().equals(mypassword))
                role = user.getRole();
                else
                {
                    Toast.makeText(Login.this, "Erreur sur l'email ou le mot de passe", Toast.LENGTH_SHORT).show();
                }
            }
        }

        @Override
        public void onFailure(Call<User> call, Throwable t) {

        }
    });






    switch(role)
    {
        case "AGENT" : //.... redirection vers le Dashboard Agent
            Intent intent1 = new Intent(Login.this, ChargementAgent.class);
            startActivity(intent1);
            break;
        case "CLIENT" : //.... redirection vers le Dashboard Agent
            Intent i3 = new Intent(Login.this, Chargement.class);
            startActivity(i3);
            break;
        case "ADMIN" : //.... redirection vers le Dashboard Agent
            Intent i4 = new Intent(Login.this, ChargementAdmin.class);
            startActivity(i4);
            break;

        default :
    }
 }










}
