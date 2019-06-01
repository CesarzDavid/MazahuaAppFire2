package log.cesarcruz.temasselectos.mazahuaappfire2;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import log.cesarcruz.temasselectos.mazahuaappfire2.Modelo.Palabra;

public class ListaAnimales extends AppCompatActivity {

    private List<Palabra> listPalabra = new ArrayList<Palabra>();
    ArrayAdapter<Palabra> arrayAdapterPalabra;

    //EditText PalabraAgregar;
    ListView listaPalabras;

    //Firebasedatabase este elemeto conecta a la base de datos
    FirebaseDatabase firebaseDatabase;
    //ese elemento manipula los onjetos que se guardan en la base de datos
    DatabaseReference databaseReference;

    Palabra palabraSeleccionada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_animales);

        listaPalabras = findViewById(R.id.listView_ListaPalabras);
        //PalabraAgregar = findViewById(R.id.EditText_agregarPalabra);

        inicializarfirebase();
        listarDatos();

        listaPalabras.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                palabraSeleccionada = (Palabra) parent.getItemAtPosition(position);

                Intent intent = new Intent(ListaAnimales.this, PalabraLayout.class);
                Bundle bundle = new Bundle();

                bundle.putSerializable("Palabra", palabraSeleccionada);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }


    private void listarDatos() {

        databaseReference.child("Animales").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                listPalabra.clear();
                for (DataSnapshot objSnapshot:dataSnapshot.getChildren())
                {
                    Palabra palabra = objSnapshot.getValue(Palabra.class);
                    listPalabra.add(palabra);
                    arrayAdapterPalabra = new ArrayAdapter<Palabra>(ListaAnimales.this,android.R.layout.simple_list_item_1, listPalabra);
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


    /* Funciones para el boton y editTex (Temporales)*/

    /////////////////////////////////////////////////7
    /*


    public void onClickAgregar(View view)
    {
        String palabratexto = PalabraAgregar.getText().toString();
        if(palabratexto.equals(""))
        {
            validacion();
        }
        else
        {

            Palabra PalabraNueva = new Palabra();

            PalabraNueva.setaPalabraImagen("Imagen");
            PalabraNueva.setbPalabraTexto(palabratexto);
            PalabraNueva.setcPalabraTipo("Oración");
            PalabraNueva.setdPalabraTemas("Temascalcingo");
            PalabraNueva.setePalabraTemasF("Temas Fonema");
            PalabraNueva.setfPalabraDonato("Donato");
            PalabraNueva.setgPalabraDonatoF("Donato Fonema");
            PalabraNueva.sethPalabrax1("ejemplo 1");
            PalabraNueva.setiPalabrax2("ejemplo 2");
            PalabraNueva.setjPalabraAudioT("Audio Temas");
            PalabraNueva.setkPlabraAudioD("Audio Donato");
            PalabraNueva.setlPalabraAudiox1("Audio ejemplo1");
            PalabraNueva.setmPalabraAudiox2("Audio ejemplo2");

            //databaseReference.child("Animales").child(PalabraNueva.getbPalabraTexto()).setValue(PalabraNueva);

            databaseReference.child("Presentacion").child(PalabraNueva.getbPalabraTexto()).setValue(PalabraNueva);
            Toast.makeText(this, "Agregado",Toast.LENGTH_SHORT).show();
            limpiarcajas();


        }

    }
    private void validacion() {

        String palabratexto = PalabraAgregar.getText().toString();

        if(palabratexto.equals(""))
        {
            PalabraAgregar.setError("Requerido");
        }

    }
    private void limpiarcajas() {
        PalabraAgregar.setText("");


    }
    */
    //////////////////////////////////////////////////////

}
