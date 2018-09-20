package com.converter.app.unitConverter.length.ft;

import com.converter.app.unitConverter.UnitConverter;

public class FtToKm extends UnitConverter{
    public FtToKm(){
        this.id = "ftkm";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.0003f ;
    }
}
