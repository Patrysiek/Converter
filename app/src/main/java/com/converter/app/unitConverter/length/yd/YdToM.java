package com.converter.app.unitConverter.length.yd;

import com.converter.app.unitConverter.UnitConverter;

public class YdToM extends UnitConverter{
    public YdToM(){
        this.id = "ydm";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.9144f ;
    }
}
