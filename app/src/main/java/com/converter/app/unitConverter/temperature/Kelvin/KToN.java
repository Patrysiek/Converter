package com.converter.app.unitConverter.temperature.Kelvin;

import com.converter.app.unitConverter.UnitConverter;

public class KToN extends UnitConverter{

    public KToN(){this.id ="KoN"; }
    @Override
    public float convertedResult(float value) {
        return (value-273.15f)*0.33f;
    }
}
