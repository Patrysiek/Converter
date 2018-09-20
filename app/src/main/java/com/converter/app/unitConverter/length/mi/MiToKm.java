package com.converter.app.unitConverter.length.mi;

import com.converter.app.unitConverter.UnitConverter;

public class MiToKm extends UnitConverter{
    public MiToKm(){
        this.id = "mikm";
    }
    @Override
    public float convertedResult(float value) {
        return value*1.6093f ;
    }
}
