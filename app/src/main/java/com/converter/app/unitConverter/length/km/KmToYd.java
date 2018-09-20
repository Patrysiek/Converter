package com.converter.app.unitConverter.length.km;

import com.converter.app.unitConverter.UnitConverter;

public class KmToYd extends UnitConverter{
    public KmToYd(){
        this.id = "myd";
    }
    @Override
    public float convertedResult(float value) {
        return value*1093.6f ;
    }
}
