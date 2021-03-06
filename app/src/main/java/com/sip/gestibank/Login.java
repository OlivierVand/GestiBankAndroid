package com.sip.gestibank;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
    String myEmail="";
    String myPassword="";
    User user;
    String  role = "invalide";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // affectation des attributs aux view
        email = (EditText) findViewById(R.id.editEmail);
        password = (EditText) findViewById(R.id.editMdp);
        authService = APIUtils.getAuthService();
    }
    public void dashboardUser(View v){
        myEmail = email.getText().toString();
        myPassword = password.getText().toString();
        //Toast.makeText(Login.this, "Login : "+ myEmail +" Password : "+ myPassword, Toast.LENGTH_SHORT).show();
        // récupération du user et donc de son role
        Call<User> call = authService.getUserByEmail(myEmail);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if(response.isSuccessful()){
                    user = response.body();
                    if(user.getEmail().equals(myEmail) && user.getPassword().equals(myPassword))
                    {
                        role = user.getRole();
                        if(user!=null){
                            if(user.getEmail().equals(myEmail) && user.getPassword().equals(myPassword))
                            {
                                role = user.getRole();
                                switch(role)
                                {
                                    case "AGENT" : //.... redirection vers dashboard Agent
                                        Intent intent1 = new Intent(Login.this, ChargementAgent.class);
                                        startActivity(intent1);
                                        break;

                                    case "CLIENT" : //.... redirection vers dashboard Agent
                                        Intent intent2 = new Intent(Login.this, Chargement.class);
                                        startActivity(intent2);
                                        break;

                                    case "ADMIN" : //.... redirection vers dashboard Agent
                                        Intent intent3 = new Intent(Login.this, ChargementAdmin.class);
                                        startActivity(intent3);
                                        break;
                                    default :
                                }
                            }
                            else
                            {

                                Toast.makeText(Login.this, "Login ou Password invalides", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else
                        {

                            Toast.makeText(Login.this, "Login ou Password invalides", Toast.LENGTH_SHORT).show();
                            Toast.makeText(Login.this, "Utilisateur inexistant", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
             //   @@ -87,24 +112,7 @@ public void onFailure(Call<User> call, Throwable t) {
                    //role =user.getRole();
                    //Redirection vers le dashboard en question : Admin, Client ou Agent

                    switch(role)
                    {
                        case "AGENT" : //.... redirection vers dashboard Agent
                            Intent intent1 = new Intent(Login.this, ChargementAgent.class);
                            startActivity(intent1);
                            break;

                        case "CLIENT" : //.... redirection vers dashboard Agent
                            Intent intent2 = new Intent(Login.this, Chargement.class);
                            startActivity(intent2);
                            break;

                        case "ADMIN" : //.... redirection vers dashboard Agent
                            Intent intent3 = new Intent(Login.this, ChargementAdmin.class);
                            startActivity(intent3);
                            break;
                        default :
                    }

                }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.e("ERROR: ", t.getMessage());
            }


        });
    }
    public void callCompte(View view){
        Intent i = new Intent(Login.this, Chargement.class);
        startActivity(i);
    }

    public void callAdmin(View view){
        Intent i = new Intent(getApplicationContext(), ChargementAdmin.class);
        startActivity(i);
    }

    public void callAgent(View view){
        Intent i = new Intent(getApplicationContext(), ChargementAgent.class);
        startActivity(i);
    }

    public void callMain(View view){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}
