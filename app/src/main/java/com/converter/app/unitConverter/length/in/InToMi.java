package com.converter.app.unitConverter.length.in;

import com.converter.app.unitConverter.UnitConverter;

public class InToMi extends UnitConverter{
    public InToMi(){
        this.id = "inmi";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.000015795f ;
    }
}
