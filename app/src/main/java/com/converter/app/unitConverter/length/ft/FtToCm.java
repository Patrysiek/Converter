package com.converter.app.unitConverter.length.ft;

import com.converter.app.unitConverter.UnitConverter;

public class FtToCm extends UnitConverter{
    public FtToCm(){
        this.id = "ftcm";
    }
    @Override
    public float convertedResult(float value) {
        return value*30.48f ;
    }
}
