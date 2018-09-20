package com.converter.app.unitConverter.temperature.Celsius;

import com.converter.app.unitConverter.UnitConverter;

public class CToK extends UnitConverter{

    public CToK(){this.id ="oCK"; }
    @Override
    public float convertedResult(float value) {
        return value+273.15f;
    }
}
