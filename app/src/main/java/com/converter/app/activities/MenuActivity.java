package com.converter.app.activities;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.converter.app.R;
import com.converter.app.fragments.CalcFragment;

public class MenuActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;
    Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this,"Witam pania Małgorzatę ! <3 ",Toast.LENGTH_SHORT).show();
        this.savedInstanceState = savedInstanceState;
        setContentView(R.layout.activity_menu);

    }

    public void ButtonPressed(View view){
        fragmentManager = getSupportFragmentManager();

        if(findViewById(R.id.basic_fragment)!=null){
            if(savedInstanceState!=null)
                return;

            Button b = (Button)view;
            CalcFragment calcFragment = new CalcFragment();
            calcFragment.setSubtitle(b.getText().toString().toUpperCase());
            initFragment(calcFragment);
        }
    }

    private void initFragment(Fragment newFragment) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.basic_fragment,newFragment,null);
        fragmentTransaction.commit();
    }
    private static long back_pressed;
    @Override
    public void onBackPressed(){
        if (back_pressed + 2000 > System.currentTimeMillis()){
            super.onBackPressed();
            finish();
        }
        else{
            Toast.makeText(getBaseContext(), "Wciśnij ponownie aby wyjść", Toast.LENGTH_SHORT).show();
            back_pressed = System.currentTimeMillis();

        }
    }
}
