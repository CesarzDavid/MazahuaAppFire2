package log.cesarcruz.temasselectos.mazahuaappfire2.Modelo;

import com.google.firebase.database.FirebaseDatabase;

public class MyFirebaseApp extends android.app.Application {

    @Override
    public void onCreate() {

        //tener lista la persistencia de datos en toda la app
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }

}
