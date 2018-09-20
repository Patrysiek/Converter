package com.converter.app.unitConverter.temperature.Celsius;

import com.converter.app.unitConverter.UnitConverter;

public class CToN extends UnitConverter{

    public CToN(){this.id ="oCoN"; }
    @Override
    public float convertedResult(float value) {
        return value*0.33f;
    }
}
