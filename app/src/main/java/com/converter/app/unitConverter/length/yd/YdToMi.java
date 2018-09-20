package com.converter.app.unitConverter.length.yd;

import com.converter.app.unitConverter.UnitConverter;

public class YdToMi extends UnitConverter{
    public YdToMi(){
        this.id = "ydmi";
    }
    @Override
    public float convertedResult(float value) {
        return value*914.4f ;
    }
}
