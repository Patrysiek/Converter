package com.converter.app.unitConverter.length.km;

import com.converter.app.unitConverter.UnitConverter;

public class KmToFt extends UnitConverter{
    public KmToFt(){
        this.id = "kmft";
    }
    @Override
    public float convertedResult(float value) {
        return value*3280.8f ;
    }
}
