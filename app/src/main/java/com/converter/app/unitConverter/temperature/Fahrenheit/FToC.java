package com.converter.app.unitConverter.temperature.Fahrenheit;

import com.converter.app.unitConverter.UnitConverter;

public class FToC extends UnitConverter{

    public FToC(){this.id ="oFoC"; }
    @Override
    public float convertedResult(float value) {
        return (value-32)*1.8f;
    }
}
