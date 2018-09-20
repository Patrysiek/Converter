package com.converter.app.unitConverter.currency.GBP;

import android.annotation.SuppressLint;

import com.converter.app.CurrencyDependencies;
import com.converter.app.unitConverter.UnitConverter;


public class GBPToPLN extends UnitConverter{
    public GBPToPLN(){
        this.id="GBPPLN";
        dependency = CurrencyDependencies.currencyDependencies.getPreferences().getFloat(id,0.0f);
    }

    @SuppressLint("ResourceType")
    @Override
    public float convertedResult(float value) {

        return value * dependency;
    }
    private float dependency;
}
