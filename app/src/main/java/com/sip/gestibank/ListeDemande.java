package com.sip.gestibank;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.sip.gestibank.remote.APIUtils;
import com.sip.gestibank.remote.ClientService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListeDemande extends AppCompatActivity {

    ClientService clientService;

    List<ListeClientEnAttente> list;

    EditText name;
    EditText email;
    EditText tel;
    ListView liste;
    Button test;

//    ListView nomlist;

    TextView nom;


    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_demande);
        list=new ArrayList<ListeClientEnAttente>();


        clientService = APIUtils.getClientService();
        name = (EditText) findViewById(R.id.editName);
        email = (EditText) findViewById(R.id.editEmail);
        tel = (EditText) findViewById(R.id.editTel);
        nom = (TextView) findViewById(R.id.textViewNom);
        test = (Button) findViewById(R.id.btnTest);


        //nomlist = (ListView) findViewById(R.id.listViewNom);


   //    List<ListeClientEnAttente> image_details = getClient();
   //    final ListView listView = (ListView) findViewById(R.id.listView);
   //    listView.setAdapter(new CustomListAdapter(this, image_details));

   //    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
   //        @Override
   //        public void onItemClick(AdapterView<?> a, View v, int position, long id) {
   //            Object o = listView.getItemAtPosition(position);
   //            ListeClientEnAttente listeClientEnAttente = (ListeClientEnAttente) o;
   //            Toast.makeText(ListeDemande.this, "Selected:" + " " + listeClientEnAttente, Toast.LENGTH_LONG).show();
   //        }
   //    });

    }

    private List<ListeClientEnAttente> getListData() {
        List<ListeClientEnAttente> list = new ArrayList<ListeClientEnAttente>();
        ListeClientEnAttente Olivier = new ListeClientEnAttente("Olivier Vandamme", "olivier.vandamme@mail.fr", "En Attente");
        ListeClientEnAttente Catherine = new ListeClientEnAttente("Catherine Sans", "catherine.sans@mail.fr", "En Attente");

        list.add(Olivier);
        list.add(Catherine);
        return list;
    }

    public void  getClient(View view) {



        Call<List<ListeClientEnAttente>> call = clientService.getClientsEnAttentes();
        call.enqueue(new Callback<List<ListeClientEnAttente>>() {
            @Override
            public void onResponse(Call<List<ListeClientEnAttente>> call, Response<List<ListeClientEnAttente>> response) {
                if (response.isSuccessful()) {
                    list = response.body();
                    Log.i("OLIVIER: ", list.toString());

                }
            }

            @Override
            public void onFailure(Call<List<ListeClientEnAttente>> call, Throwable t) {
                Log.e("ERROR: ", t.getMessage());
            }
        });

        final ListView listView = (ListView) findViewById(R.id.listView);
        List<ListeClientEnAttente> image_details = list;
        listView.setAdapter(new CustomListAdapter(this, image_details));

    }

}
// nomlist = (ListView) findViewById(R.id.listViewNom);


//  //  private List<ListeClientEnAttente> getListData() {
        //    Call<List<ListeClientEnAttente>> call = clientService.getClientsEnAttentes();
        //    call.enqueue(new Callback<List<ListeClientEnAttente>>);
        //    List<ListeClientEnAttente> list = new ArrayList<ListeClientEnAttente>();

        //    //  ListeClientEnAttente Olivier = new ListeClientEnAttente("Olivier Vandamme", "olivier.vandamme@mail.fr","En Attente");
        //    //  ListeClientEnAttente Catherine = new ListeClientEnAttente("Catherine Sans", "catherine.sans@mail.fr","En Attente");

        //     list.add((ListeClientEnAttente) call);

        //    //  return list;


        //    return list;
        //    }

        //}


//   public void addNewClient(View v){


//       Client client= new Client(name.getText().toString(),email.getText().toString(),tel.getText().toString());
//       Call<ListeClientEnAttente> call = clientService.getClientEnAttente(ListeClientEnAttente);
//       call.enqueue(new Callback<Client>() {
//           @Override
//           public void onResponse(Call<Client> call, Response<Client> response) {
//               if(response.isSuccessful()){
//                   Toast.makeText(creationCompte.this, "Client created successfully!", Toast.LENGTH_SHORT).show();
//                   Intent i = new Intent(getApplicationContext(), Accueil.class);
//                   startActivity(i);
//               }
//           }

//           @Override
//           public void onFailure(Call<Client> call, Throwable t) {
//               Log.e("ERROR: ", t.getMessage());
//           }
//       });

//   }





