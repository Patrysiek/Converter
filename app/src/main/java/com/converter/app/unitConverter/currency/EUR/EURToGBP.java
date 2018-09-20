package com.converter.app.unitConverter.currency.EUR;


import com.converter.app.CurrencyDependencies;
import com.converter.app.unitConverter.UnitConverter;




public class EURToGBP extends UnitConverter{
    private float dependency;
    public EURToGBP(){
        this.id="EURGBP";
        dependency = CurrencyDependencies.currencyDependencies.getPreferences().getFloat(id,0f);
    }


    @Override
    public float convertedResult(float value) {

        return value * dependency;
    }
}
