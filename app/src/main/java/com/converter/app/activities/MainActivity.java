package com.converter.app.activities;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.widget.Toast;

import com.converter.app.CurrencyDependencies;
import com.converter.app.R;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Czekej Gosia bo sie piniondze ładujo !",Toast.LENGTH_LONG).show();
            goFurther();
        CurrencyDependencies.currencyDependencies.setActivity(this);
        try {
            CurrencyDependencies.currencyDependencies.setPreferences();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void goFurther() {
        Handler activityDelayer = new Handler();

        final Intent MenuActivityIntent = new Intent(this, MenuActivity.class);
        activityDelayer.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(MenuActivityIntent);
            }
        }, 10000);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
boolean pressed;
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                startActivity(new Intent(this, MenuActivity.class));
                pressed = true;
                break;
            default:
                pressed = false;
              break;

        }
return pressed;

    }
}
