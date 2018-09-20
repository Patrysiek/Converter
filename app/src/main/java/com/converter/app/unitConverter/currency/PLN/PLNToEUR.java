package com.converter.app.unitConverter.currency.PLN;

import android.annotation.SuppressLint;

import com.converter.app.CurrencyDependencies;
import com.converter.app.unitConverter.UnitConverter;


public class PLNToEUR extends UnitConverter{

    public PLNToEUR(){
        this.id="PLNEUR";
        dependency = CurrencyDependencies.currencyDependencies.getPreferences().getFloat(id,0.0f);
    }

    @SuppressLint("ResourceType")
    @Override
    public float convertedResult(float value) {

        return value * dependency;
    }
    private float dependency;
}
