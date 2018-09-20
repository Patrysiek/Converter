package com.converter.app.unitConverter.currency.EUR;

import com.converter.app.CurrencyDependencies;

import com.converter.app.unitConverter.UnitConverter;


public class EURToPLN extends UnitConverter{
float dependency;
    public EURToPLN(){
        this.id="EURPLN";
        dependency = CurrencyDependencies.currencyDependencies.getPreferences().getFloat(id,0.0f);
    }


    @Override
    public float convertedResult(float value) {

        return value * dependency;
    }
}
