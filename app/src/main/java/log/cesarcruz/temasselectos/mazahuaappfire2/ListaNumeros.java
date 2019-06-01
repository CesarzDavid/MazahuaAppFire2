package log.cesarcruz.temasselectos.mazahuaappfire2;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import log.cesarcruz.temasselectos.mazahuaappfire2.Modelo.Palabra;

public class ListaNumeros extends AppCompatActivity {

    private List<Palabra> listPalabra = new ArrayList<Palabra>();
    ArrayAdapter<Palabra> arrayAdapterPalabra;

    ListView listaPalabras;

    //Firebasedatabase este elemeto conecta a la base de datos
    FirebaseDatabase firebaseDatabase;
    //ese elemento manipula los onjetos que se guardan en la base de datos
    DatabaseReference databaseReference;

    Palabra palabraSeleccionada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_numeros);
        //////////////////////////////////////////
        listaPalabras = findViewById(R.id.listView_ListaPalabras);
        //PalabraAgregar = findViewById(R.id.EditText_agregarPalabra);

        inicializarfirebase();
        listarDatos();

        listaPalabras.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                palabraSeleccionada = (Palabra) parent.getItemAtPosition(position);

                Intent intent = new Intent(ListaNumeros.this, PalabraLayout.class);
                Bundle bundle = new Bundle();

                bundle.putSerializable("Palabra", palabraSeleccionada);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////
    }

    private void listarDatos() {

        databaseReference.child("Numeros").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                listPalabra.clear();
                for (DataSnapshot objSnapshot:dataSnapshot.getChildren())
                {
                    Palabra palabra = objSnapshot.getValue(Palabra.class);
                    listPalabra.add(palabra);
                    arrayAdapterPalabra = new ArrayAdapter<Palabra>(ListaNumeros.this,android.R.layout.simple_list_item_1, listPalabra);
                    listaPalabras.setAdapter(arrayAdapterPalabra);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void inicializarfirebase()
    {
        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        //firebaseDatabase.setPersistenceEnabled(true);
        databaseReference = firebaseDatabase.getReference();
    }

}
