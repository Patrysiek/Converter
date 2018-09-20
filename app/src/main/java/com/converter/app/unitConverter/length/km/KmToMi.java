package com.converter.app.unitConverter.length.km;

import com.converter.app.unitConverter.UnitConverter;

public class KmToMi extends UnitConverter{
    public KmToMi(){
        this.id = "kmmi";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.62137f ;
    }
}
