package com.converter.app.unitConverter.length.in;

import com.converter.app.unitConverter.UnitConverter;

public class InToYd extends UnitConverter{
    public InToYd(){
        this.id = "inyd";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.0278f ;
    }
}
