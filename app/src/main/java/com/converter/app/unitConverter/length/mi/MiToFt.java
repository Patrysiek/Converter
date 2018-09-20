package com.converter.app.unitConverter.length.mi;

import com.converter.app.unitConverter.UnitConverter;

public class MiToFt extends UnitConverter{
    public MiToFt(){
        this.id = "mift";
    }
    @Override
    public float convertedResult(float value) {
        return value*5280f ;
    }
}
