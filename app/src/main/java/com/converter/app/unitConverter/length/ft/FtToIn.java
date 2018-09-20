package com.converter.app.unitConverter.length.ft;

import com.converter.app.unitConverter.UnitConverter;

public class FtToIn extends UnitConverter{
    public FtToIn(){
        this.id = "ftin";
    }
    @Override
    public float convertedResult(float value) {
        return value*12f ;
    }
}
