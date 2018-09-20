package com.converter.app.unitConverter.length.in;

import com.converter.app.unitConverter.UnitConverter;

public class InToM extends UnitConverter{
    public InToM(){
        this.id = "inm";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.0278f ;
    }
}
