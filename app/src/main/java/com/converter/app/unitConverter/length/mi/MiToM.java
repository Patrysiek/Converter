package com.converter.app.unitConverter.length.mi;

import com.converter.app.unitConverter.UnitConverter;

public class MiToM extends UnitConverter{
    public MiToM(){
        this.id = "mim";
    }
    @Override
    public float convertedResult(float value) {
        return value*1609.344f ;
    }
}
