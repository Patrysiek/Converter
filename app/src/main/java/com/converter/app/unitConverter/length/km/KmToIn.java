package com.converter.app.unitConverter.length.km;

import com.converter.app.unitConverter.UnitConverter;

public class KmToIn extends UnitConverter{
    public KmToIn(){
        this.id = "kmin";
    }
    @Override
    public float convertedResult(float value) {
        return value*39370f ;
    }
}
