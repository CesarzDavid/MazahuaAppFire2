package log.cesarcruz.temasselectos.mazahuaappfire2;

import android.content.Intent;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{

    LinearLayout layout;
    Button buttonclose;
    Button buttonStar;


    GestureDetectorCompat gestureDetectorCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //animacion de dezlizar

        layout = (LinearLayout)findViewById(R.id.layoutID);
        buttonclose = (Button)findViewById(R.id.botonclose);
        buttonStar = (Button)findViewById(R.id.botoncomenzar);

        buttonclose.setAlpha(0);

        gestureDetectorCompat = new GestureDetectorCompat(this,this);
        gestureDetectorCompat.setOnDoubleTapListener(this);

        buttonclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                layout.animate().translationY(1000).setDuration(500).start();
                buttonclose.animate().alpha(0).setDuration(350).start();

            }
        });

        buttonStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "¡Comenzando!",Toast.LENGTH_SHORT).show();
                Intent intent;
                intent = new Intent(MainActivity.this,Campos.class);
                startActivity(intent);

            }
        });


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        gestureDetectorCompat.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {

        layout.animate().translationY(0).setDuration(800).start();
        buttonclose.animate().alpha(1).setDuration(800).start();
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }




}
