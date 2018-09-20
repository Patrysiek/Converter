package com.converter.app.unitConverter.length.km;

import com.converter.app.unitConverter.UnitConverter;

public class KmToCm extends UnitConverter{
    public KmToCm(){
        this.id = "cmm";
    }
    @Override
    public float convertedResult(float value) {
        return value*100000f ;
    }
}
