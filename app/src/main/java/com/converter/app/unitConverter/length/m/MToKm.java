package com.converter.app.unitConverter.length.m;

import com.converter.app.unitConverter.UnitConverter;

public class MToKm extends UnitConverter{
    public MToKm(){
        this.id = "mkm";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.001f ;
    }
}
