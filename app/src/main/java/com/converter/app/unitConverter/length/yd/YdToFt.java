package com.converter.app.unitConverter.length.yd;

import com.converter.app.unitConverter.UnitConverter;

public class YdToFt extends UnitConverter{
    public YdToFt(){
        this.id = "ydft";
    }
    @Override
    public float convertedResult(float value) {
        return value*3f ;
    }
}
