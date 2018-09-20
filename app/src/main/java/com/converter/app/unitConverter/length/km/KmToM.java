package com.converter.app.unitConverter.length.km;

import com.converter.app.unitConverter.UnitConverter;

public class KmToM extends UnitConverter{
    public KmToM(){
        this.id = "cmkm";
    }
    @Override
    public float convertedResult(float value) {
        return value*1000f ;
    }
}
