package com.converter.app.unitConverter.length.m;

import com.converter.app.unitConverter.UnitConverter;

public class MToFt extends UnitConverter{
    public MToFt(){
        this.id = "mft";
    }
    @Override
    public float convertedResult(float value) {
        return value*3.2808f ;
    }
}
