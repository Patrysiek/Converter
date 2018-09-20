package com.converter.app.unitConverter.length.ft;

import com.converter.app.unitConverter.UnitConverter;

public class FtToMi extends UnitConverter{
    public FtToMi(){
        this.id = "ftmi";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.0002f ;
    }
}
