package com.converter.app.unitConverter.temperature.Fahrenheit;

import com.converter.app.unitConverter.UnitConverter;

public class FToN extends UnitConverter{

    public FToN(){this.id ="oFoN"; }
    @Override
    public float convertedResult(float value) {
        return (value-32)*0.18333f;
    }
}
