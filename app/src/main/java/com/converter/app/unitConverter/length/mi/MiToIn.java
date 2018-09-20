package com.converter.app.unitConverter.length.mi;

import com.converter.app.unitConverter.UnitConverter;

public class MiToIn extends UnitConverter{
    public MiToIn(){
        this.id = "miin";
    }
    @Override
    public float convertedResult(float value) {
        return value*63360f ;
    }
}
