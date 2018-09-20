package com.converter.app.unitConverter.temperature.Newton;

import com.converter.app.unitConverter.UnitConverter;

public class NToF extends UnitConverter{

    public NToF(){this.id ="oNoF"; }
    @Override
    public float convertedResult(float value) {

        return value*5.4545f+32;
    }
}
