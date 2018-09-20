package com.converter.app.unitConverter.length.m;

import com.converter.app.unitConverter.UnitConverter;

public class MToYd extends UnitConverter{
    public MToYd(){
        this.id = "myd";
    }
    @Override
    public float convertedResult(float value) {
        return value*1.09f ;
    }
}
