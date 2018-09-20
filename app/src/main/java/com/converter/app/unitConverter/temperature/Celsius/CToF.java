package com.converter.app.unitConverter.temperature.Celsius;

import com.converter.app.unitConverter.UnitConverter;

public class CToF extends UnitConverter{

    public CToF(){this.id ="oCoF"; }
    @Override
    public float convertedResult(float value) {
        return value*9/5+32;
    }
}
