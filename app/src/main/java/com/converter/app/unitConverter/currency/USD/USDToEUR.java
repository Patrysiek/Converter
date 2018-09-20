package com.converter.app.unitConverter.currency.USD;

import android.annotation.SuppressLint;

import com.converter.app.CurrencyDependencies;
import com.converter.app.unitConverter.UnitConverter;


public class USDToEUR extends UnitConverter{
    public USDToEUR(){
        this.id="USDEUR";
        dependency = CurrencyDependencies.currencyDependencies.getPreferences().getFloat(id,0.0f);
    }

    @SuppressLint("ResourceType")
    @Override
    public float convertedResult(float value) {

        return value * dependency;
    }
    private float dependency;
}
