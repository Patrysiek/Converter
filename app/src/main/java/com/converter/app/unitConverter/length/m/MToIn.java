package com.converter.app.unitConverter.length.m;

import com.converter.app.unitConverter.UnitConverter;

public class MToIn extends UnitConverter{
    public MToIn(){
        this.id = "min";
    }
    @Override
    public float convertedResult(float value) {
        return value*39.37f ;
    }
}
