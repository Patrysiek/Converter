package com.converter.app.unitConverter.temperature.Newton;

import com.converter.app.unitConverter.UnitConverter;

public class NToC extends UnitConverter{

    public NToC(){this.id ="oNoF"; }
    @Override
    public float convertedResult(float value) {

        return value*100/33;
    }
}
