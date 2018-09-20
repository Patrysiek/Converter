package com.converter.app.unitConverter.length.cm;

import com.converter.app.unitConverter.UnitConverter;

public class CmToFt extends UnitConverter{
    public CmToFt(){
        this.id = "cmft";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.0328f ;
    }
}
