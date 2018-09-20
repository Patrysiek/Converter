package com.converter.app.unitConverter.length.in;

import com.converter.app.unitConverter.UnitConverter;

public class InToCm extends UnitConverter{
    public InToCm(){
        this.id = "incm";
    }
    @Override
    public float convertedResult(float value) {
        return value*2.54f ;
    }
}
