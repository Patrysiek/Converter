package com.converter.app.unitConverter.length.cm;

import com.converter.app.unitConverter.UnitConverter;

public class CmToIn extends UnitConverter{
    public CmToIn(){
        this.id = "cmin";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.3937f ;
    }
}
