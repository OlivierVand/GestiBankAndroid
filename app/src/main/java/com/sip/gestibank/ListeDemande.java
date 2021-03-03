package com.sip.gestibank;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.sip.gestibank.model.Client;
import com.sip.gestibank.remote.APIUtils;
import com.sip.gestibank.remote.ClientService;

import java.util.List;

public class ListeDemande extends AppCompatActivity {

    ClientService clientService;

    List<Client> list;

    EditText name;
    EditText email;
    EditText tel;

//    ListView nomlist;

    TextView nom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_demande);
        clientService = APIUtils.getClientService();

        name = (EditText) findViewById(R.id.editName);
        email = (EditText) findViewById(R.id.editEmail);
        tel = (EditText) findViewById(R.id.editTel);

        nom = (TextView) findViewById(R.id.textViewNom);
        //nomlist = (ListView) findViewById(R.id.listViewNom);





        ListView listView = (ListView)findViewById(R.id.listView);
        ListeClientEnAttente Catherine = new ListeClientEnAttente("Catherine", "cat.sans@gmail.com",025147545, "En Attente" );
        ListeClientEnAttente Olivier = new ListeClientEnAttente("Olivier", "olivier.vandamme@gmail.com",0255455644, "En Attente" );

        ListeClientEnAttente[] listdesclients = new ListeClientEnAttente[]{Catherine,Olivier};

        ArrayAdapter<ListeClientEnAttente> arrayAdapter = new ArrayAdapter<ListeClientEnAttente>(this, android.R.layout.simple_list_item_1 , listdesclients);

        listView.setAdapter(arrayAdapter);
    }

}


    //    public void getDemandeList(View v) {
    //        Call<List<Client>> call = clientService.getClients();
    //        call.enqueue(new Callback<List<Client>>() {
    //            @Override
    //            public void onResponse(Call<List<Client>> call, Response<List<Client>> response) {
    //                if (response.isSuccessful()) {
    //                    list = response.body();
    //                    Log.i("Data: ", list.toString());
//
//
    //                    for (Client user : list) {
//
    //                        nom.setText(user.getName() + "\n");
//
    //                        //nomlist ( user.getName() + "\n");
//
    //                    }
//
    //                    //   listView.setAdapter(new UserAdapter(ListeDemande.this, R.layout.activity_liste_demande, list));
    //                }
    //            }
//
    //            @Override
    //            public void onFailure(Call<List<Client>> call, Throwable t) {
    //                Log.e("ERROR: ", t.getMessage());
    //            }
    //        });
    //    }



