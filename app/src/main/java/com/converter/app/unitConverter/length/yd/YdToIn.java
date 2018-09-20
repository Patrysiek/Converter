package com.converter.app.unitConverter.length.yd;

import com.converter.app.unitConverter.UnitConverter;

public class YdToIn extends UnitConverter{
    public YdToIn(){
        this.id = "ydin";
    }
    @Override
    public float convertedResult(float value) {
        return value*36f ;
    }
}
