package br.com.livroandroid.carros;

import android.app.Application;
import android.util.Log;

/**
 * Created by Ricardo Lecheta on 24/01/2015.
 */
public class CarrosApplication extends Application {
    private static final String TAG = "CarrosApplication";
    // Singleton
    private static CarrosApplication instance = null;

    public static CarrosApplication getInstance() {
        return instance;
    }

    private boolean needUpdateCarrosList;

    @Override
    public void onCreate() {
        Log.d(TAG, "CarrosApplication.onCreate()");
        // Salva a instância para termos acesso como Singleton
        instance = this;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.d(TAG, "CarrosApplication.onTerminate()");
    }

    public void setNeedUpdateCarrosList(boolean needUpdateCarrosList) {
        this.needUpdateCarrosList = needUpdateCarrosList;
    }

    public boolean isNeedUpdateCarrosList() {
        return this.needUpdateCarrosList;
    }
}
