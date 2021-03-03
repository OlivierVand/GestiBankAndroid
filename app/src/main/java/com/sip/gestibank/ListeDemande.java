package com.sip.gestibank;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.sip.gestibank.remote.APIUtils;
import com.sip.gestibank.remote.ClientService;

import java.util.ArrayList;
import java.util.List;

public class ListeDemande extends AppCompatActivity {

    ClientService clientService;

    // List<Client> list;

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


        List<ListeClientEnAttente> image_details=getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomListAdapter(this,image_details));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o =listView.getItemAtPosition(position);
                ListeClientEnAttente listeClientEnAttente = (ListeClientEnAttente) o;
                Toast.makeText(ListeDemande.this, "Selected:" + " " + listeClientEnAttente, Toast.LENGTH_LONG).show();
            }
        });

    }

    private List<ListeClientEnAttente> getListData() {
        List<ListeClientEnAttente> list = new ArrayList<ListeClientEnAttente>();
        ListeClientEnAttente Olivier = new ListeClientEnAttente("Olivier Vandamme", "olivier.vandamme@mail.fr","En Attente");
        ListeClientEnAttente Catherine = new ListeClientEnAttente("Catherine Sans", "catherine.sans@mail.fr","En Attente");

        list.add(Olivier);
        list.add(Catherine);
        return list;
    }
}


   //     ListView listView = (ListView)findViewById(R.id.listView);
   //     ListeClientEnAttente Catherine = new ListeClientEnAttente("Catherine", "cat.sans@gmail.com","En Attente"  );
   //     ListeClientEnAttente Olivier = new ListeClientEnAttente("Olivier", "olivier.vandamme@gmail.com","En Attente");
//
   //     ListeClientEnAttente[] listdesclients = new ListeClientEnAttente[]{Catherine,Olivier};
//
   //     ArrayAdapter<ListeClientEnAttente> arrayAdapter = new ArrayAdapter<ListeClientEnAttente>(this, android.R.layout.simple_list_item_1 , listdesclients);
//
   //     listView.setAdapter(arrayAdapter);
   // }




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



