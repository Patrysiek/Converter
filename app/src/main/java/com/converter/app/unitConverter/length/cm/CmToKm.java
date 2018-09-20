package com.converter.app.unitConverter.length.cm;

import com.converter.app.unitConverter.UnitConverter;

public class CmToKm extends UnitConverter{
    public CmToKm(){
        this.id = "cmkm";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.00001f ;
    }
}
