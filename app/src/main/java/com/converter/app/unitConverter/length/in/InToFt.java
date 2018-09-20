package com.converter.app.unitConverter.length.in;

import com.converter.app.unitConverter.UnitConverter;

public class InToFt extends UnitConverter{
    public InToFt(){
        this.id = "inft";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.0833f ;
    }
}
