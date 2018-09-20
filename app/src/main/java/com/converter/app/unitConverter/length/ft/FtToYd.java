package com.converter.app.unitConverter.length.ft;

import com.converter.app.unitConverter.UnitConverter;

public class FtToYd extends UnitConverter{
    public FtToYd(){
        this.id = "ftyd";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.3333f ;
    }
}
