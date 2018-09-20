package com.converter.app.unitConverter.length.m;

import com.converter.app.unitConverter.UnitConverter;

public class MToMi extends UnitConverter{
    public MToMi(){
        this.id = "mmi";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.00062137f ;
    }
}
