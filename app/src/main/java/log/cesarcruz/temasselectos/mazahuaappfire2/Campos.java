package log.cesarcruz.temasselectos.mazahuaappfire2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class Campos extends AppCompatActivity {

    private CardView presentacioncard, vocalescard, animalescard, colorescard, frutascard, numeroscard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campos);

        //definiendo cards

        presentacioncard = findViewById(R.id.cardviewpresentacion);
        vocalescard = findViewById(R.id.cardviewvocales);
        animalescard = findViewById(R.id.cardviewanimales);
        colorescard = findViewById(R.id.cardviewcolores);
        frutascard = findViewById(R.id.cardviewfrutas);
        numeroscard = findViewById(R.id.cardviewnumeros);

        presentacioncard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Campos.this, "Así me presento",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Campos.this,ListaPresentacion.class);
                startActivity(intent);

            }
        });

        vocalescard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Campos.this, "Vocales",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Campos.this,ListaVocales.class);
                startActivity(intent);

            }
        });

        animalescard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Campos.this, "Animales",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Campos.this,ListaAnimales.class);
                startActivity(intent);
            }
        });

        colorescard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Campos.this, "Colores",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Campos.this,ListaColores.class);
                startActivity(intent);

            }
        });

        frutascard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Campos.this, "Frutas y Verduras",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Campos.this,ListaFrutas.class);
                startActivity(intent);
            }
        });

        numeroscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Campos.this, "Números",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Campos.this,ListaNumeros.class);
                startActivity(intent);
            }
        });


    }

}
