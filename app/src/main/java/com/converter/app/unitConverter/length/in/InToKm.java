package com.converter.app.unitConverter.length.in;

import com.converter.app.unitConverter.UnitConverter;

public class InToKm extends UnitConverter{
    public InToKm(){
        this.id = "inkm";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.0000254f ;
    }
}
