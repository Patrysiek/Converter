package com.converter.app.unitConverter.length.mi;

import com.converter.app.unitConverter.UnitConverter;

public class MiToYd extends UnitConverter{
    public MiToYd(){
        this.id = "miyd";
    }
    @Override
    public float convertedResult(float value) {
        return value*1609.344f ;
    }
}
