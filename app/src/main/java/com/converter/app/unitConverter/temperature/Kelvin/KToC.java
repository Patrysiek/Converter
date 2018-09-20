package com.converter.app.unitConverter.temperature.Kelvin;

import com.converter.app.unitConverter.UnitConverter;

public class KToC extends UnitConverter{

    public KToC(){this.id ="KoC"; }
    @Override
    public float convertedResult(float value) {
        return value-273.15f;
    }
}
