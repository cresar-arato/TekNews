package id.univmulia.teknews.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import com.google.firebase.iid.FirebaseInstanceId;

import id.univmulia.teknews.R;

public class SplashActivity extends AppCompatActivity {

    //loading aplikasi 1500ms = 1,5 detik
    private int waktu_loading = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //set statusbar jadi transparan ke postingan kita
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        //loading saat masuk aplikasi
        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent home = new Intent(SplashActivity.this, PostActivity.class);
                startActivity(home);
                finish();

            }
        }, waktu_loading);
    }
}
