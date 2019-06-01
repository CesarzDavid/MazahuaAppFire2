package log.cesarcruz.temasselectos.mazahuaappfire2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.io.IOException;

import log.cesarcruz.temasselectos.mazahuaappfire2.Modelo.Palabra;

public class PalabraLayout extends AppCompatActivity {

    ImageView imgPalabraImagen, imgPalabraTemas, imgPalabraTemasFonema,
            imgPalabraDonato, imgPalabraDonatoFonema, imgPalabraEjemplo1, imagePalabraEjemplo2;

    TextView PalabraTexto, PalabraTipo;

    String textImage, textImageTemas, textImageTemasFonema, textImageDonato, textImageDonatoFonema,
            textEjemplo1, textEjemplo2;

    String AudioTemas, AudioDonato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palabra_layout);

        imgPalabraImagen = findViewById(R.id.imagenPalabra);
        PalabraTexto = findViewById(R.id.textviewPalabraTexto);
        PalabraTipo = findViewById(R.id.textviewPalabraTipo);
        imgPalabraTemas = findViewById(R.id.imageTemas);
        imgPalabraTemasFonema = findViewById(R.id.imageTemasFonema);
        imgPalabraDonato = findViewById(R.id.imageDonato);
        imgPalabraDonatoFonema = findViewById(R.id.imageDonatoFonema);
        imgPalabraEjemplo1 = findViewById(R.id.imageEjemplo1);
        imagePalabraEjemplo2 = findViewById(R.id.imageEjemplo2);

        Bundle palabraEnviada = getIntent().getExtras();
        Palabra palabraSec = null;

        if(palabraEnviada != null)
        {
            palabraSec = (Palabra) palabraEnviada.getSerializable("Palabra");

            textImage = palabraSec.getaPalabraImagen();
            Picasso.get().load(textImage).into(imgPalabraImagen);


            PalabraTexto.setText(palabraSec.getbPalabraTexto());
            PalabraTipo.setText(palabraSec.getcPalabraTipo());

            textImageTemas = palabraSec.getdPalabraTemas();
            Picasso.get().load(textImageTemas).into(imgPalabraTemas);

            textImageTemasFonema = palabraSec.getePalabraTemasF();
            Picasso.get().load(textImageTemasFonema).into(imgPalabraTemasFonema);

            textImageDonato = palabraSec.getfPalabraDonato();
            Picasso.get().load(textImageDonato).into(imgPalabraDonato);

            textImageDonatoFonema = palabraSec.getgPalabraDonatoF();
            Picasso.get().load(textImageDonatoFonema).into(imgPalabraDonatoFonema);

            textEjemplo1 = palabraSec.gethPalabrax1();
            Picasso.get().load(textEjemplo1).into(imgPalabraEjemplo1);

            textEjemplo2 = palabraSec.getiPalabrax2();
            Picasso.get().load(textEjemplo2).into(imagePalabraEjemplo2);

            //Capturando el Url de los audios
            AudioTemas = palabraSec.getjPalabraAudioT();
            AudioDonato = palabraSec.getkPlabraAudioD();

            imgPalabraTemas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //Toast.makeText(PalabraLayout.this, "Cargando Audio", Toast.LENGTH_SHORT).show();
                    MediaPlayer mediaPlayer = new MediaPlayer();
                    try
                    {
                        mediaPlayer.setDataSource(AudioTemas);
                        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                            @Override
                            public void onPrepared(MediaPlayer mp) {
                                mp.start();
                            }
                        });
                        mediaPlayer.prepare();
                    }
                    catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                }
            });


            imgPalabraDonato.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //Toast.makeText(PalabraLayout.this, "Cargando Audio", Toast.LENGTH_SHORT).show();
                    MediaPlayer mediaPlayer = new MediaPlayer();
                    try
                    {
                        mediaPlayer.setDataSource(AudioDonato);
                        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                            @Override
                            public void onPrepared(MediaPlayer mp) {
                                mp.start();
                            }
                        });
                        mediaPlayer.prepare();
                    }
                    catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                }
            });

            /*
            idP.setText(palabraSec.getId().toString());
            nombreP.setText(palabraSec.getNombre().toString());
            apellidoP.setText(palabraSec.getApellido().toString());
            correoP.setText(palabraSec.getCorreo().toString());*/
        }
    }
}
