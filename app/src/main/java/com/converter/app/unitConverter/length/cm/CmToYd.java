package com.converter.app.unitConverter.length.cm;

import com.converter.app.unitConverter.UnitConverter;

public class CmToYd extends UnitConverter{
    public CmToYd(){
        this.id = "cmyd";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.0109f ;
    }
}
