package com.converter.app.unitConverter.length.yd;

import com.converter.app.unitConverter.UnitConverter;

public class YdToKm extends UnitConverter{
    public YdToKm(){
        this.id = "ydkm";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.0009f ;
    }
}
