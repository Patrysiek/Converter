package com.converter.app.unitConverter.currency.EUR;



import com.converter.app.CurrencyDependencies;
import com.converter.app.unitConverter.UnitConverter;


public class EURToUSD extends UnitConverter{
    private float dependency;
    public EURToUSD(){
        this.id="EURUSD";
        dependency = CurrencyDependencies.currencyDependencies.getPreferences().getFloat(id,0.0f);
    }


    @Override
    public float convertedResult(float value) {

        return value * dependency;
    }
}
