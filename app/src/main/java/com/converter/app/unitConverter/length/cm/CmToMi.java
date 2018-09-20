package com.converter.app.unitConverter.length.cm;

import com.converter.app.unitConverter.UnitConverter;

public class CmToMi extends UnitConverter{
    public CmToMi(){
        this.id = "cmmi";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.0000062137f ;
    }
}
