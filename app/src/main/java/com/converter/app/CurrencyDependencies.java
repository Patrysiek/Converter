package com.converter.app;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

import com.converter.app.converterControllers.CurrentCurrencyController;

import java.io.IOException;

public class CurrencyDependencies {



    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    private Activity activity;
    public static CurrencyDependencies currencyDependencies = new CurrencyDependencies();
    private CurrencyDependencies(){
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
        preferences = activity.getPreferences(Context.MODE_PRIVATE);
        editor = preferences.edit();
    }

    private void addOfflineCurrencyDependencies(){
        editor.putFloat(String.valueOf(R.string.PLNUSD),0.2725f);
        editor.putFloat(String.valueOf(R.string.PLNEUR),0.2329f);
        editor.putFloat(String.valueOf(R.string.PLNGBP),0.2065f);

        editor.putFloat("USDGBP",0.75760f);
        editor.putFloat("USDEUR",3.6680f);
        editor.putFloat("USDPLN",0.85460f);

        editor.putFloat("GBPEUR",1.12800f);
        editor.putFloat("GBPPLN",4.84250f);
        editor.putFloat("GBPUSD",1.31980f);

        editor.putFloat("EURPLN",4.2920f);
        editor.putFloat("EURGBP",0.88640f);
        editor.putFloat("EURUSD",1.170000f);

    }

    private void addOnlineCurrencyDependencies() throws IOException {

        editor.putFloat("PLNUSD",Float.valueOf(CurrentCurrencyController.GetCurrencyStatus("https://www.google.pl/search?q=pln+to+usd")));
        editor.putFloat("PLNEUR",Float.valueOf(CurrentCurrencyController.GetCurrencyStatus("https://www.google.pl/search?q=pln+to+eur")));
        editor.putFloat("PLNGBP",Float.valueOf(CurrentCurrencyController.GetCurrencyStatus("https://www.google.pl/search?q=pln+to+gbp")));

        editor.putFloat("USDGBP",Float.valueOf(CurrentCurrencyController.GetCurrencyStatus("https://www.google.pl/search?q=usd+to+gbp")));
        editor.putFloat("USDEUR",Float.valueOf(CurrentCurrencyController.GetCurrencyStatus("https://www.google.pl/search?q=usd+to+eur")));
        editor.putFloat("USDPLN",Float.valueOf(CurrentCurrencyController.GetCurrencyStatus("https://www.google.pl/search?q=usd+to+pln")));

        editor.putFloat("GBPEUR",Float.valueOf(CurrentCurrencyController.GetCurrencyStatus("https://www.google.pl/search?q=gbp+to+eur")));
        editor.putFloat("GBPPLN",Float.valueOf(CurrentCurrencyController.GetCurrencyStatus("https://www.google.pl/search?q=gbp+to+pln")));
        editor.putFloat("GBPUSD",Float.valueOf(CurrentCurrencyController.GetCurrencyStatus("https://www.google.pl/search?q=gbp+to+usd")));

        editor.putFloat("EURPLN", Float.valueOf(CurrentCurrencyController.GetCurrencyStatus("https://www.google.pl/search?q=eur+to+pln")));
        editor.putFloat("EURGBP",Float.valueOf(CurrentCurrencyController.GetCurrencyStatus("https://www.google.pl/search?q=eur+to+gbp")));
        editor.putFloat("EURUSD",Float.valueOf(CurrentCurrencyController.GetCurrencyStatus("https://www.google.pl/search?q=eur+to+usd")));


    }

    public void setPreferences() throws IOException {
        if(ConnectionChecker.isOnline(activity.getBaseContext())){
            addOnlineCurrencyDependencies();
        }else{
            if(!preferences.contains("USDGBP")){
                addOfflineCurrencyDependencies();
            }
        }
        editor.commit();
    }

    public Activity getActivity() {
        return activity;
    }
    public SharedPreferences getPreferences() {
        return preferences;
    }
}
