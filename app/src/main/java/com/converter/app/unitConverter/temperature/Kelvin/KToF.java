package com.converter.app.unitConverter.temperature.Kelvin;

import com.converter.app.unitConverter.UnitConverter;

public class KToF extends UnitConverter{

    public KToF(){this.id ="KoF"; }
    @Override
    public float convertedResult(float value) {
        return (value*1.8f)-459.7f;
    }
}
